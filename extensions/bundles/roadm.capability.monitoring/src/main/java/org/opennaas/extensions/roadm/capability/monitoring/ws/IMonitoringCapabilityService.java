package org.opennaas.extensions.roadm.capability.monitoring.ws;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.extensions.roadm.capability.monitoring.IMonitoringCapability;

@Path("/")
public interface IMonitoringCapabilityService extends IMonitoringCapability {

	/**
	 * Clear the alarms of the resource
	 * 
	 * @throws CapabilityException
	 */
	@Path("/clearAlarms")
	@POST
	@Produces(MediaType.APPLICATION_XML)
	public Response _clearAlarms() throws CapabilityException;

}
