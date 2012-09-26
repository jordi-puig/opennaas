/**
 * 
 */
package org.opennaas.extensions.router.capability.chassis.ws.wrapper;

import javax.xml.bind.annotation.XmlRootElement;

import org.opennaas.extensions.router.model.LogicalPort;

/**
 * @author Jordi
 * 
 */
@XmlRootElement
public class UpPhysicalIfaceRequest {

	private LogicalPort	logicalPort;

	/**
	 * @return the logicalPort
	 */
	public LogicalPort getLogicalPort() {
		return logicalPort;
	}

	/**
	 * @param logicalPort
	 *            the logicalPort to set
	 */
	public void setLogicalPort(LogicalPort logicalPort) {
		this.logicalPort = logicalPort;
	}

}
