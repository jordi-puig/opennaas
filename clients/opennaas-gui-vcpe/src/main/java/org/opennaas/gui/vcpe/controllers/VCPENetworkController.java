package org.opennaas.gui.vcpe.controllers;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.opennaas.gui.vcpe.bos.VCPENetworkBO;
import org.opennaas.gui.vcpe.entities.VCPENetwork;
import org.opennaas.gui.vcpe.services.rest.RestServiceException;
import org.opennaas.gui.vcpe.utils.model.TemplateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Jordi
 */
@Controller
public class VCPENetworkController {

	private static final Logger						LOGGER	= Logger.getLogger(VCPENetworkController.class);

	@Autowired
	private VCPENetworkBO							vcpeNetworkBO;

	@Autowired
	private ReloadableResourceBundleMessageSource	messageSource;

	@Autowired
	private TemplateUtils							templateUtils;

	/**
	 * Redirect to home
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/secure/vcpeNetwork/home")
	public String home(Model model, Locale locale) {
		LOGGER.debug("home");
		try {
			model.addAttribute("vcpeNetworkList", vcpeNetworkBO.getAllVCPENetworks());
		} catch (RestServiceException e) {
			model.addAttribute("errorMsg", messageSource
					.getMessage("vcpenetwork.list.message.error", null, locale));
		}
		return "home";
	}

	/**
	 * Redirect to the form to create a VCPENetwork
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String createForm(Model model, Locale locale) {
		LOGGER.debug("form to create a VCPENetwork");
		try {
			model.addAttribute(templateUtils.getDefaultVCPENetwork());
			model.addAttribute("vcpeNetworkList", vcpeNetworkBO.getAllVCPENetworks());
		} catch (RestServiceException e) {
			model.addAttribute("errorMsg", messageSource
					.getMessage("vcpenetwork.create.message.error", null, locale) + ": " + e.getMessage());
		}
		return "createVCPENetwork";
	}

	/**
	 * Create a VCPE Network
	 * 
	 * @param vcpeNetwork
	 * @param result
	 * @return
	 * @throws RestServiceException
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/secure/noc/vcpeNetwork/create")
	public String create(@Valid VCPENetwork vcpeNetwork, BindingResult result, Model model, Locale locale) {
		LOGGER.debug("add entity: " + vcpeNetwork);
		try {
			if (!result.hasErrors()) {
				String vcpeNetworkId = vcpeNetworkBO.create(vcpeNetwork);
				model.addAttribute("vcpeNetworkList", vcpeNetworkBO.getAllVCPENetworks());
				model.addAttribute(vcpeNetworkBO.getById(vcpeNetworkId));
				model.addAttribute("action", new String("update"));
				model.addAttribute("infoMsg", messageSource
						.getMessage("vcpenetwork.create.message.info", null, locale));
			} else {
				model.addAttribute("errorMsg", messageSource
						.getMessage("vcpenetwork.create.message.error.fields", null, locale));
			}
			model.addAttribute("vcpeNetworkList", vcpeNetworkBO.getAllVCPENetworks());
		} catch (RestServiceException e) {
			model.addAttribute("errorMsg", messageSource
					.getMessage("vcpenetwork.create.message.error", null, locale) + ": " + e.getMessage());
		}
		return "createVCPENetwork";
	}

	/**
	 * Edit a VCPE Network
	 * 
	 * @param vcpeNetwork
	 * @param result
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/secure/noc/vcpeNetwork/edit")
	public String edit(String vcpeNetworkId, Model model, Locale locale) {
		LOGGER.debug("edit entity with id: " + vcpeNetworkId);
		try {
			model.addAttribute("vcpeNetworkList", vcpeNetworkBO.getAllVCPENetworks());
			model.addAttribute(vcpeNetworkBO.getById(vcpeNetworkId));
			model.addAttribute("action", new String("update"));
		} catch (RestServiceException e) {
			model.addAttribute("errorMsg", messageSource
					.getMessage("vcpenetwork.edit.message.error", null, locale));
		}
		return "createVCPENetwork";
	}

	/**
	 * Create a VCPE Network
	 * 
	 * @param vcpeNetwork
	 * @param result
	 * @return
	 * @throws RestServiceException
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/secure/noc/vcpeNetwork/update")
	public String update(@Valid VCPENetwork vcpeNetwork, BindingResult result, Model model, Locale locale) {
		LOGGER.debug("update entity: " + vcpeNetwork);
		String view = "createVCPENetwork";
		try {
			if (!result.hasErrors()) {
				LOGGER.debug("removing the old environment");
				vcpeNetworkBO.delete(vcpeNetwork.getId());
				LOGGER.debug("create the new environment");
				String vcpeNetworkId = vcpeNetworkBO.create(vcpeNetwork);
				model.addAttribute(vcpeNetworkBO.getById(vcpeNetworkId));
				model.addAttribute("infoMsg", messageSource.getMessage("vcpenetwork.update.message.info", null, locale));
				model.addAttribute("vcpeNetworkList", vcpeNetworkBO.getAllVCPENetworks());
			} else {
				model.addAttribute("errorMsg", messageSource
						.getMessage("vcpenetwork.update.message.error.fields", null, locale));
			}
		} catch (RestServiceException e) {
			model.addAttribute("errorMsg", messageSource
					.getMessage("vcpenetwork.update.message.error", null, locale) + ": " + e.getMessage());
		}
		return view;
	}

	/**
	 * Create a VCPE Network
	 * 
	 * @param vcpeNetwork
	 * @param result
	 * @return
	 * @throws RestServiceException
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/secure/noc/vcpeNetwork/delete")
	public String delete(String vcpeNetworkId, Model model, Locale locale) {
		LOGGER.debug("delete entity with id: " + vcpeNetworkId);
		try {
			vcpeNetworkBO.delete(vcpeNetworkId);
			model.addAttribute("infoMsg", messageSource
					.getMessage("vcpenetwork.delete.message.info", null, locale));
			model.addAttribute("vcpeNetworkList", vcpeNetworkBO.getAllVCPENetworks());
		} catch (RestServiceException e) {
			model.addAttribute("errorMsg", messageSource
					.getMessage("vcpenetwork.delete.message.error", null, locale));
		}
		return "home";
	}

	/**
	 * Redirect to the form to modify the ip's
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/secure/vcpeNetwork/updateIpsForm")
	public String updateIpsForm(String vcpeNetworkId, Model model, Locale locale) {
		LOGGER.debug("updateIpsForm entity with id: " + vcpeNetworkId);
		try {
			model.addAttribute(vcpeNetworkBO.getById(vcpeNetworkId));
			model.addAttribute("vcpeNetworkList", vcpeNetworkBO.getAllVCPENetworks());
			model.addAttribute("physical", vcpeNetworkBO.getPhysicalInfrastructure());
		} catch (RestServiceException e) {
			model.addAttribute("errorMsg", messageSource
					.getMessage("vcpenetwork.edit.message.error", null, locale));
		}
		return "updateIpsVCPENetwork";
	}

	/**
	 * Redirect to the form to modify the ip's
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/secure/vcpeNetwork/updateIps")
	public String updateIps(VCPENetwork vcpeNetwork, Model model, Locale locale) {
		LOGGER.debug("update Ips of VCPENetwork: " + vcpeNetwork);
		try {
			model.addAttribute(vcpeNetworkBO.updateIps(vcpeNetwork));
			model.addAttribute("vcpeNetworkList", vcpeNetworkBO.getAllVCPENetworks());
			model.addAttribute("infoMsg", messageSource
					.getMessage("vcpenetwork.updateIps.message.info", null, locale));
		} catch (RestServiceException e) {
			model.addAttribute("errorMsg", messageSource
					.getMessage("vcpenetwork.updateIps.message.error", null, locale));
		}
		return "updateIpsVCPENetwork";
	}

	/**
	 * Redirect to the form to modify the ip's
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/secure/noc/vcpeNetwork/updateVRRPIp")
	public String updateVRRPIp(VCPENetwork vcpeNetwork, Model model, Locale locale) {
		LOGGER.debug("update VRRP ip of VCPENetwork: " + vcpeNetwork);
		try {
			model.addAttribute("vcpeNetworkList", vcpeNetworkBO.getAllVCPENetworks());
			model.addAttribute(vcpeNetworkBO.updateVRRPIp(vcpeNetwork));
			model.addAttribute("infoMsg", messageSource
					.getMessage("vcpenetwork.updateVRRPIp.message.info", null, locale));
		} catch (RestServiceException e) {
			model.addAttribute("errorMsg", messageSource
					.getMessage("vcpenetwork.updateVRRPIp.message.error", null, locale));
		}
		return "createVCPENetwork";
	}

	/**
	 * Change the priority in VRRP
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/secure/noc/vcpeNetwork/changeVRRPPriority")
	public String changeVRRPPriority(VCPENetwork vcpeNetwork, Model model, Locale locale) {
		LOGGER.debug("change priority VRRP of VCPENetwork: " + vcpeNetwork);
		try {
			model.addAttribute("vcpeNetworkList", vcpeNetworkBO.getAllVCPENetworks());
			model.addAttribute(vcpeNetworkBO.changeVRRPPriority(vcpeNetwork));
			model.addAttribute("infoMsg", messageSource
					.getMessage("vcpenetwork.changeVRRPPriority.message.info", null, locale));
		} catch (RestServiceException e) {
			model.addAttribute("errorMsg", messageSource
					.getMessage("vcpenetwork.changeVRRPPriority.message.error", null, locale));
		}
		return "createVCPENetwork";
	}

	/**
	 * Check if the VLAN is free in the environment
	 * 
	 * @param vcpeId
	 * @param vlan
	 * @param ifaceName
	 * @param model
	 * @param locale
	 * @return true if is free
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/secure/vcpeNetwork/isVLANFree")
	public @ResponseBody
	String isVLANFree(String vcpeId, String vlan, String ifaceName, Model model, Locale locale) {
		LOGGER.debug("Check if the VLAN: " + vlan + " is free in the ifaceName: " + ifaceName + ". The vcpeID: " + vcpeId);
		Boolean isFree = false;
		try {
			isFree = vcpeNetworkBO.isVLANFree(vcpeId, vlan, ifaceName);
		} catch (RestServiceException e) {
			model.addAttribute("errorMsg", messageSource
					.getMessage("vcpenetwork.check.ip.message.error", null, locale));
		}
		return isFree.toString();
	}

	/**
	 * Check if the IP is free in the environment
	 * 
	 * @param vcpeId
	 * @param ip
	 * @param model
	 * @param locale
	 * @return true if is free
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/secure/vcpeNetwork/isIPFree")
	public @ResponseBody
	String isIPFree(String vcpeId, String ip, Model model, Locale locale) {
		LOGGER.debug("Check if the IP: " + ip + " is free. The vcpeID: " + vcpeId);
		Boolean isFree = false;
		try {
			isFree = vcpeNetworkBO.isIPFree(vcpeId, ip);
		} catch (RestServiceException e) {
			model.addAttribute("errorMsg", messageSource
					.getMessage("vcpenetwork.check.ip.message.error", null, locale));
		}
		return isFree.toString();
	}

	/**
	 * Check if the Interface is free in the environment
	 * 
	 * @param vcpeId
	 * @param iface
	 * @param port
	 * @param model
	 * @param locale
	 * @return true if is free
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/secure/vcpeNetwork/isInterfaceFree")
	public @ResponseBody
	String isInterfaceFree(String vcpeId, String iface, String port, Model model, Locale locale) {
		LOGGER.debug("Check if the Interface: " + iface + "." + port + " is free. The vcpeID: " + vcpeId);
		Boolean isFree = false;
		try {
			isFree = vcpeNetworkBO.isInterfaceFree(vcpeId, iface, port);
		} catch (RestServiceException e) {
			model.addAttribute("errorMsg", messageSource
					.getMessage("vcpenetwork.check.interface.message.error", null, locale));
		}
		return isFree.toString();
	}

	/**
	 * Handle the Exception and subclasses
	 * 
	 * @param ex
	 * @param request
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public String exception(Exception ex, HttpServletRequest request) {
		request.setAttribute("exception", ex.getMessage());
		return "exception";
	}

}