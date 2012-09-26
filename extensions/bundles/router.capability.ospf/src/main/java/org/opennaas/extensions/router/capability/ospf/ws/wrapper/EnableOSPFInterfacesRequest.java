/**
 * 
 */
package org.opennaas.extensions.router.capability.ospf.ws.wrapper;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.opennaas.extensions.router.model.OSPFProtocolEndpoint;

/**
 * @author Jordi
 */
@XmlRootElement
public class EnableOSPFInterfacesRequest {

	private List<OSPFProtocolEndpoint>	listProtocolEndpoints;

	/**
	 * @return the listProtocolEndpoints
	 */
	public List<OSPFProtocolEndpoint> getListProtocolEndpoints() {
		return listProtocolEndpoints;
	}

	/**
	 * @param listProtocolEndpoints
	 *            the listProtocolEndpoints to set
	 */
	public void setListProtocolEndpoints(List<OSPFProtocolEndpoint> listProtocolEndpoints) {
		this.listProtocolEndpoints = listProtocolEndpoints;
	}

}
