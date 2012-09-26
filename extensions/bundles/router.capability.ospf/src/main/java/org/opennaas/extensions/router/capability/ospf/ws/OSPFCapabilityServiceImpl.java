package org.opennaas.extensions.router.capability.ospf.ws;

import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.core.resources.descriptor.CapabilityDescriptor;
import org.opennaas.extensions.router.capability.ospf.OSPFCapability;
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
 */
public class OSPFCapabilityServiceImpl extends OSPFCapability implements IOSPFCapabilityService {

	private static final Logger	LOGGER	= Logger.getLogger(OSPFCapabilityServiceImpl.class);

	/**
	 * @param descriptor
	 * @param resourceId
	 */
	public OSPFCapabilityServiceImpl(CapabilityDescriptor descriptor, String resourceId) {
		super(descriptor, resourceId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opennaas.extensions.router.capability.ospf.ws.IOSPFCapabilityService#_activateOSPF()
	 */
	@Override
	public Response _activateOSPF() throws CapabilityException {
		LOGGER.info("Start activateOSPF service");
		activateOSPF();
		LOGGER.info("End of activateOSPF service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opennaas.extensions.router.capability.ospf.ws.IOSPFCapabilityService#_deactivateOSPF()
	 */
	@Override
	public Response _deactivateOSPF() throws CapabilityException {
		LOGGER.info("Start deactivateOSPF service");
		deactivateOSPF();
		LOGGER.info("End of deactivateOSPF service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.ospf.ws.IOSPFCapabilityService#configureOSPF(org.opennaas.extensions.router.capability.ospf.ws.wrapper
	 * .ConfifureOSPFRequest)
	 */
	@Override
	public Response configureOSPF(ConfifureOSPFRequest request) throws CapabilityException {
		LOGGER.info("Start deactivateOSPF service");
		configureOSPF(request.getOspfService());
		LOGGER.info("End of deactivateOSPF service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.ospf.ws.IOSPFCapabilityService#clearOSPFconfiguration(org.opennaas.extensions.router.capability.ospf
	 * .ws.wrapper.ClearOSPFconfigurationRequest)
	 */
	@Override
	public Response clearOSPFconfiguration(ClearOSPFConfigurationRequest request) throws CapabilityException {
		LOGGER.info("Start clearOSPFconfiguration service");
		clearOSPFconfiguration(request.getOspfService());
		LOGGER.info("End of clearOSPFconfiguration service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.ospf.ws.IOSPFCapabilityService#configureOSPFArea(org.opennaas.extensions.router.capability.ospf.ws
	 * .wrapper.ConfigureOSPFAreaRequest)
	 */
	@Override
	public Response configureOSPFArea(ConfigureOSPFAreaRequest request) throws CapabilityException {
		LOGGER.info("Start configureOSPFArea service");
		configureOSPFArea(request.getOspfAreaConfiguration());
		LOGGER.info("End of configureOSPFArea service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.ospf.ws.IOSPFCapabilityService#removeOSPFArea(org.opennaas.extensions.router.capability.ospf.ws.wrapper
	 * .RemoveOSPFAreaRequest)
	 */
	@Override
	public Response removeOSPFArea(RemoveOSPFAreaRequest request) throws CapabilityException {
		LOGGER.info("Start removeOSPFArea service");
		removeOSPFArea(request.getOspfAreaConfiguration());
		LOGGER.info("End of removeOSPFArea service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.ospf.ws.IOSPFCapabilityService#enableOSPFInterfaces(org.opennaas.extensions.router.capability.ospf
	 * .ws.wrapper.EnableOSPFInterfacesRequest)
	 */
	@Override
	public Response enableOSPFInterfaces(EnableOSPFInterfacesRequest request) throws CapabilityException {
		LOGGER.info("Start enableOSPFInterfaces service");
		enableOSPFInterfaces(request.getListProtocolEndpoints());
		LOGGER.info("End of enableOSPFInterfaces service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.ospf.ws.IOSPFCapabilityService#disableOSPFInterfaces(org.opennaas.extensions.router.capability.ospf
	 * .ws.wrapper.DisableOSPFInterfacesRequest)
	 */
	@Override
	public Response disableOSPFInterfaces(DisableOSPFInterfacesRequest request) throws CapabilityException {
		LOGGER.info("Start disableOSPFInterfaces service");
		disableOSPFInterfaces(request.getListProtocolEndpoints());
		LOGGER.info("End of disableOSPFInterfaces service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opennaas.extensions.router.capability.ospf.ws.IOSPFCapabilityService#_getOSPFConfiguration()
	 */
	@Override
	public Response _getOSPFConfiguration() throws CapabilityException {
		LOGGER.info("Start getOSPFConfiguration service");
		getOSPFConfiguration();
		LOGGER.info("End of getOSPFConfiguration service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.ospf.ws.IOSPFCapabilityService#addInterfacesInOSPFArea(org.opennaas.extensions.router.model.wrappers
	 * .AddInterfacesInOSPFAreaRequest)
	 */
	@Override
	public Response addInterfacesInOSPFArea(AddInterfacesInOSPFAreaRequest request) throws CapabilityException {
		LOGGER.info("Start addInterfacesInOSPFArea service");
		addInterfacesInOSPFArea(request.getInterfaces(), request.getOspfArea());
		LOGGER.info("End of addInterfacesInOSPFArea service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.ospf.ws.IOSPFCapabilityService#removeInterfacesInOSPFArea(org.opennaas.extensions.router.model.wrappers
	 * .RemoveInterfacesInOSPFAreaRequest)
	 */
	@Override
	public Response removeInterfacesInOSPFArea(RemoveInterfacesInOSPFAreaRequest request) throws CapabilityException {
		LOGGER.info("Start removeInterfacesInOSPFArea service");
		removeInterfacesInOSPFArea(request.getInterfaces(), request.getOspfArea());
		LOGGER.info("End of removeInterfacesInOSPFArea service");
		return Response.ok().build();
	}

}
