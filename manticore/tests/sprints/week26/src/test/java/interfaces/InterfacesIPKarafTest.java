package interfaces;

import static org.ops4j.pax.exam.CoreOptions.mavenBundle;
import static org.ops4j.pax.exam.OptionUtils.combine;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import net.i2cat.mantychore.model.ComputerSystem;
import net.i2cat.mantychore.model.EthernetPort;
import net.i2cat.mantychore.model.IPProtocolEndpoint;
import net.i2cat.mantychore.model.LogicalDevice;
import net.i2cat.mantychore.model.LogicalTunnelPort;
import net.i2cat.mantychore.model.ProtocolEndpoint;
import net.i2cat.nexus.tests.IntegrationTestsHelper;
import net.i2cat.nexus.tests.KarafCommandHelper;
import net.i2cat.nexus.tests.ResourceHelper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.felix.service.command.CommandProcessor;
import org.apache.karaf.testing.AbstractIntegrationTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.opennaas.core.resources.IResource;
import org.opennaas.core.resources.IResourceManager;
import org.opennaas.core.resources.ResourceException;
import org.opennaas.core.resources.descriptor.ResourceDescriptor;
import org.opennaas.core.resources.helpers.ResourceDescriptorFactory;
import org.opennaas.core.resources.protocol.IProtocolManager;
import org.opennaas.core.resources.protocol.IProtocolSessionManager;
import org.opennaas.core.resources.protocol.ProtocolException;
import org.opennaas.core.resources.protocol.ProtocolSessionContext;
import org.ops4j.pax.exam.Customizer;
import org.ops4j.pax.exam.Inject;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.Configuration;
import org.ops4j.pax.exam.junit.JUnit4TestRunner;
import org.ops4j.pax.swissbox.tinybundles.core.TinyBundles;
import org.ops4j.pax.swissbox.tinybundles.dp.Constants;
import org.osgi.framework.BundleContext;

@RunWith(JUnit4TestRunner.class)
public class InterfacesIPKarafTest extends AbstractIntegrationTest {
	static Log					log				= LogFactory
														.getLog(InterfacesIPKarafTest.class);
	IResourceManager			resourceManager;
	String						resourceFriendlyID;
	IResource					resource;
	private CommandProcessor	commandprocessor;
	private boolean				isMock			= false;
	@Inject
	BundleContext				bundleContext	= null;

	public static Option[] configuration() throws Exception {

		Option[] options = combine(
				IntegrationTestsHelper.getMantychoreTestOptions(IntegrationTestsHelper.FELIX_CONTAINER),
				mavenBundle().groupId("net.i2cat.nexus").artifactId(
						"net.i2cat.nexus.tests.helper")
								// , vmOption("-Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005")
								// ////////import static org.ops4j.pax.exam.container.def.PaxRunnerOptions.vmOption;

								);

		return options;
	}

	@Configuration
	public Option[] additionalConfiguration() throws Exception {
		return combine(configuration(), new Customizer() {
			@Override
			public InputStream customizeTestProbe(InputStream testProbe) throws Exception {
				return TinyBundles.modifyBundle(testProbe).set(Constants.DYNAMICIMPORT_PACKAGE, "*,org.apache.felix.service.*;status=provisional")
						.build();
			}
		});
	}

	// @Before
	public void initBundles() {
		log.info("Waiting to load all bundles");
		/* Wait for the activation of all the bundles */
		IntegrationTestsHelper.waitForAllBundlesActive(bundleContext);
		log.info("Loaded all bundles");

		/* init capability */

		log.info("This is running inside Equinox. With all configuration set up like you specified. ");

		resourceManager = getOsgiService(IResourceManager.class);

		log.info("INFO: Initialized!");
		commandprocessor = getOsgiService(CommandProcessor.class);
		initTest();

	}

	public Boolean createProtocolForResource(String resourceId) throws ProtocolException {
		IProtocolManager protocolManager = getOsgiService(IProtocolManager.class, 5000);

		ProtocolSessionContext context = ResourceHelper.newSessionContextNetconf();
		IProtocolSessionManager protocolSessionManager = protocolManager.getProtocolSessionManagerWithContext(resourceId, context);

		if (context.getSessionParameters().get(context.PROTOCOL_URI).toString().contains("mock")) {
			return true;
		}

		return false;
	}

	public void clearRepo() throws ResourceException {
		for (IResource resource : resourceManager.listResources()) {
			resourceManager.removeResource(resource.getResourceIdentifier());
		}
	}

	// @After
	public void deleteResource() {
		try {
			resourceManager.stopResource(resource.getResourceIdentifier());
			resourceManager.removeResource(resource.getResourceIdentifier());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ResourceException e) {
			Assert.fail();
		}
		// Assert.assertTrue(resourceManager.listResources().isEmpty());

	}

