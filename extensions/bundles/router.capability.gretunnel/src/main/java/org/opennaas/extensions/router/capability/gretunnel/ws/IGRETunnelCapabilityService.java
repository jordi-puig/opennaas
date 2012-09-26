package org.opennaas.extensions.router.capability.gretunnel.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.extensions.router.capability.gretunnel.IGRETunnelCapability;
import org.opennaas.extensions.router.capability.gretunnel.ws.wrapper.CreateGRETunnelRequest;
import org.opennaas.extensions.router.capability.gretunnel.ws.wrapper.DeleteGRETunnelRequest;

/**
 * @author Jordi Puig
 */
@Path("/")
public interface IGRETunnelCapabilityService extends IGRETunnelCapability {

	/**
	 * Create a GRETunnel on the router
	 * 
	 * @throws CapabilityException
	 */
	@POST
	@Path("/createGRETunnel")
	@Consumes(MediaType.APPLICATION_XML)
	public Response createGRETunnel(CreateGRETunnelRequest request) throws CapabilityException;

	/**
	 * Delete GRETunnel.
	 * 
	 * @throws CapabilityException
	 */
	@POST
	@Path("/deleteGRETunnel")
	@Consumes(MediaType.APPLICATION_XML)
	public Response deleteGRETunnel(DeleteGRETunnelRequest request) throws CapabilityException;

	/**
	 * Show the GRETunnel configuration.
	 * 
	 * @return GRETunnelService
	 * @throws CapabilityException
	 */
	@POST
	@Path("/showGRETunnelConfiguration")
	@Produces(MediaType.APPLICATION_XML)
	public Response showGRETunnelConfig() throws CapabilityException;
}
