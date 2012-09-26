/**
 * 
 */
package org.opennaas.extensions.router.capability.ospf.ws.wrapper;

import javax.xml.bind.annotation.XmlRootElement;

import org.opennaas.extensions.router.model.OSPFService;

/**
 * @author Jordi
 */
@XmlRootElement
public class ClearOSPFConfigurationRequest {

	private OSPFService	ospfService;

	/**
	 * @return the ospfService
	 */
	public OSPFService getOspfService() {
		return ospfService;
	}

	/**
	 * @param ospfService
	 *            the ospfService to set
	 */
	public void setOspfService(OSPFService ospfService) {
		this.ospfService = ospfService;
	}

}