	public void initTest() {

		List<String> capabilities = new ArrayList<String>();

		capabilities.add("ipv4");
		capabilities.add("queue");

		ResourceDescriptor resourceDescriptor = ResourceDescriptorFactory.newResourceDescriptor("junosm20", "router", capabilities);
		resourceFriendlyID = resourceDescriptor.getInformation().getType() + ":" + resourceDescriptor.getInformation().getName();
		try {
			clearRepo();
			resource = resourceManager.createResource(resourceDescriptor);
			isMock = createProtocolForResource(resource.getResourceIdentifier().getId());
			resourceManager.startResource(resource.getResourceIdentifier());

			// call the command to initialize the model
		} catch (ResourceException e) {
			Assert.fail(e.getMessage());
		} catch (ProtocolException e) {
			Assert.fail(e.getMessage());
		}

	}

	@Test
	public void setIPTest() {

		initBundles();

		// SEt LT
		String newIp = "192.168.1.6";
		String newMask = "255.255.255.0";

		// For Real Router Test
		// String inter = "lt-0/1/2";

		// For mock TEST
		String inter = "lt-0/1/2";
		String subport = "12";

		try {
			testingMethod(inter, subport, newIp, newMask);
		} catch (Exception e) {
			deleteResource();
			e.printStackTrace();
			Assert.fail(e.getLocalizedMessage());
		}

		// SEt ETH
		newIp = "192.168.1.4";
		newMask = "255.255.255.0";

		// For Real Router Test
		// inter = "fe-0/3/1";

		// For mock TEST
		inter = "fe-0/1/3";
		subport = "0";
		try {
			testingMethod(inter, subport, newIp, newMask);
		} catch (Exception e) {
			deleteResource();
			e.printStackTrace();
			Assert.fail(e.getLocalizedMessage());
		}

		// LO

		try {

			List<String> response = KarafCommandHelper.executeCommand("ipv4:setIP " + resourceFriendlyID + " lo0.1 192.168.1.1 255.255.255.0",
					commandprocessor);
			//
			// assert command output contains "[ERROR] Configuration for Loopback interface not allowed"
			// Assert.assertTrue(response.contains("[ERROR] Configuration for Loopback interface not allowed"));
			Assert.assertTrue(response.get(1).contains("[ERROR] Configuration for Loopback interface not allowed"));

		} catch (Exception e) {
			deleteResource();
			e.printStackTrace();
			Assert.fail(e.getLocalizedMessage());
		}

		deleteResource();
	}

	/**
	 * Configure a IP in a lt interface
	 *
	 */

	public void setIPlt() {
		String newIp = "192.168.1.6";
		String newMask = "255.255.255.0";
		String inter = "lt-0/1/2";
		String subport = "12";

		try {

			testingMethod(inter, subport, newIp, newMask);
		} catch (Exception e) {
			Assert.fail(e.getLocalizedMessage());
		}

		// SET LO
		try {

			List<String> response = KarafCommandHelper.executeCommand("ipv4:setIP " + resourceFriendlyID + " lo0.1 192.168.1.1 255.255.255.0",
					commandprocessor);
			//
			// assert command output contains "[ERROR] Configuration for Loopback interface not allowed"
			Assert.assertTrue(response.get(1).contains("[ERROR] Configuration for Loopback interface not allowed"));

		} catch (Exception e) {

			Assert.fail(e.getLocalizedMessage());
		}
	}

	/**
	 * Configure a IP in a ETh interface
	 *
	 */

	public void setIPETH() {

		initBundles();

		String newIp = "192.168.1.4";
		String newMask = "255.255.255.0";
		String inter = "fe-0/3/1";
		String subport = "0";

		try {

			testingMethod(inter, subport, newIp, newMask);

		} catch (Exception e) {
			deleteResource();
			log.info(e.getMessage());
			Assert.fail(e.getLocalizedMessage());
		}
		deleteResource();
	}

