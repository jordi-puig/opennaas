package org.opennaas.extensions.network.capability.ospf.ws;

import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.core.resources.descriptor.CapabilityDescriptor;
import org.opennaas.extensions.network.capability.ospf.NetOSPFCapability;

public class NetOSPFCapabilityServiceImpl extends NetOSPFCapability implements INetOSPFCapabilityService {

	private static final Logger	LOGGER	= Logger.getLogger(NetOSPFCapabilityServiceImpl.class);

	/**
	 * @param descriptor
	 * @param resourceId
	 */
	public NetOSPFCapabilityServiceImpl(CapabilityDescriptor descriptor, String resourceId) {
		super(descriptor, resourceId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opennaas.extensions.network.capability.ospf.ws.INetOSPFCapabilityService#activateNetOSPF()
	 */
	@Override
	public Response activateNetOSPF() throws CapabilityException {
		LOGGER.info("Start activateNetOSPF service");
		activateOSPF();
		LOGGER.info("End of activateNetOSPF service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opennaas.extensions.network.capability.ospf.ws.INetOSPFCapabilityService#deactivateNetOSPF()
	 */
	@Override
	public Response deactivateNetOSPF() throws CapabilityException {
		LOGGER.info("Start deactivateNetOSPF service");
		deactivateOSPF();
		LOGGER.info("End of deactivateNetOSPF service");
		return Response.ok().build();
	}

}