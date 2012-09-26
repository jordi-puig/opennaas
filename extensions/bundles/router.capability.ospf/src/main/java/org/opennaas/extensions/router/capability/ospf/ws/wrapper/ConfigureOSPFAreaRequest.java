/**
 * 
 */
package org.opennaas.extensions.router.capability.ospf.ws.wrapper;

import javax.xml.bind.annotation.XmlRootElement;

import org.opennaas.extensions.router.model.OSPFAreaConfiguration;

/**
 * @author Jordi
 */
@XmlRootElement
public class ConfigureOSPFAreaRequest {

	private OSPFAreaConfiguration	ospfAreaConfiguration;

	/**
	 * @return the ospfAreaConfiguration
	 */
	public OSPFAreaConfiguration getOspfAreaConfiguration() {
		return ospfAreaConfiguration;
	}

	/**
	 * @param ospfAreaConfiguration
	 *            the ospfAreaConfiguration to set
	 */
	public void setOspfAreaConfiguration(OSPFAreaConfiguration ospfAreaConfiguration) {
		this.ospfAreaConfiguration = ospfAreaConfiguration;
	}

}
