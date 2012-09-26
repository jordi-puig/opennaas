package org.opennaas.extensions.roadm.capability.connections.ws;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.extensions.roadm.capability.connections.IConnectionsCapability;
import org.opennaas.extensions.roadm.capability.connections.ws.wrapper.MakeConnectionRequest;
import org.opennaas.extensions.roadm.capability.connections.ws.wrapper.RemoveConnectionRequest;

@Path("/")
public interface IConnectionsCapabilityService extends IConnectionsCapability {

	@Path("/makeConnection")
	@POST
	@Produces(MediaType.APPLICATION_XML)
	public Response makeConnection(MakeConnectionRequest request) throws CapabilityException;

	@Path("/removeConnection")
	@POST
	@Produces(MediaType.APPLICATION_XML)
	public Response removeConnection(RemoveConnectionRequest request) throws CapabilityException;

}
