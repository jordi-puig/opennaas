package org.opennaas.client.rest;

import java.io.FileNotFoundException;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.opennaas.extensions.router.capability.gretunnel.ws.wrapper.CreateGRETunnelRequest;
import org.opennaas.extensions.router.capability.gretunnel.ws.wrapper.DeleteGRETunnelRequest;
import org.opennaas.extensions.router.model.EnabledLogicalElement.EnabledState;
import org.opennaas.extensions.router.model.GRETunnelConfiguration;
import org.opennaas.extensions.router.model.GRETunnelService;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class GRETunnelTest {

	private static final Logger	LOGGER	= Logger.getLogger(GRETunnelTest.class);

	public static void main(String[] args) throws FileNotFoundException, JAXBException {
		createGRETunnel();
		deleteGRETunnel();
		showGRETunnelConfiguration();
	}

	/**
	 * 
	 */
	private static void createGRETunnel() {
		ClientResponse response = null;
		String url = "http://localhost:8888/opennaas/router/lolaM20/gretunnel/createGRETunnel";
		try {
			Client client = Client.create();
			WebResource webResource = client.resource(url);
			CreateGRETunnelRequest request = new CreateGRETunnelRequest();
			request.setGreTunnelService(getGRETunnelService());
			response = webResource.type(MediaType.APPLICATION_XML).post(ClientResponse.class, request);
			LOGGER.info("Response code: " + response.getStatus());
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}

	/**
	 * 
	 */
	private static void deleteGRETunnel() {
		ClientResponse response = null;
		String url = "http://localhost:8888/opennaas/router/lolaM20/gretunnel/deleteGRETunnel";
		try {
			Client client = Client.create();
			WebResource webResource = client.resource(url);
			DeleteGRETunnelRequest request = new DeleteGRETunnelRequest();
			request.setGreTunnelService(getGRETunnelService());
			response = webResource.type(MediaType.APPLICATION_XML).post(ClientResponse.class, request);
			LOGGER.info("Response code: " + response.getStatus());
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}

	/**
	 * 
	 */
	private static void showGRETunnelConfiguration() {
		ClientResponse response = null;
		String url = "http://localhost:8888/opennaas/router/lolaM20/gretunnel/showGRETunnelConfiguration";
		try {
			Client client = Client.create();
			WebResource webResource = client.resource(url);
			response = webResource.accept(MediaType.APPLICATION_XML).post(ClientResponse.class);
			LOGGER.info("Response code: " + response.getStatus());
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}

	/**
	 * @return
	 */
	private static GRETunnelService getGRETunnelService() {
		GRETunnelService greTunnelService = new GRETunnelService();
		greTunnelService.setName("MyTunnelService");
		greTunnelService.setEnabledState(EnabledState.OTHER);
		GRETunnelConfiguration greTunnelConfiguration = new GRETunnelConfiguration();
		greTunnelConfiguration.setCaption("MyCaption");
		greTunnelConfiguration.setInstanceID("MyInstanceId");
		greTunnelService.setGRETunnelConfiguration(greTunnelConfiguration);
		return greTunnelService;
	}

}