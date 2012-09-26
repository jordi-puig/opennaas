/**
 * 
 */
package org.opennaas.extensions.router.capability.staticroute.ws.wrapper;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Jordi
 */
@XmlRootElement
public class CreateStaticRouteRequest {

	private String	netIdIpAdress;
	private String	maskIpAdress;
	private String	nextHopIpAddress;

	/**
	 * @return the netIdIpAdress
	 */
	public String getNetIdIpAdress() {
		return netIdIpAdress;
	}

	/**
	 * @param netIdIpAdress
	 *            the netIdIpAdress to set
	 */
	public void setNetIdIpAdress(String netIdIpAdress) {
		this.netIdIpAdress = netIdIpAdress;
	}

	/**
	 * @return the maskIpAdress
	 */
	public String getMaskIpAdress() {
		return maskIpAdress;
	}

	/**
	 * @param maskIpAdress
	 *            the maskIpAdress to set
	 */
	public void setMaskIpAdress(String maskIpAdress) {
		this.maskIpAdress = maskIpAdress;
	}

	/**
	 * @return the nextHopIpAddress
	 */
	public String getNextHopIpAddress() {
		return nextHopIpAddress;
	}

	/**
	 * @param nextHopIpAddress
	 *            the nextHopIpAddress to set
	 */
	public void setNextHopIpAddress(String nextHopIpAddress) {
		this.nextHopIpAddress = nextHopIpAddress;
	}

}
