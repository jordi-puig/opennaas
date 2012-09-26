package org.opennaas.extensions.router.capability.staticroute.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.core.resources.capability.ICapability;
import org.opennaas.extensions.router.capability.staticroute.ws.wrapper.CreateStaticRouteRequest;

/**
 * @author Jordi Puig
 */
@Path("/")
public interface IStaticRouteCapabilityService extends ICapability {

	/**
	 * Create a static route in the router
	 * 
	 * @return
	 * @throws CapabilityException
	 */
	@POST
	@Path("/createStaticRoute")
	@Consumes(MediaType.APPLICATION_XML)
	public Response createStaticRoute(CreateStaticRouteRequest request) throws CapabilityException;

}