	public void testingMethod(String inter, String subport, String newIp, String newMask) throws Exception {
		// REFRESH to fill up the model
		List<String> response = KarafCommandHelper.executeCommand("ipv4:list " + resourceFriendlyID, commandprocessor);
		Assert.assertTrue(response.get(1).isEmpty());

		// Obtain the previous IP/MASK make the rollback of the test
		List<String> OldIPMask = getOldInterface(resource, inter, subport);
		// SET NEW IP
		response = KarafCommandHelper.executeCommand(
				"ipv4:setIP  " + resourceFriendlyID + " " + inter + "." + subport + " " + newIp + " " + newMask,
				commandprocessor);
		Assert.assertTrue(response.get(1).isEmpty());
		response = KarafCommandHelper.executeCommand("queue:execute  " + resourceFriendlyID, commandprocessor);
		Assert.assertTrue(response.get(1).isEmpty());

		// Check that the resource have the old IP configured in the model despite of have send the command
		checkModel(inter, subport, OldIPMask.get(0), OldIPMask.get(1), resource);

		// REFRESH to fill up the model
		response = KarafCommandHelper.executeCommand("ipv4:list " + resourceFriendlyID, commandprocessor);
		Assert.assertTrue(response.get(1).isEmpty());

		// CHECK CHANGES IN THE INTERFACE
		checkModel(inter, subport, newIp, newMask, resource);

		// ROLLBACK OF THE INTERFACE
		response = KarafCommandHelper.executeCommand(
				"ipv4:setIP  " + resourceFriendlyID + " " + inter + "." + subport + " " + OldIPMask.get(0) + " " + OldIPMask.get(1),
				commandprocessor);
		Assert.assertTrue(response.get(1).isEmpty());
		response = KarafCommandHelper.executeCommand("queue:execute  " + resourceFriendlyID, commandprocessor);
		Assert.assertTrue(response.get(1).isEmpty());

		// REFRESH
		response = KarafCommandHelper.executeCommand("ipv4:list " + resourceFriendlyID, commandprocessor);
		Assert.assertTrue(response.get(1).isEmpty());
		// CHECK THe ROLLBACK IS DONE
		checkModel(inter, subport, OldIPMask.get(0), OldIPMask.get(1), resource);

	}

	public void checkModel(String inter, String port, String Ip, String mask, IResource resource) {

		Boolean found = false;
		if (!isMock) {
			ComputerSystem system = (ComputerSystem) resource.getModel();
			List<LogicalDevice> ld = system.getLogicalDevices();
			Assert.assertNotNull(ld);
			for (LogicalDevice l : ld) {
				// Only check the modified interface
				if (l.getName().equalsIgnoreCase(inter)) {
					if (l instanceof EthernetPort) {
						EthernetPort eth = (EthernetPort) l;
						if (eth.getPortNumber() == Integer.parseInt(port)) {
							found = true;
							List<ProtocolEndpoint> pp = eth.getProtocolEndpoint();
							Assert.assertNotNull(pp);
							for (ProtocolEndpoint p : pp) {
								if (p instanceof IPProtocolEndpoint) {
									Assert.assertEquals(Ip, ((IPProtocolEndpoint) p).getIPv4Address());
									Assert.assertEquals(mask, ((IPProtocolEndpoint) p).getSubnetMask());
								}
							}
						}
					} else if (l instanceof LogicalTunnelPort) {
						LogicalTunnelPort lt = (LogicalTunnelPort) l;
						if (lt.getPortNumber() == Integer.parseInt(port)) {
							found = true;
							List<ProtocolEndpoint> pp = lt.getProtocolEndpoint();
							Assert.assertNotNull(pp);
							for (ProtocolEndpoint p : pp) {
								if (p instanceof IPProtocolEndpoint) {
									Assert.assertEquals(Ip, ((IPProtocolEndpoint) p).getIPv4Address());
									Assert.assertEquals(mask, ((IPProtocolEndpoint) p).getSubnetMask());
								}
							}

						}
					}

				}
			}
			// Look if exits the interface to be checked
			Assert.assertTrue(found);
		}
	}

	public List<String> getOldInterface(IResource resource, String inter, String port) {

		List<String> result = new ArrayList<String>();
		ComputerSystem system = (ComputerSystem) resource.getModel();
		List<LogicalDevice> ld = system.getLogicalDevices();
		Assert.assertNotNull(ld);
		for (LogicalDevice l : ld) {
			// Only check the modified interface
			if (l.getName().equalsIgnoreCase(inter)) {

				if (l instanceof EthernetPort) {
					EthernetPort eth = (EthernetPort) l;
					if (eth.getPortNumber() == Integer.parseInt(port)) {
						List<ProtocolEndpoint> pp = eth.getProtocolEndpoint();
						Assert.assertNotNull(pp);
						for (ProtocolEndpoint p : pp) {
							if (p instanceof IPProtocolEndpoint) {
								result.add(((IPProtocolEndpoint) p).getIPv4Address());
								result.add(((IPProtocolEndpoint) p).getSubnetMask());
							}
						}
					}
				} else if (l instanceof LogicalTunnelPort) {
					LogicalTunnelPort lt = (LogicalTunnelPort) l;
					if (lt.getPortNumber() == Integer.parseInt(port)) {
						List<ProtocolEndpoint> pp = lt.getProtocolEndpoint();
						Assert.assertNotNull(pp);
						for (ProtocolEndpoint p : pp) {
							if (p instanceof IPProtocolEndpoint) {
								result.add(((IPProtocolEndpoint) p).getIPv4Address());
								result.add(((IPProtocolEndpoint) p).getSubnetMask());
							}
						}

					}
				}
			}
		}
		Assert.assertFalse(result.isEmpty());
		Assert.assertNotNull(result);

		return result;

	}

}
