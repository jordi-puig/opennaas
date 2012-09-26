/**
 * 
 */
package org.opennaas.extensions.router.capability.chassis.ws.wrapper;

import javax.xml.bind.annotation.XmlRootElement;

import org.opennaas.extensions.router.model.ComputerSystem;

/**
 * @author Jordi
 */
@XmlRootElement
public class CreateLogicalRouterRequest {

	private ComputerSystem	computerSystem;

	/**
	 * @return the computerSystem
	 */
	public ComputerSystem getComputerSystem() {
		return computerSystem;
	}

	/**
	 * @param computerSystem
	 *            the computerSystem to set
	 */
	public void setComputerSystem(ComputerSystem computerSystem) {
		this.computerSystem = computerSystem;
	}

}
