package org.opennaas.extensions.router.capability.staticroute.ws;

import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.core.resources.descriptor.CapabilityDescriptor;
import org.opennaas.extensions.router.capability.staticroute.StaticRouteCapability;
import org.opennaas.extensions.router.capability.staticroute.ws.wrapper.CreateStaticRouteRequest;

/**
 * @author Jordi Puig
 */
public class StaticRouteCapabilityServiceImpl extends StaticRouteCapability implements IStaticRouteCapabilityService {

	private static final Logger	LOGGER	= Logger.getLogger(StaticRouteCapabilityServiceImpl.class);

	/**
	 * @param descriptor
	 * @param resourceId
	 */
	public StaticRouteCapabilityServiceImpl(CapabilityDescriptor descriptor, String resourceId) {
		super(descriptor, resourceId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.staticroute.ws.IStaticRouteCapabilityService#createStaticRoute(org.opennaas.extensions.router.capability
	 * .staticroute.ws.wrapper.CreateStaticRouteRequest)
	 */
	@Override
	public Response createStaticRoute(CreateStaticRouteRequest request) throws CapabilityException {
		LOGGER.info("Start createStaticRoute service");
		createStaticRoute(request.getNetIdIpAdress(), request.getMaskIpAdress(), request.getNextHopIpAddress());
		LOGGER.info("End of createStaticRoute service");
		return Response.ok().build();
	}

}
