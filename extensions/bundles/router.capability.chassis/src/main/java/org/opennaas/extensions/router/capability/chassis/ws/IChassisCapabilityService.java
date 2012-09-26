package org.opennaas.extensions.router.capability.chassis.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.opennaas.core.resources.capability.CapabilityException;
import org.opennaas.core.resources.capability.ICapability;
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

public interface IChassisCapabilityService extends ICapability {

	/*
	 * Interfaces
	 */

	/**
	 * Activates given physical interface (iface) so it can receive/send traffic.
	 * 
	 * Note: This call uses the driver to communicate with the physical device this capability belongs to, and uses actions to modify the device
	 * state. This call end by adding required actions to the device queue, hence device state is not modified yet. An execution of this device queue
	 * is required for queued actions to take effect.
	 * 
	 * @param request
	 *            to activate (must be a physical one)
	 * @return
	 * @throws CapabilityException
	 *             if any error occurred. In that case, queue remains untouched.
	 */
	@POST
	@Path("/upPhysicalInterface")
	@Consumes(MediaType.APPLICATION_XML)
	public Response upPhysicalInterface(UpPhysicalIfaceRequest request) throws CapabilityException;

	/**
	 * Deactivates given physical interface (iface) so it can not receive/send traffic.
	 * 
	 * Note: This call uses the driver to communicate with the physical device this capability belongs to, and uses actions to modify the device
	 * state. This call end by adding required actions to the device queue, hence device state is not modified yet. An execution of this device queue
	 * is required for queued actions to take effect.
	 * 
	 * @param request
	 *            to deactivate (must be a physical one)
	 * @throws CapabilityException
	 *             if any error occurred. In that case, queue remains untouched.
	 */
	@POST
	@Path("/downPhysicalInterface")
	@Consumes(MediaType.APPLICATION_XML)
	public Response downPhysicalInterface(DownPhysicalIfaceRequest request) throws CapabilityException;

	/**
	 * Creates given logical interface (iface).
	 * 
	 * Note: This call uses the driver to communicate with the physical device this capability belongs to, and uses actions to modify the device
	 * state. This call end by adding required actions to the device queue, hence device state is not modified yet. An execution of this device queue
	 * is required for queued actions to take effect.
	 * 
	 * @param request
	 *            to be created
	 * @throws CapabilityException
	 *             if any error occurred. In that case, queue remains untouched.
	 */
	@POST
	@Path("/createSubInterface")
	@Consumes(MediaType.APPLICATION_XML)
	public Response createSubInterface(CreateSubInterfaceRequest request) throws CapabilityException;

	/**
	 * Deletes given logical interface (iface).
	 * 
	 * Note: This call uses the driver to communicate with the physical device this capability belongs to, and uses actions to modify the device
	 * state. This call end by adding required actions to the device queue, hence device state is not modified yet. An execution of this device queue
	 * is required for queued actions to take effect.
	 * 
	 * @param request
	 *            to be deleted
	 * @throws CapabilityException
	 *             if any error occurred. In that case, queue remains untouched.
	 */
	@POST
	@Path("/deleteSubInterface")
	@Consumes(MediaType.APPLICATION_XML)
	public Response deleteSubInterface(DeleteSubInterfaceRequest request) throws CapabilityException;

	/*
	 * Logical Routers
	 */
	/**
	 * Creates a logical router.
	 * 
	 * Note: This call uses the driver to communicate with the physical device this capability belongs to, and uses actions to modify the device
	 * state. This call end by adding required actions to the device queue, hence device state is not modified yet. An execution of this device queue
	 * is required for queued actions to take effect.
	 * 
	 * @param request
	 *            to be created
	 * @throws CapabilityException
	 *             if any error occurred. In that case, queue remains untouched.
	 */
	@POST
	@Path("/createLogicalRouter")
	@Consumes(MediaType.APPLICATION_XML)
	public Response createLogicalRouter(CreateLogicalRouterRequest request) throws CapabilityException;

	/**
	 * Deletes given logical router.
	 * 
	 * @param request
	 *            existing logical router to delete.
	 * @throws CapabilityException
	 *             if any error occurred. In that case, queue remains untouched.
	 */
	@POST
	@Path("/deleteLogicalRouter")
	@Consumes(MediaType.APPLICATION_XML)
	public Response deleteLogicalRouter(DeleteLogicalRouterRequest request) throws CapabilityException;

	/**
	 * Adds given interfaces to given logical router, thus giving control over them to the logical router.
	 * 
	 * @param request
	 * @throws CapabilityException
	 *             if any error occurred. In that case, queue remains untouched.
	 */
	@POST
	@Path("/addInterfacesToLogicalRouter")
	@Consumes(MediaType.APPLICATION_XML)
	public Response addInterfacesToLogicalRouter(AddIfacesToLRRequest request) throws CapabilityException;

	/**
	 * Removes given interfaces from given logical router, returning control over them to the physical router.
	 * 
	 * 
	 * @param request
	 * @throws CapabilityException
	 *             if any error occurred. In that case, queue remains untouched.
	 */
	@POST
	@Path("/removeInterfacesFromLogicalRouter")
	@Consumes(MediaType.APPLICATION_XML)
	public Response removeInterfacesFromLogicalRouter(RemoveIfacesFromLRRequest request) throws CapabilityException;

	/**
	 * Configures the type of encapsulation to use in given iface.
	 * 
	 * Note: This call uses the driver to communicate with the physical device this capability belongs to, and uses actions to modify the device
	 * state. This call end by adding required actions to the device queue, hence device state is not modified yet. An execution of this device queue
	 * is required for queued actions to take effect.
	 * 
	 * @param request
	 * @throws CapabilityException
	 *             if any error occurred. In that case, queue remains untouched.
	 */
	@POST
	@Path("/setEncapsulation")
	@Consumes(MediaType.APPLICATION_XML)
	public Response setEncapsulation(SetEncapsulationRequest request) throws CapabilityException;

	/**
	 * Configures the encapsulation label to use in given iface.
	 * 
	 * Note: This call uses the driver to communicate with the physical device this capability belongs to, and uses actions to modify the device
	 * state. This call end by adding required actions to the device queue, hence device state is not modified yet. An execution of this device queue
	 * is required for queued actions to take effect.
	 * 
	 * @param request
	 * @throws CapabilityException
	 *             if any error occurred. In that case, queue remains untouched.
	 */
	@POST
	@Path("/setEncapsulationLabel")
	@Consumes(MediaType.APPLICATION_XML)
	public Response setEncapsulationLabel(SetEncapsulationLabelRequest request) throws CapabilityException;

}
