/**
 * 
 */
package org.opennaas.extensions.router.capability.gretunnel.ws.wrapper;

import java.util.List;

import org.opennaas.extensions.router.model.GRETunnelService;

/**
 * @author Jordi
 * 
 */
public class ShowGRETunnelConfigResponse {

	private List<GRETunnelService>	greTunnelServices;

	/**
	 * @return the greTunnelServices
	 */
	public List<GRETunnelService> getGreTunnelServices() {
		return greTunnelServices;
	}

	/**
	 * @param greTunnelServices
	 *            the greTunnelServices to set
	 */
	public void setGreTunnelServices(List<GRETunnelService> greTunnelServices) {
		this.greTunnelServices = greTunnelServices;
	}

}
