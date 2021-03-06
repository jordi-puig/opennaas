/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.Serializable;
import java.util.Date;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class ConcreteJob as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the ConcreteJobBean Interface. The CIM class ConcreteJob is described as follows:
 *
 * A concrete version of Job. This class represents a generic and instantiable unit of work, such as a batch or a print job.
 */
public class ConcreteJob extends Job implements Serializable {

	/**
	 * This constructor creates a ConcreteJobBeanImpl Class which implements the ConcreteJobBean Interface, and encapsulates the CIM class ConcreteJob
	 * in a Java Bean. The CIM class ConcreteJob is described as follows:
	 *
	 * A concrete version of Job. This class represents a generic and instantiable unit of work, such as a batch or a print job.
	 */
	public ConcreteJob() {
	};

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property instanceID.
	 */
	private String	instanceID;

	/**
	 * This method returns the ConcreteJob.instanceID property value. This property is described as follows:
	 *
	 * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure
	 * uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: <OrgID>:<LocalID>
	 * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> must include a copyrighted, trademarked or otherwise unique name
	 * that is owned by the business entity that is creating or defining the InstanceID, or that is a registered ID that is assigned to the business
	 * entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In
	 * addition, to ensure uniqueness <OrgID> must not contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID must
	 * appear between <OrgID> and <LocalID>. <LocalID> is chosen by the business entity and should not be re-used to identify different underlying
	 * (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity must assure that the resulting InstanceID is not
	 * re-used across any InstanceIDs produced by this or other providers for the NameSpace of this instance. For DMTF defined instances, the
	 * 'preferred' algorithm must be used with the <OrgID> set to 'CIM'.
	 *
	 * @return String current instanceID property value
	 * @exception Exception
	 */
	@Override
	public String getInstanceID() {

		return this.instanceID;
	} // getInstanceID

	/**
	 * This method sets the ConcreteJob.instanceID property value. This property is described as follows:
	 *
	 * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure
	 * uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: <OrgID>:<LocalID>
	 * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> must include a copyrighted, trademarked or otherwise unique name
	 * that is owned by the business entity that is creating or defining the InstanceID, or that is a registered ID that is assigned to the business
	 * entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In
	 * addition, to ensure uniqueness <OrgID> must not contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID must
	 * appear between <OrgID> and <LocalID>. <LocalID> is chosen by the business entity and should not be re-used to identify different underlying
	 * (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity must assure that the resulting InstanceID is not
	 * re-used across any InstanceIDs produced by this or other providers for the NameSpace of this instance. For DMTF defined instances, the
	 * 'preferred' algorithm must be used with the <OrgID> set to 'CIM'.
	 *
	 * @param String
	 *            new instanceID property value
	 * @exception Exception
	 */
	@Override
	public void setInstanceID(String instanceID) {

		this.instanceID = instanceID;
	} // setInstanceID

	// /**
	// * The following constants are defined for use with the ValueMap/Values
	// * qualified property name.
	// */
	// private String name;
	/**
	 * This method returns the ConcreteJob.name property value. This property is described as follows:
	 *
	 * The user-friendly name for this instance of a Job. In addition, the user-friendly name can be used as a property for a search or query. (Note:
	 * Name does not have to be unique within a namespace.)
	 *
	 * @return String current name property value
	 */
	@Override
	public String getName() {
		return super.getName();
	} // getName

	/**
	 * This method sets the ConcreteJob.name property value. This property is described as follows:
	 *
	 * The user-friendly name for this instance of a Job. In addition, the user-friendly name can be used as a property for a search or query. (Note:
	 * Name does not have to be unique within a namespace.)
	 *
	 * @param String
	 *            new name property value
	 */
	@Override
	public void setName(String name) {
		super.setName(name);
	} // setName

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property JobState.
	 */

	public enum JobState {
		NEW,
		STARTING,
		RUNNING,
		SUSPENDED,
		SHUTTING_DOWN,
		COMPLETED,
		TERMINATED,
		KILLED,
		EXCEPTION,
		SERVICE,
		QUERY_PENDING,
		DMTF_RESERVED,
		VENDOR_RESERVED
	}

	private JobState	jobState;

