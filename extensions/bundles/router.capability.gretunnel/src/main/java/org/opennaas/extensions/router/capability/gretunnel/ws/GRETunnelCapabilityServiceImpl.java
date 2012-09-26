package org.opennaas.extensions.router.capability.gretunnel.ws;

import java.util.List;

import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.core.resources.descriptor.CapabilityDescriptor;
import org.opennaas.extensions.router.capability.gretunnel.GRETunnelCapability;
import org.opennaas.extensions.router.capability.gretunnel.ws.wrapper.CreateGRETunnelRequest;
import org.opennaas.extensions.router.capability.gretunnel.ws.wrapper.DeleteGRETunnelRequest;
import org.opennaas.extensions.router.capability.gretunnel.ws.wrapper.ShowGRETunnelConfigResponse;
import org.opennaas.extensions.router.model.GRETunnelService;

/**
 * @author Jordi
 * 
 */
public class GRETunnelCapabilityServiceImpl extends GRETunnelCapability implements IGRETunnelCapabilityService {

	private static final Logger	LOGGER	= Logger.getLogger(GRETunnelCapabilityServiceImpl.class);

	/**
	 * @param descriptor
	 * @param resourceID
	 */
	public GRETunnelCapabilityServiceImpl(CapabilityDescriptor descriptor, String resourceID) {
		super(descriptor, resourceID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.gretunnel.ws.IGRETunnelCapabilityService#createGRETunnel(org.opennaas.extensions.router.capability
	 * .gretunnel.ws.wrapper.CreateGRETunnelRequest)
	 */
	@Override
	public Response createGRETunnel(CreateGRETunnelRequest request) throws CapabilityException {
		LOGGER.info("Start createGRETunnel service");
		createGRETunnel(request.getGreTunnelService());
		LOGGER.info("End of createGRETunnel service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.gretunnel.ws.IGRETunnelCapabilityService#deleteGRETunnel(org.opennaas.extensions.router.capability
	 * .gretunnel.ws.wrapper.DeleteGRETunnelRequest)
	 */
	@Override
	public Response deleteGRETunnel(DeleteGRETunnelRequest request) throws CapabilityException {
		LOGGER.info("Start deleteGRETunnel service");
		deleteGRETunnel(request.getGreTunnelService());
		LOGGER.info("End of deleteGRETunnel service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opennaas.extensions.router.capability.gretunnel.ws.IGRETunnelCapabilityService#showGRETunnelConfig()
	 */
	@Override
	public Response showGRETunnelConfig() throws CapabilityException {
		LOGGER.info("Start showGRETunnelConfig service");
		List<GRETunnelService> services = showGRETunnelConfiguration();
		ShowGRETunnelConfigResponse response = new ShowGRETunnelConfigResponse();
		response.setGreTunnelServices(services);
		LOGGER.info("End of showGRETunnelConfig service");
		return Response.ok(response).build();
	}
}
