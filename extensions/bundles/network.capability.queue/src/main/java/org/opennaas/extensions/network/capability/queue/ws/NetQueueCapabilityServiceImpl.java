package org.opennaas.extensions.network.capability.queue.ws;

import java.util.Map;

import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.core.resources.descriptor.CapabilityDescriptor;
import org.opennaas.core.resources.queue.QueueResponse;
import org.opennaas.extensions.network.capability.queue.QueueCapability;
import org.opennaas.extensions.network.capability.queue.ws.wrappers.ExecuteQueueResponse;

/**
 * @author Jordi Puig
 */
public class NetQueueCapabilityServiceImpl extends QueueCapability implements IQueueCapabilityService {

	private static final Logger	LOGGER	= Logger.getLogger(NetQueueCapabilityServiceImpl.class);

	/**
	 * @param descriptor
	 * @param resourceId
	 */
	public NetQueueCapabilityServiceImpl(CapabilityDescriptor descriptor, String resourceId) {
		super(descriptor, resourceId);
	}

	/**
	 * @return
	 * @throws CapabilityException
	 */
	@Override
	public Response executeNetQueue() throws CapabilityException {
		LOGGER.info("Start executeNetQueue service");
		Map<String, QueueResponse> queueResponses = execute();
		ExecuteQueueResponse response = new ExecuteQueueResponse();
		response.setResponse(queueResponses);
		LOGGER.info("End of executeNetQueue service");
		return Response.ok(response).build();
	}
}
