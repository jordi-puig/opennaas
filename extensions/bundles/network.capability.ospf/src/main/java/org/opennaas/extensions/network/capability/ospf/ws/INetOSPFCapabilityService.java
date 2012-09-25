package org.opennaas.extensions.network.capability.ospf.ws;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.extensions.network.capability.ospf.INetOSPFCapability;

@Path("/")
public interface INetOSPFCapabilityService extends INetOSPFCapability {

	/**
	 * Enable OSPF on the network.
	 * 
	 * 1) Configures OSPF in all routers of the network. </b> 2) Configures a backbone area in them. </b> 3) Add all interfaces on this routers to
	 * this area </b> 4) Enables OSPF in all routers </b>
	 * 
	 * @return
	 * @throws CapabilityException
	 */
	@POST
	@Path("/activate")
	public Response activateNetOSPF() throws CapabilityException;

	/**
	 * Disable OSPF on the network.
	 * 
	 * @return
	 * @throws CapabilityException
	 */
	@POST
	@Path("/deactivate")
	public Response deactivateNetOSPF() throws CapabilityException;
}