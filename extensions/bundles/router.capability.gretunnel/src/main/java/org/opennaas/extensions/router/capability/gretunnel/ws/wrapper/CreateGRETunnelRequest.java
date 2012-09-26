/**
 * 
 */
package org.opennaas.extensions.router.capability.gretunnel.ws.wrapper;

import javax.xml.bind.annotation.XmlRootElement;

import org.opennaas.extensions.router.model.GRETunnelService;

/**
 * @author Jordi
 * 
 */
@XmlRootElement
public class CreateGRETunnelRequest {

	private GRETunnelService	greTunnelService;

	/**
	 * @return the greTunnelService
	 */
	public GRETunnelService getGreTunnelService() {
		return greTunnelService;
	}

	/**
	 * @param greTunnelService
	 *            the greTunnelService to set
	 */
	public void setGreTunnelService(GRETunnelService greTunnelService) {
		this.greTunnelService = greTunnelService;
	}

}
