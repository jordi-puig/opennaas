package org.opennaas.extensions.router.capability.ospf.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.core.resources.capability.ICapability;
import org.opennaas.extensions.router.capability.ospf.ws.wrapper.AddInterfacesInOSPFAreaRequest;
import org.opennaas.extensions.router.capability.ospf.ws.wrapper.ClearOSPFConfigurationRequest;
import org.opennaas.extensions.router.capability.ospf.ws.wrapper.ConfifureOSPFRequest;
import org.opennaas.extensions.router.capability.ospf.ws.wrapper.ConfigureOSPFAreaRequest;
import org.opennaas.extensions.router.capability.ospf.ws.wrapper.DisableOSPFInterfacesRequest;
import org.opennaas.extensions.router.capability.ospf.ws.wrapper.EnableOSPFInterfacesRequest;
import org.opennaas.extensions.router.capability.ospf.ws.wrapper.RemoveInterfacesInOSPFAreaRequest;
import org.opennaas.extensions.router.capability.ospf.ws.wrapper.RemoveOSPFAreaRequest;

/**
 * @author Jordi Puig
 * @author Isart Canyameres
 */
@Path("/")
public interface IOSPFCapabilityService extends ICapability {

	/**
	 * Enable OSPF on the router.
	 * 
	 * @return
	 * 
	 * @throws CapabilityException
	 */
	@Path("/activateOSPF")
	@POST
	public Response _activateOSPF() throws CapabilityException;

	/**
	 * Disable OSPF on the router.
	 * 
	 * @return
	 * 
	 * @throws CapabilityException
	 */
	@Path("/deactivateOSPF")
	@POST
	public Response _deactivateOSPF() throws CapabilityException;

	/**
	 * Configure OSPF service.
	 * 
	 * This configuration applies to the OSPF Service itself, but does not affect areas nor interfaces.
	 * 
	 * @param ospfService
	 * @throws CapabilityException
	 */
	@Path("/configureOSPF")
	@Consumes(MediaType.APPLICATION_XML)
	@POST
	public Response configureOSPF(ConfifureOSPFRequest request) throws CapabilityException;

	/**
	 * Removes all OSPF configuration.
	 * 
	 * @param ospfService
	 * @throws CapabilityException
	 */
	@Path("/clearOSPFconfiguration")
	@Consumes(MediaType.APPLICATION_XML)
	@POST
	public Response clearOSPFconfiguration(ClearOSPFConfigurationRequest request) throws CapabilityException;

	/**
	 * Configures an OSPF area.
	 * 
	 * @param ospfAreaConfiguration
	 * @throws CapabilityException
	 */
	@Path("/configureOSPFArea")
	@Consumes(MediaType.APPLICATION_XML)
	@POST
	public Response configureOSPFArea(ConfigureOSPFAreaRequest request) throws CapabilityException;

	/**
	 * Remove an OSPF area.
	 * 
	 * @param ospfAreaConfiguration
	 * @throws CapabilityException
	 */
	@Path("/removeOSPFArea")
	@Consumes(MediaType.APPLICATION_XML)
	@POST
	public Response removeOSPFArea(RemoveOSPFAreaRequest request) throws CapabilityException;

	/**
	 * Adds given interfaces to given OSPF area
	 * 
	 * @param addInterfacesOSPFRequest
	 * @throws CapabilityException
	 */
	@Path("/addInterfacesInOSPFArea")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response addInterfacesInOSPFArea(AddInterfacesInOSPFAreaRequest request)
			throws CapabilityException;

	/**
	 * Remove given interfaces from given OSPF area
	 * 
	 * @param removeInterfacesOSPFRequest
	 * @throws CapabilityException
	 */
	@Path("/removeInterfacesInOSPFArea")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response removeInterfacesInOSPFArea(RemoveInterfacesInOSPFAreaRequest removeInterfacesInOSPFAreaRequest)
			throws CapabilityException;

	/**
	 * Enable OSPF in given interfaces, if they are already configured.
	 * 
	 * @param interfaces
	 * @throws CapabilityException
	 */
	@Path("/enableOSPFInterfaces")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response enableOSPFInterfaces(EnableOSPFInterfacesRequest request) throws CapabilityException;

	/**
	 * Disable OSPF in given interfaces, if they are already configured.
	 * 
	 * @param interfaces
	 * @throws CapabilityException
	 */
	@Path("/disableOSPFInterfaces")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response disableOSPFInterfaces(DisableOSPFInterfacesRequest request) throws CapabilityException;

	/**
	 * Returns OSPF full configuration from the router
	 * 
	 * This includes service, areas, and interface status.
	 * 
	 * @throws CapabilityException
	 */
	@Path("/getOSPFConfiguration")
	@POST
	public Response _getOSPFConfiguration() throws CapabilityException;

}