	/**
	 * This method returns the ConcreteJob.jobState property value. This property is described as follows:
	 *
	 * JobState is an integer enumeration that indicates the operational state of a Job. It can also indicate transitions between these states, for
	 * example, 'Shutting Down' and 'Starting'. Following is a brief description of the states: New (2) indicates that the job has never been started.
	 * Starting (3) indicates that the job is moving from the 'New', 'Suspended', or 'Service' states into the 'Running' state. Running (4) indicates
	 * that the Job is running. Suspended (5) indicates that the Job is stopped, but can be restarted in a seamless manner. Shutting Down (6)
	 * indicates that the job is moving to a 'Completed', 'Terminated', or 'Killed' state. Completed (7) indicates that the job has completed
	 * normally. Terminated (8) indicates that the job has been stopped by a 'Terminate' state change request. The job and all its underlying
	 * processes are ended and can be restarted (this is job-specific) only as a new job. Killed (9) indicates that the job has been stopped by a
	 * 'Kill' state change request. Underlying processes might have been left running, and cleanup might be required to free up resources. Exception
	 * (10) indicates that the Job is in an abnormal state that might be indicative of an error condition. Actual status might be displayed though
	 * job-specific objects. Service (11) indicates that the Job is in a vendor-specific state that supports problem discovery, or resolution, or
	 * both. Query pending (12) waiting for a client to resolve a query
	 *
	 * @return int current jobState property value
	 * @exception Exception
	 */
	public JobState getJobState() {

		return this.jobState;
	} // getJobState

	/**
	 * This method sets the ConcreteJob.jobState property value. This property is described as follows:
	 *
	 * JobState is an integer enumeration that indicates the operational state of a Job. It can also indicate transitions between these states, for
	 * example, 'Shutting Down' and 'Starting'. Following is a brief description of the states: New (2) indicates that the job has never been started.
	 * Starting (3) indicates that the job is moving from the 'New', 'Suspended', or 'Service' states into the 'Running' state. Running (4) indicates
	 * that the Job is running. Suspended (5) indicates that the Job is stopped, but can be restarted in a seamless manner. Shutting Down (6)
	 * indicates that the job is moving to a 'Completed', 'Terminated', or 'Killed' state. Completed (7) indicates that the job has completed
	 * normally. Terminated (8) indicates that the job has been stopped by a 'Terminate' state change request. The job and all its underlying
	 * processes are ended and can be restarted (this is job-specific) only as a new job. Killed (9) indicates that the job has been stopped by a
	 * 'Kill' state change request. Underlying processes might have been left running, and cleanup might be required to free up resources. Exception
	 * (10) indicates that the Job is in an abnormal state that might be indicative of an error condition. Actual status might be displayed though
	 * job-specific objects. Service (11) indicates that the Job is in a vendor-specific state that supports problem discovery, or resolution, or
	 * both. Query pending (12) waiting for a client to resolve a query
	 *
	 * @param int new jobState property value
	 * @exception Exception
	 */
	public void setJobState(JobState jobState) {

		this.jobState = jobState;
	} // setJobState

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property timeOfLastStateChange.
	 */
	private Date	timeOfLastStateChange;

	/**
	 * This method returns the ConcreteJob.timeOfLastStateChange property value. This property is described as follows:
	 *
	 * The date or time when the state of the Job last changed. If the state of the Job has not changed and this property is populated, then it must
	 * be set to a 0 interval value. If a state change was requested, but rejected or not yet processed, the property must not be updated.
	 *
	 * @return Date current timeOfLastStateChange property value
	 * @exception Exception
	 */
	public Date getTimeOfLastStateChange() {

		return this.timeOfLastStateChange;
	} // getTimeOfLastStateChange

	/**
	 * This method sets the ConcreteJob.timeOfLastStateChange property value. This property is described as follows:
	 *
	 * The date or time when the state of the Job last changed. If the state of the Job has not changed and this property is populated, then it must
	 * be set to a 0 interval value. If a state change was requested, but rejected or not yet processed, the property must not be updated.
	 *
	 * @param Date
	 *            new timeOfLastStateChange property value
	 * @exception Exception
	 */
	public void setTimeOfLastStateChange(Date timeOfLastStateChange) {

		this.timeOfLastStateChange = timeOfLastStateChange;
	} // setTimeOfLastStateChange

	/**
	 * The following constants are defined for use with the ValueMap/Values qualified property timeBeforeRemoval.
	 */
	private Date	timeBeforeRemoval;

	/**
	 * This method returns the ConcreteJob.timeBeforeRemoval property value. This property is described as follows:
	 *
	 * The amount of time that the Job is retained after it has finished executing, either succeeding or failing in that execution. The job must
	 * remain in existence for some period of time regardless of the value of the DeleteOnCompletion property. The default is five minutes.
	 *
	 * @return Date current timeBeforeRemoval property value
	 * @exception Exception
	 */
	public Date getTimeBeforeRemoval() {

		return this.timeBeforeRemoval;
	} // getTimeBeforeRemoval

	/**
	 * This method sets the ConcreteJob.timeBeforeRemoval property value. This property is described as follows:
	 *
	 * The amount of time that the Job is retained after it has finished executing, either succeeding or failing in that execution. The job must
	 * remain in existence for some period of time regardless of the value of the DeleteOnCompletion property. The default is five minutes.
	 *
	 * @param Date
	 *            new timeBeforeRemoval property value
	 * @exception Exception
	 */
	public void setTimeBeforeRemoval(Date timeBeforeRemoval) {

		this.timeBeforeRemoval = timeBeforeRemoval;
	} // setTimeBeforeRemoval

} // Class ConcreteJob
