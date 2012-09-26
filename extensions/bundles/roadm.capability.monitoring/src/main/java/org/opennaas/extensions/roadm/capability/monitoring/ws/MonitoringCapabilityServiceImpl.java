package org.opennaas.extensions.roadm.capability.monitoring.ws;

import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.core.resources.descriptor.CapabilityDescriptor;
import org.opennaas.extensions.roadm.capability.monitoring.MonitoringCapability;

public class MonitoringCapabilityServiceImpl extends MonitoringCapability implements IMonitoringCapabilityService {

	private static final Logger	LOGGER	= Logger.getLogger(MonitoringCapabilityServiceImpl.class);

	/**
	 * @param descriptor
	 * @param resourceId
	 */
	public MonitoringCapabilityServiceImpl(CapabilityDescriptor descriptor, String resourceId) {
		super(descriptor, resourceId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opennaas.extensions.roadm.capability.monitoring.ws.IMonitoringCapabilityService#_clearAlarms()
	 */
	@Override
	public Response _clearAlarms() throws CapabilityException {
		LOGGER.info("Start clearAlarms service");
		clearAlarms();
		LOGGER.info("End of clearAlarms service");
		return Response.ok().build();
	}

}
