/**
 * 
 */
package org.opennaas.extensions.roadm.capability.connections.ws.wrapper;

import org.opennaas.extensions.router.model.opticalSwitch.FiberConnection;

/**
 * @author Jordi
 */
public class MakeConnectionRequest {

	private FiberConnection	fiberConnection;

	/**
	 * @return the fiberConnection
	 */
	public FiberConnection getFiberConnection() {
		return fiberConnection;
	}

	/**
	 * @param fiberConnection
	 *            the fiberConnection to set
	 */
	public void setFiberConnection(FiberConnection fiberConnection) {
		this.fiberConnection = fiberConnection;
	}

}
