package org.opennaas.client.rest;

import java.io.FileNotFoundException;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.opennaas.extensions.router.capability.staticroute.ws.wrapper.CreateStaticRouteRequest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class StaticRouteTest {

	private static final Logger	LOGGER	= Logger.getLogger(NetOSPFTest.class);

	public static void main(String[] args) throws FileNotFoundException, JAXBException {
		create();
	}

	/**
	 * 
	 */
	private static void create() {
		ClientResponse response = null;
		String url = "http://localhost:8888/opennaas/router/lolaM20/staticroute/createStaticRoute";
		try {
			Client client = Client.create();
			WebResource webResource = client.resource(url);
			CreateStaticRouteRequest request = new CreateStaticRouteRequest();
			request.setNetIdIpAdress("192.0.0.1");
			request.setMaskIpAdress("128.0.0.1");
			request.setNextHopIpAddress("0.0.0.0");
			response = webResource.type(MediaType.APPLICATION_XML).post(ClientResponse.class, request);
			LOGGER.info("Response code: " + response.getStatus());
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}
}