package org.opennaas.extensions.router.capability.chassis.ws;

import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.core.resources.descriptor.CapabilityDescriptor;
import org.opennaas.extensions.router.capability.chassis.ChassisCapability;
import org.opennaas.extensions.router.capability.chassis.ws.wrapper.AddIfacesToLRRequest;
import org.opennaas.extensions.router.capability.chassis.ws.wrapper.CreateLogicalRouterRequest;
import org.opennaas.extensions.router.capability.chassis.ws.wrapper.CreateSubInterfaceRequest;
import org.opennaas.extensions.router.capability.chassis.ws.wrapper.DeleteLogicalRouterRequest;
import org.opennaas.extensions.router.capability.chassis.ws.wrapper.DeleteSubInterfaceRequest;
import org.opennaas.extensions.router.capability.chassis.ws.wrapper.DownPhysicalIfaceRequest;
import org.opennaas.extensions.router.capability.chassis.ws.wrapper.RemoveIfacesFromLRRequest;
import org.opennaas.extensions.router.capability.chassis.ws.wrapper.SetEncapsulationLabelRequest;
import org.opennaas.extensions.router.capability.chassis.ws.wrapper.SetEncapsulationRequest;
import org.opennaas.extensions.router.capability.chassis.ws.wrapper.UpPhysicalIfaceRequest;

public class ChassisCapabilityServiceImpl extends ChassisCapability implements IChassisCapabilityService {

	private static final Logger	LOGGER	= Logger.getLogger(ChassisCapabilityServiceImpl.class);

	/**
	 * @param descriptor
	 * @param resourceId
	 */
	public ChassisCapabilityServiceImpl(CapabilityDescriptor descriptor, String resourceId) {
		super(descriptor, resourceId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.chassis.ws.IChassisCapabilityService#upPhysicalInterface(org.opennaas.extensions.router.capability
	 * .chassis.ws.wrapper.UpPhysicalIface)
	 */
	@Override
	public Response upPhysicalInterface(UpPhysicalIfaceRequest request) throws CapabilityException {
		LOGGER.info("Start upPhysicalInterface service");
		upPhysicalInterface(request.getLogicalPort());
		LOGGER.info("End of upPhysicalInterface service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.chassis.ws.IChassisCapabilityService#downPhysicalInterface(org.opennaas.extensions.router.capability
	 * .chassis.ws.wrapper.DownPhysicalIface)
	 */
	@Override
	public Response downPhysicalInterface(DownPhysicalIfaceRequest request) throws CapabilityException {
		LOGGER.info("Start downPhysicalInterface service");
		downPhysicalInterface(request.getLogicalPort());
		LOGGER.info("End of downPhysicalInterface service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.chassis.ws.IChassisCapabilityService#createSubInterface(org.opennaas.extensions.router.capability
	 * .chassis.ws.wrapper.CreateSubInterfaceRequest)
	 */
	@Override
	public Response createSubInterface(CreateSubInterfaceRequest request) throws CapabilityException {
		LOGGER.info("Start createSubInterface service");
		createSubInterface(request.getNetworkPort());
		LOGGER.info("End of createSubInterface service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.chassis.ws.IChassisCapabilityService#deleteSubInterface(org.opennaas.extensions.router.capability
	 * .chassis.ws.wrapper.DeleteSubInterfaceRequest)
	 */
	@Override
	public Response deleteSubInterface(DeleteSubInterfaceRequest request) throws CapabilityException {
		LOGGER.info("Start deleteSubInterface service");
		deleteSubInterface(request.getNetworkPort());
		LOGGER.info("End of deleteSubInterface service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.chassis.ws.IChassisCapabilityService#createLogicalRouter(org.opennaas.extensions.router.capability
	 * .chassis.ws.wrapper.CreateLogicalRouterRequest)
	 */
	@Override
	public Response createLogicalRouter(CreateLogicalRouterRequest request) throws CapabilityException {
		LOGGER.info("Start createLogicalRouter service");
		createLogicalRouter(request.getComputerSystem());
		LOGGER.info("End of createLogicalRouter service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.chassis.ws.IChassisCapabilityService#deleteLogicalRouter(org.opennaas.extensions.router.capability
	 * .chassis.ws.wrapper.DeleteLogicalRouterRequest)
	 */
	@Override
	public Response deleteLogicalRouter(DeleteLogicalRouterRequest request) throws CapabilityException {
		LOGGER.info("Start deleteLogicalRouter service");
		deleteLogicalRouter(request.getComputerSystem());
		LOGGER.info("End of deleteLogicalRouter service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.chassis.ws.IChassisCapabilityService#addInterfacesToLogicalRouter(org.opennaas.extensions.router.
	 * capability.chassis.ws.wrapper.AddIfacesToLRRequest)
	 */
	@Override
	public Response addInterfacesToLogicalRouter(AddIfacesToLRRequest request) throws CapabilityException {
		LOGGER.info("Start addInterfacesToLogicalRouter service");
		addInterfacesToLogicalRouter(request.getLogicalRouter(), request.getInterfaces());
		LOGGER.info("End of addInterfacesToLogicalRouter service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.chassis.ws.IChassisCapabilityService#removeInterfacesFromLogicalRouter(org.opennaas.extensions.router
	 * .capability.chassis.ws.wrapper.RemoveIfacesFromLRRequest)
	 */
	@Override
	public Response removeInterfacesFromLogicalRouter(RemoveIfacesFromLRRequest request) throws CapabilityException {
		LOGGER.info("Start removeInterfacesFromLogicalRouter service");
		removeInterfacesFromLogicalRouter(request.getLogicalRouter(), request.getInterfaces());
		LOGGER.info("End of removeInterfacesFromLogicalRouter service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.chassis.ws.IChassisCapabilityService#setEncapsulation(org.opennaas.extensions.router.capability.chassis
	 * .ws.wrapper.SetEncapsulationRequest)
	 */
	@Override
	public Response setEncapsulation(SetEncapsulationRequest request) throws CapabilityException {
		LOGGER.info("Start setEncapsulation service");
		setEncapsulation(request.getIface(), request.getEncapsulation());
		LOGGER.info("End of setEncapsulation service");
		return Response.ok().build();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opennaas.extensions.router.capability.chassis.ws.IChassisCapabilityService#setEncapsulationLabel(org.opennaas.extensions.router.capability
	 * .chassis.ws.wrapper.SetEncapsulationLabelRequest)
	 */
	@Override
	public Response setEncapsulationLabel(SetEncapsulationLabelRequest request) throws CapabilityException {
		LOGGER.info("Start setEncapsulationLabel service");
		setEncapsulationLabel(request.getIface(), request.getEncapsulationLabel());
		LOGGER.info("End of setEncapsulationLabel service");
		return Response.ok().build();
	}
}
