package org.opennaas.extensions.network.capability.queue.ws;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.core.resources.capability.ICapability;

/**
 * @author Jordi Puig
 */
@Path("/")
public interface IQueueCapabilityService extends ICapability {

	/**
	 * This action will execute each resource queue
	 * 
	 * @return the queue response
	 * @throws CapabilityException
	 */
	@Path("/execute")
	@POST
	@Produces(MediaType.APPLICATION_XML)
	public Response executeNetQueue() throws CapabilityException;

}