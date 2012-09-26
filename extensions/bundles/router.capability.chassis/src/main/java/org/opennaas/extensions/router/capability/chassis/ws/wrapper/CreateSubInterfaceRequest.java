/**
 * 
 */
package org.opennaas.extensions.router.capability.chassis.ws.wrapper;

import javax.xml.bind.annotation.XmlRootElement;

import org.opennaas.extensions.router.model.NetworkPort;

/**
 * @author Jordi
 */
@XmlRootElement
public class CreateSubInterfaceRequest {

	private NetworkPort	networkPort;

	/**
	 * @return the networkPort
	 */
	public NetworkPort getNetworkPort() {
		return networkPort;
	}

	/**
	 * @param networkPort
	 *            the networkPort to set
	 */
	public void setNetworkPort(NetworkPort networkPort) {
		this.networkPort = networkPort;
	}

}
