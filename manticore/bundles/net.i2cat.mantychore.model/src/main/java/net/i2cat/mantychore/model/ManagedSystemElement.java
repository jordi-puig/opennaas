/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class ManagedSystemElement as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the ManagedSystemElementBean Interface. The CIM class ManagedSystemElement is
 * described as follows:
 *
 * CIM_ManagedSystemElement is the base class for the System Element hierarchy. Any distinguishable component of a System is a candidate for inclusion
 * in this class. Examples of system components include: - software components such as application servers, databases, and applications - operating
 * system components such as files, processes, and threads - device components such as disk drives, controllers, processors, and printers - physical
 * components such as chips and cards.
 */
public class ManagedSystemElement extends ManagedElement implements
		Serializable {

	/**
	 * Add a new SystemComponent association between system and this element
	 *
	 * @param logicalPort
	 * @return
	 */
	public boolean addSystem(System system) {
		if (system == null)
			return false;
		return (SystemComponent.link(system, this) != null);
	}

	/**
	 * Remove the PortImplementsEndpoint association (will be deleted) between the system and this element
	 *
	 * @param logicalPort
	 * @return
	 */
	public boolean removeSystem(System system) {

		if (system == null)
			return false;
		Association a = this.getFromAssociationByElement(system);
		if (a == null)
			return false;
		else {
			a.unlink();
			return true;
		}
	}

	/**
	 * This method returns the list of Systems from the fromAssociation vector that match with the type SystemComponent the association wouldn't be
	 * deleted
	 *
	 * @return List<LogicalPort>
	 */
	@SuppressWarnings("unchecked")
	public List<System> getSystems() {
		return (List<System>) this.getFromAssociatedElementsByType(SystemComponent.class);
	}

	/**
	 * This constructor creates a ManagedSystemElementBeanImpl Class which implements the ManagedSystemElementBean Interface, and encapsulates the CIM
	 * class ManagedSystemElement in a Java Bean. The CIM class ManagedSystemElement is described as follows:
	 *
	 * CIM_ManagedSystemElement is the base class for the System Element hierarchy. Any distinguishable component of a System is a candidate for
	 * inclusion in this class. Examples of system components include: - software components such as application servers, databases, and applications
	 * - operating system components such as files, processes, and threads - device components such as disk drives, controllers, processors, and
	 * printers - physical components such as chips and cards.
	 */
	protected ManagedSystemElement() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property installDate.
	 */
	private Date	installDate;

	/**
	 * This method returns the ManagedSystemElement.installDate property value. This property is described as follows:
	 *
	 * A datetime value that indicates when the object was installed. Lack of a value does not indicate that the object is not installed.
	 *
	 * @return Date current installDate property value
	 * @exception Exception
	 */
	public Date getInstallDate() {

		return this.installDate;
	} // getInstallDate

	/**
	 * This method sets the ManagedSystemElement.installDate property value. This property is described as follows:
	 *
	 * A datetime value that indicates when the object was installed. Lack of a value does not indicate that the object is not installed.
	 *
	 * @param Date
	 *            new installDate property value
	 * @exception Exception
	 */
	public void setInstallDate(Date installDate) {

		this.installDate = installDate;
	} // setInstallDate

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property name.
	 */
	private String	name;

	/**
	 * This method returns the ManagedSystemElement.name property value. This property is described as follows:
	 *
	 * The Name property defines the label by which the object is known. When subclassed, the Name property can be overridden to be a Key property.
	 *
	 * @return String current name property value
	 * @exception Exception
	 */
	public String getName() {

		return this.name;
	} // getName

	/**
	 * This method sets the ManagedSystemElement.name property value. This property is described as follows:
	 *
	 * The Name property defines the label by which the object is known. When subclassed, the Name property can be overridden to be a Key property.
	 *
	 * @param String
	 *            new name property value
	 * @exception Exception
	 */
	public void setName(String name) {

		this.name = name;
	} // setName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property OperationalStatus.
	 */

	// TODO ADDED MANUALLY IN THE MODEL METHODS TOSTRING
	public enum OperationalStatus {
		UNKNOWN {
			@Override
			public String toString() {
				return "UNKNOWN";
			}
		},
		OTHER {
			@Override
			public String toString() {
				return "OTHER";
			}
		},
		OK {
			@Override
			public String toString() {
				return "OK";
			}
		},
		DEGRADED,
		STRESSED,
		PREDICTIVE_FAILURE,
		ERROR {
			@Override
			public String toString() {
				return "ERROR";
			}
		},
		NON_RECOVERABLE_ERROR,
		STARTING,
		STOPPING,
		STOPPED {
			@Override
			public String toString() {
				return "STOPPED";
			}
		},
		IN_SERVICE,
		NO_CONTACT,
		LOST_COMMUNICATION,
		ABORTED,
		DORMANT,
		SUPPORTING_ENTITY_IN_ERROR,
		COMPLETED,
		POWER_MODE,
		RELOCATING,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private OperationalStatus	operationalStatus;

	/**
	 * This method returns the ManagedSystemElement.operationalStatus property value. This property is described as follows:
	 *
	 * Indicates the current statuses of the element. Various operational statuses are defined. Many of the enumeration's values are self-explanatory.
	 * However, a few are not and are described here in more detail. "Stressed" indicates that the element is functioning, but needs attention.
	 * Examples of "Stressed" states are overload, overheated, and so on. "Predictive Failure" indicates that an element is functioning nominally but
	 * predicting a failure in the near future. "In Service" describes an element being configured, maintained, cleaned, or otherwise administered.
	 * "No Contact" indicates that the monitoring system has knowledge of this element, but has never been able to establish communications with it.
	 * "Lost Communication" indicates that the ManagedSystem Element is known to exist and has been contacted successfully in the past, but is
	 * currently unreachable. "Stopped" and "Aborted" are similar, although the former implies a clean and orderly stop, while the latter implies an
	 * abrupt stop where the state and configuration of the element might need to be updated. "Dormant" indicates that the element is inactive or
	 * quiesced. "Supporting Entity in Error" indicates that this element might be "OK" but that another element, on which it is dependent, is in
	 * error. An example is a network service or endpoint that cannot function due to lower-layer networking problems. "Completed" indicates that the
	 * element has completed its operation. This value should be combined with either OK, Error, or Degraded so that a client can tell if the complete
	 * operation Completed with OK (passed), Completed with Error (failed), or Completed with Degraded (the operation finished, but it did not
	 * complete OK or did not report an error). "Power Mode" indicates that the element has additional power model information contained in the
	 * Associated PowerManagementService association. "Relocating" indicates the element is being relocated. OperationalStatus replaces the Status
	 * property on ManagedSystemElement to provide a consistent approach to enumerations, to address implementation needs for an array property, and
	 * to provide a migration path from today's environment to the future. This change was not made earlier because it required the deprecated
	 * qualifier. Due to the widespread use of the existing Status property in management applications, it is strongly recommended that providers or
	 * instrumentation provide both the Status and OperationalStatus properties. Further, the first value of OperationalStatus should contain the
	 * primary status for the element. When instrumented, Status (because it is single-valued) should also provide the primary status of the element.
	 *
	 * @return int current operationalStatus property value
	 * @exception Exception
	 */
	public OperationalStatus getOperationalStatus() {

		return this.operationalStatus;
	} // getOperationalStatus

	/**
	 * This method sets the ManagedSystemElement.operationalStatus property value. This property is described as follows:
	 *
	 * Indicates the current statuses of the element. Various operational statuses are defined. Many of the enumeration's values are self-explanatory.
	 * However, a few are not and are described here in more detail. "Stressed" indicates that the element is functioning, but needs attention.
	 * Examples of "Stressed" states are overload, overheated, and so on. "Predictive Failure" indicates that an element is functioning nominally but
	 * predicting a failure in the near future. "In Service" describes an element being configured, maintained, cleaned, or otherwise administered.
	 * "No Contact" indicates that the monitoring system has knowledge of this element, but has never been able to establish communications with it.
	 * "Lost Communication" indicates that the ManagedSystem Element is known to exist and has been contacted successfully in the past, but is
	 * currently unreachable. "Stopped" and "Aborted" are similar, although the former implies a clean and orderly stop, while the latter implies an
	 * abrupt stop where the state and configuration of the element might need to be updated. "Dormant" indicates that the element is inactive or
	 * quiesced. "Supporting Entity in Error" indicates that this element might be "OK" but that another element, on which it is dependent, is in
	 * error. An example is a network service or endpoint that cannot function due to lower-layer networking problems. "Completed" indicates that the
	 * element has completed its operation. This value should be combined with either OK, Error, or Degraded so that a client can tell if the complete
	 * operation Completed with OK (passed), Completed with Error (failed), or Completed with Degraded (the operation finished, but it did not
	 * complete OK or did not report an error). "Power Mode" indicates that the element has additional power model information contained in the
	 * Associated PowerManagementService association. "Relocating" indicates the element is being relocated. OperationalStatus replaces the Status
	 * property on ManagedSystemElement to provide a consistent approach to enumerations, to address implementation needs for an array property, and
	 * to provide a migration path from today's environment to the future. This change was not made earlier because it required the deprecated
	 * qualifier. Due to the widespread use of the existing Status property in management applications, it is strongly recommended that providers or
	 * instrumentation provide both the Status and OperationalStatus properties. Further, the first value of OperationalStatus should contain the
	 * primary status for the element. When instrumented, Status (because it is single-valued) should also provide the primary status of the element.
	 *
	 * @param int new operationalStatus property value
	 * @exception Exception
	 */
	public void setOperationalStatus(OperationalStatus operationalStatus) {

		this.operationalStatus = operationalStatus;
	} // setOperationalStatus

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property statusDescriptions.
	 */
	private String[]	statusDescriptions;

	/**
	 * This method returns the ManagedSystemElement.statusDescriptions property value. This property is described as follows:
	 *
	 * Strings describing the various OperationalStatus array values. For example, if "Stopping" is the value assigned to OperationalStatus, then this
	 * property may contain an explanation as to why an object is being stopped. Note that entries in this array are correlated with those at the same
	 * array index in OperationalStatus.
	 *
	 * @return String[] current statusDescriptions property value
	 * @exception Exception
	 */
	public String[] getStatusDescriptions() {

		return this.statusDescriptions;
	} // getStatusDescriptions

	/**
	 * This method sets the ManagedSystemElement.statusDescriptions property value. This property is described as follows:
	 *
	 * Strings describing the various OperationalStatus array values. For example, if "Stopping" is the value assigned to OperationalStatus, then this
	 * property may contain an explanation as to why an object is being stopped. Note that entries in this array are correlated with those at the same
	 * array index in OperationalStatus.
	 *
	 * @param String
	 *            [] new statusDescriptions property value
	 * @exception Exception
	 */
	public void setStatusDescriptions(String[] statusDescriptions) {

		this.statusDescriptions = statusDescriptions;
	} // setStatusDescriptions

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property Status.
	 */
	@Deprecated
	public enum Status {
		OK,
		ERROR,
		DEGRADED,
		UNKNOWN,
		PRED_FAIL,
		STARTING,
		STOPPING,
		SERVICE,
		STRESSED,
		NONRECOVER,
		NO_CONTACT,
		LOST_COMM,
		STOPPED
	}

	@Deprecated
	private Status	status;

	/**
	 * This method returns the ManagedSystemElement.status property value. This property is described as follows:
	 *
	 * A string indicating the current status of the object. Various operational and non-operational statuses are defined. This property is deprecated
	 * in lieu of OperationalStatus, which includes the same semantics in its enumeration. This change is made for 3 reasons: 1) Status is more
	 * correctly defined as an array. This definition overcomes the limitation of describing status using a single value, when it is really a
	 * multi-valued property (for example, an element might be OK AND Stopped. 2) A MaxLen of 10 is too restrictive and leads to unclear enumerated
	 * values. 3) The change to a uint16 data type was discussed when CIM V2.0 was defined. However, existing V1.0 implementations used the string
	 * property and did not want to modify their code. Therefore, Status was grandfathered into the Schema. Use of the deprecated qualifier allows the
	 * maintenance of the existing property, but also permits an improved definition using OperationalStatus.
	 *
	 * @return String current status property value
	 * @exception Exception
	 */
	@Deprecated
	public Status getStatus() {

		return this.status;
	} // getStatus

	/**
	 * This method sets the ManagedSystemElement.status property value. This property is described as follows:
	 *
	 * A string indicating the current status of the object. Various operational and non-operational statuses are defined. This property is deprecated
	 * in lieu of OperationalStatus, which includes the same semantics in its enumeration. This change is made for 3 reasons: 1) Status is more
	 * correctly defined as an array. This definition overcomes the limitation of describing status using a single value, when it is really a
	 * multi-valued property (for example, an element might be OK AND Stopped. 2) A MaxLen of 10 is too restrictive and leads to unclear enumerated
	 * values. 3) The change to a uint16 data type was discussed when CIM V2.0 was defined. However, existing V1.0 implementations used the string
	 * property and did not want to modify their code. Therefore, Status was grandfathered into the Schema. Use of the deprecated qualifier allows the
	 * maintenance of the existing property, but also permits an improved definition using OperationalStatus.
	 *
	 * @param String
	 *            new status property value
	 * @exception Exception
	 */
	@Deprecated
	public void setStatus(Status status) {

		this.status = status;
	} // setStatus

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property HealthState.
	 */

	public enum HealthState {
		UNKNOWN,
		OK,
		DEGRADED_WARNING,
		MINOR_FAILURE,
		MAJOR_FAILURE,
		CRITICAL_FAILURE,
		NON_RECOVERABLE_ERROR,
		DMTF_RESERVED
	}

	private HealthState	healthState;

	/**
	 * This method returns the ManagedSystemElement.healthState property value. This property is described as follows:
	 *
	 * Indicates the current health of the element. This attribute expresses the health of this element but not necessarily that of its subcomponents.
	 * The possible values are 0 to 30, where 5 means the element is entirely healthy and 30 means the element is completely non-functional. The
	 * following continuum is defined: "Non-recoverable Error" (30) - The element has completely failed, and recovery is not possible. All
	 * functionality provided by this element has been lost. "Critical Failure" (25) - The element is non-functional and recovery might not be
	 * possible. "Major Failure" (20) - The element is failing. It is possible that some or all of the functionality of this component is degraded or
	 * not working. "Minor Failure" (15) - All functionality is available but some might be degraded. "Degraded/Warning" (10) - The element is in
	 * working order and all functionality is provided. However, the element is not working to the best of its abilities. For example, the element
	 * might not be operating at optimal performance or it might be reporting recoverable errors. "OK" (5) - The element is fully functional and is
	 * operating within normal operational parameters and without error. "Unknown" (0) - The implementation cannot report on HealthState at this time.
	 * DMTF has reserved the unused portion of the continuum for additional HealthStates in the future.
	 *
	 * @return int current healthState property value
	 * @exception Exception
	 */
	public HealthState getHealthState() {

		return this.healthState;
	} // getHealthState

	/**
	 * This method sets the ManagedSystemElement.healthState property value. This property is described as follows:
	 *
	 * Indicates the current health of the element. This attribute expresses the health of this element but not necessarily that of its subcomponents.
	 * The possible values are 0 to 30, where 5 means the element is entirely healthy and 30 means the element is completely non-functional. The
	 * following continuum is defined: "Non-recoverable Error" (30) - The element has completely failed, and recovery is not possible. All
	 * functionality provided by this element has been lost. "Critical Failure" (25) - The element is non-functional and recovery might not be
	 * possible. "Major Failure" (20) - The element is failing. It is possible that some or all of the functionality of this component is degraded or
	 * not working. "Minor Failure" (15) - All functionality is available but some might be degraded. "Degraded/Warning" (10) - The element is in
	 * working order and all functionality is provided. However, the element is not working to the best of its abilities. For example, the element
	 * might not be operating at optimal performance or it might be reporting recoverable errors. "OK" (5) - The element is fully functional and is
	 * operating within normal operational parameters and without error. "Unknown" (0) - The implementation cannot report on HealthState at this time.
	 * DMTF has reserved the unused portion of the continuum for additional HealthStates in the future.
	 *
	 * @param int new healthState property value
	 * @exception Exception
	 */
	public void setHealthState(HealthState healthState) {

		this.healthState = healthState;
	} // setHealthState

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property CommunicationStatus.
	 */

	public enum CommunicationStatus {
		UNKNOWN,
		NOT_AVAILABLE,
		COMMUNICATION_OK,
		LOST_COMMUNICATION,
		NO_CONTACT,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private CommunicationStatus	communicationStatus;

	/**
	 * This method returns the ManagedSystemElement.communicationStatus property value. This property is described as follows:
	 *
	 * CommunicationStatus indicates the ability of the instrumentation to communicate with the underlying ManagedElement. CommunicationStatus
	 * consists of one of the following values: Unknown, None, Communication OK, Lost Communication, or No Contact. A Null return indicates the
	 * implementation (provider) does not implement this property. "Unknown" indicates the implementation is in general capable of returning this
	 * property, but is unable to do so at this time. "Not Available" indicates that the implementation (provider) is capable of returning a value for
	 * this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no
	 * meaningful information (as in the case of a property that is intended to add additional info to another property). "Communication OK "
	 * indicates communication is established with the element, but does not convey any quality of service. "No Contact" indicates that the monitoring
	 * system has knowledge of this element, but has never been able to establish communications with it. "Lost Communication" indicates that the
	 * Managed Element is known to exist and has been contacted successfully in the past, but is currently unreachable.
	 *
	 * @return int current communicationStatus property value
	 * @exception Exception
	 */
	public CommunicationStatus getCommunicationStatus() {

		return this.communicationStatus;
	} // getCommunicationStatus

	/**
	 * This method sets the ManagedSystemElement.communicationStatus property value. This property is described as follows:
	 *
	 * CommunicationStatus indicates the ability of the instrumentation to communicate with the underlying ManagedElement. CommunicationStatus
	 * consists of one of the following values: Unknown, None, Communication OK, Lost Communication, or No Contact. A Null return indicates the
	 * implementation (provider) does not implement this property. "Unknown" indicates the implementation is in general capable of returning this
	 * property, but is unable to do so at this time. "Not Available" indicates that the implementation (provider) is capable of returning a value for
	 * this property, but not ever for this particular piece of hardware/software or the property is intentionally not used because it adds no
	 * meaningful information (as in the case of a property that is intended to add additional info to another property). "Communication OK "
	 * indicates communication is established with the element, but does not convey any quality of service. "No Contact" indicates that the monitoring
	 * system has knowledge of this element, but has never been able to establish communications with it. "Lost Communication" indicates that the
	 * Managed Element is known to exist and has been contacted successfully in the past, but is currently unreachable.
	 *
	 * @param int new communicationStatus property value
	 * @exception Exception
	 */
	public void setCommunicationStatus(CommunicationStatus
			communicationStatus) {

		this.communicationStatus = communicationStatus;
	} // setCommunicationStatus

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property DetailedStatus.
	 */

	public enum DetailedStatus {
		NOT_AVAILABLE,
		NO_ADDITIONAL_INFORMATION,
		STRESSED,
		PREDICTIVE_FAILURE,
		NON_RECOVERABLE_ERROR,
		SUPPORTING_ENTITY_IN_ERROR,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private DetailedStatus	detailedStatus;

	/**
	 * This method returns the ManagedSystemElement.detailedStatus property value. This property is described as follows:
	 *
	 * DetailedStatus compliments PrimaryStatus with additional status detail. It consists of one of the following values: Not Available, No
	 * Additional Information, Stressed, Predictive Failure, Error, Non-Recoverable Error, SupportingEntityInError. Detailed status is used to expand
	 * upon the PrimaryStatus of the element. A Null return indicates the implementation (provider) does not implement this property. "Not Available"
	 * indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of
	 * hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is
	 * intended to add additional info to another property). "No Additional Information" indicates that the element is functioning normally as
	 * indicated by PrimaryStatus = "OK". "Stressed" indicates that the element is functioning, but needs attention. Examples of "Stressed" states are
	 * overload, overheated, and so on. "Predictive Failure" indicates that an element is functioning normally but a failure is predicted in the near
	 * future. "Non-Recoverable Error " indicates that this element is in an error condition that requires human intervention.
	 * "Supporting Entity in Error" indicates that this element might be "OK" but that another element, on which it is dependent, is in error. An
	 * example is a network service or endpoint that cannot function due to lower-layer networking problems.
	 *
	 * @return int current detailedStatus property value
	 * @exception Exception
	 */
	public DetailedStatus getDetailedStatus() {

		return this.detailedStatus;
	} // getDetailedStatus

	/**
	 * This method sets the ManagedSystemElement.detailedStatus property value. This property is described as follows:
	 *
	 * DetailedStatus compliments PrimaryStatus with additional status detail. It consists of one of the following values: Not Available, No
	 * Additional Information, Stressed, Predictive Failure, Error, Non-Recoverable Error, SupportingEntityInError. Detailed status is used to expand
	 * upon the PrimaryStatus of the element. A Null return indicates the implementation (provider) does not implement this property. "Not Available"
	 * indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this particular piece of
	 * hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a property that is
	 * intended to add additional info to another property). "No Additional Information" indicates that the element is functioning normally as
	 * indicated by PrimaryStatus = "OK". "Stressed" indicates that the element is functioning, but needs attention. Examples of "Stressed" states are
	 * overload, overheated, and so on. "Predictive Failure" indicates that an element is functioning normally but a failure is predicted in the near
	 * future. "Non-Recoverable Error " indicates that this element is in an error condition that requires human intervention.
	 * "Supporting Entity in Error" indicates that this element might be "OK" but that another element, on which it is dependent, is in error. An
	 * example is a network service or endpoint that cannot function due to lower-layer networking problems.
	 *
	 * @param int new detailedStatus property value
	 * @exception Exception
	 */
	public void setDetailedStatus(DetailedStatus detailedStatus) {

		this.detailedStatus = detailedStatus;
	} // setDetailedStatus

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property OperatingStatus.
	 */

	public enum OperatingStatus {
		UNKNOWN,
		NOT_AVAILABLE,
		SERVICING,
		STARTING,
		STOPPING,
		STOPPED,
		ABORTED,
		DORMANT,
		COMPLETED,
		MIGRATING,
		EMIGRATING,
		IMMIGRATING,
		SNAPSHOTTING,
		SHUTTING_DOWN,
		IN_TEST,
		TRANSITIONING,
		IN_SERVICE,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private OperatingStatus	operatingStatus;

	/**
	 * This method returns the ManagedSystemElement.operatingStatus property value. This property is described as follows:
	 *
	 * OperatingStatus provides a current status value for the operational condition of the element and can be used for providing more detail with
	 * respect to the value of EnabledState. It can also provide the transitional states when an element is transitioning from one state to another,
	 * such as when an element is transitioning between EnabledState and RequestedState, as well as other transitional conditions. OperatingStatus
	 * consists of one of the following values: Unknown, Not Available, In Service, Starting, Stopping, Stopped, Aborted, Dormant, Completed,
	 * Migrating, Emmigrating, Immigrating, Snapshotting. Shutting Down, In Test A Null return indicates the implementation (provider) does not
	 * implement this property. "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at
	 * this time. "None" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this
	 * particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a
	 * property that is intended to add additional info to another property). "Servicing" describes an element being configured, maintained, cleaned,
	 * or otherwise administered. "Starting" describes an element being initialized. "Stopping" describes an element being brought to an orderly stop.
	 * "Stopped" and "Aborted" are similar, although the former implies a clean and orderly stop, while the latter implies an abrupt stop where the
	 * state and configuration of the element might need to be updated. "Dormant" indicates that the element is inactive or quiesced. "Completed"
	 * indicates that the element has completed its operation. This value should be combined with either OK, Error, or Degraded in the PrimaryStatus
	 * so that a client can tell if the complete operation Completed with OK (passed), Completed with Error (failed), or Completed with Degraded (the
	 * operation finished, but it did not complete OK or did not report an error). "Migrating" element is being moved between host elements.
	 * "Immigrating" element is being moved to new host element. "Emigrating" element is being moved away from host element. "Shutting Down" describes
	 * an element being brought to an abrupt stop. "In Test" element is performing test functions. "Transitioning" describes an element that is
	 * between states, that is, it is not fully available in either its previous state or its next state. This value should be used if other values
	 * indicating a transition to a specific state are not applicable. "In Service" describes an element that is in service and operational.
	 *
	 * @return int current operatingStatus property value
	 * @exception Exception
	 */
	public OperatingStatus getOperatingStatus() {

		return this.operatingStatus;
	} // getOperatingStatus

	/**
	 * This method sets the ManagedSystemElement.operatingStatus property value. This property is described as follows:
	 *
	 * OperatingStatus provides a current status value for the operational condition of the element and can be used for providing more detail with
	 * respect to the value of EnabledState. It can also provide the transitional states when an element is transitioning from one state to another,
	 * such as when an element is transitioning between EnabledState and RequestedState, as well as other transitional conditions. OperatingStatus
	 * consists of one of the following values: Unknown, Not Available, In Service, Starting, Stopping, Stopped, Aborted, Dormant, Completed,
	 * Migrating, Emmigrating, Immigrating, Snapshotting. Shutting Down, In Test A Null return indicates the implementation (provider) does not
	 * implement this property. "Unknown" indicates the implementation is in general capable of returning this property, but is unable to do so at
	 * this time. "None" indicates that the implementation (provider) is capable of returning a value for this property, but not ever for this
	 * particular piece of hardware/software or the property is intentionally not used because it adds no meaningful information (as in the case of a
	 * property that is intended to add additional info to another property). "Servicing" describes an element being configured, maintained, cleaned,
	 * or otherwise administered. "Starting" describes an element being initialized. "Stopping" describes an element being brought to an orderly stop.
	 * "Stopped" and "Aborted" are similar, although the former implies a clean and orderly stop, while the latter implies an abrupt stop where the
	 * state and configuration of the element might need to be updated. "Dormant" indicates that the element is inactive or quiesced. "Completed"
	 * indicates that the element has completed its operation. This value should be combined with either OK, Error, or Degraded in the PrimaryStatus
	 * so that a client can tell if the complete operation Completed with OK (passed), Completed with Error (failed), or Completed with Degraded (the
	 * operation finished, but it did not complete OK or did not report an error). "Migrating" element is being moved between host elements.
	 * "Immigrating" element is being moved to new host element. "Emigrating" element is being moved away from host element. "Shutting Down" describes
	 * an element being brought to an abrupt stop. "In Test" element is performing test functions. "Transitioning" describes an element that is
	 * between states, that is, it is not fully available in either its previous state or its next state. This value should be used if other values
	 * indicating a transition to a specific state are not applicable. "In Service" describes an element that is in service and operational.
	 *
	 * @param int new operatingStatus property value
	 * @exception Exception
	 */
	public void setOperatingStatus(OperatingStatus operatingStatus) {

		this.operatingStatus = operatingStatus;
	} // setOperatingStatus

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property PrimaryStatus.
	 */

	public enum PrimaryStatus {
		UNKNOWN,
		OK,
		DEGRADED,
		ERROR,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private PrimaryStatus	primaryStatus;

	/**
	 * This method returns the ManagedSystemElement.primaryStatus property value. This property is described as follows:
	 *
	 * PrimaryStatus provides a high level status value, intended to align with Red-Yellow-Green type representation of status. It should be used in
	 * conjunction with DetailedStatus to provide high level and detailed health status of the ManagedElement and its subcomponents. PrimaryStatus
	 * consists of one of the following values: Unknown, OK, Degraded or Error. "Unknown" indicates the implementation is in general capable of
	 * returning this property, but is unable to do so at this time. "OK" indicates the ManagedElement is functioning normally. "Degraded" indicates
	 * the ManagedElement is functioning below normal. "Error" indicates the ManagedElement is in an Error condition.
	 *
	 * @return int current primaryStatus property value
	 * @exception Exception
	 */
	public PrimaryStatus getPrimaryStatus() {

		return this.primaryStatus;
	} // getPrimaryStatus

	/**
	 * This method sets the ManagedSystemElement.primaryStatus property value. This property is described as follows:
	 *
	 * PrimaryStatus provides a high level status value, intended to align with Red-Yellow-Green type representation of status. It should be used in
	 * conjunction with DetailedStatus to provide high level and detailed health status of the ManagedElement and its subcomponents. PrimaryStatus
	 * consists of one of the following values: Unknown, OK, Degraded or Error. "Unknown" indicates the implementation is in general capable of
	 * returning this property, but is unable to do so at this time. "OK" indicates the ManagedElement is functioning normally. "Degraded" indicates
	 * the ManagedElement is functioning below normal. "Error" indicates the ManagedElement is in an Error condition.
	 *
	 * @param int new primaryStatus property value
	 * @exception Exception
	 */
	public void setPrimaryStatus(PrimaryStatus primaryStatus) {

		this.primaryStatus = primaryStatus;
	} // setPrimaryStatus

} // Class ManagedSystemElement
