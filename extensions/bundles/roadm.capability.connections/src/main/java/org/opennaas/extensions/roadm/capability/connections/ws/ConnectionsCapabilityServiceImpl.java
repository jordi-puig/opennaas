package org.opennaas.extensions.roadm.capability.connections.ws;

import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.core.resources.descriptor.CapabilityDescriptor;
import org.opennaas.extensions.roadm.capability.connections.ConnectionsCapability;
import org.opennaas.extensions.roadm.capability.connections.ws.wrapper.MakeConnectionRequest;
import org.opennaas.extensions.roadm.capability.connections.ws.wrapper.RemoveConnectionRequest;

public class ConnectionsCapabilityServiceImpl extends ConnectionsCapability implements IConnectionsCapabilityService {

	private static final Logger	LOGGER	= Logger.getLogger(ConnectionsCapabilityServiceImpl.class);

	/**
	 * @param descriptor
	 * @param resourceId
	 */
	public ConnectionsCapabilityServiceImpl(CapabilityDescriptor descriptor, String resourceId) {
		super(descriptor, resourceId);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.roadm.capability.connections.ws.IConnectionsCapabilityService#makeConnection(org.opennaas.extensions.roadm.capability
	 * .connections.ws.wrapper.MakeConnectionRequest)
	 */
	@Override
	public Response makeConnection(MakeConnectionRequest request) throws CapabilityException {
		LOGGER.info("Start makeConnection service");
		makeConnection(request.getFiberConnection());
		LOGGER.info("End of makeConnection service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.roadm.capability.connections.ws.IConnectionsCapabilityService#removeConnection(org.opennaas.extensions.roadm.capability
	 * .connections.ws.wrapper.RemoveConnectionRequest)
	 */
	@Override
	public Response removeConnection(RemoveConnectionRequest request) throws CapabilityException {
		LOGGER.info("Start removeConnection service");
		removeConnection(request.getFiberConnection());
		LOGGER.info("End of removeConnection service");
		return Response.ok().build();
	}

}
