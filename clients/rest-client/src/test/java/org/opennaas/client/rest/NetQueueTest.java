package org.opennaas.client.rest;

import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class NetQueueTest {

	private static final Logger	LOGGER	= Logger.getLogger(NetQueueTest.class);

	public static void main(String[] args) {
		execute();
	}

	/**
	 * 
	 */
	private static void execute() {
		String url = "http://localhost:8888/opennaas/network/networkdemo/netqueue/execute";
		try {
			Client client = Client.create();
			WebResource webResource = client.resource(url);
			ClientResponse response = webResource.type(MediaType.APPLICATION_XML).post(ClientResponse.class);
			LOGGER.info("Response code: " + response.toString());
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}
}