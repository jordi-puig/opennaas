/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class ResourceAllocationSettingData as well as methods
 * comparable to the invokeMethods defined for this class. This Class
 * implements the ResourceAllocationSettingDataBean Interface. The CIM class
 * ResourceAllocationSettingData is described as follows:
 *
 * The ResourceAllocationSettingData class represents settings specifically
 * related to an allocated resource that are outside the scope of the CIM
 * class typically used to represent the resource itself. These settings
 * include information specific to the allocation that may not be visible to
 * the consumer of the resource itself. For example, a virtual processor may
 * look like a 2 ghz processor to the consumer (virtual computer system),
 * however the virtualization system may use time-slicing to schedule the the
 * virtual processor to only allow it to use 1 ghz.
 */
public class ResourceAllocationSettingData extends SettingData implements
    Serializable {

    /**
     * This constructor creates a ResourceAllocationSettingDataBeanImpl Class
     * which implements the ResourceAllocationSettingDataBean Interface, and
     * encapsulates the CIM class ResourceAllocationSettingData in a Java
     * Bean. The CIM class ResourceAllocationSettingData is described as
     * follows:
     *
     * The ResourceAllocationSettingData class represents settings
     * specifically related to an allocated resource that are outside the
     * scope of the CIM class typically used to represent the resource
     * itself. These settings include information specific to the allocation
     * that may not be visible to the consumer of the resource itself. For
     * example, a virtual processor may look like a 2 ghz processor to the
     * consumer (virtual computer system), however the virtualization system
     * may use time-slicing to schedule the the virtual processor to only
     * allow it to use 1 ghz.
     */
    public ResourceAllocationSettingData(){};
    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property ResourceType.
     */

    public enum ResourceType{
    OTHER,
    COMPUTER_SYSTEM,
    PROCESSOR,
    MEMORY,
    IDE_CONTROLLER,
    PARALLEL_SCSI_HBA,
    FC_HBA,
    ISCSI_HBA,
    IB_HCA,
    ETHERNET_ADAPTER,
    OTHER_NETWORK_ADAPTER,
    I_O_SLOT,
    I_O_DEVICE,
    FLOPPY_DRIVE,
    CD_DRIVE,
    DVD_DRIVE,
    DISK_DRIVE,
    TAPE_DRIVE,
    STORAGE_EXTENT,
    OTHER_STORAGE_DEVICE,
    SERIAL_PORT,
    PARALLEL_PORT,
    USB_CONTROLLER,
    GRAPHICS_CONTROLLER,
    IEEE_1394_CONTROLLER,
    PARTITIONABLE_UNIT,
    BASE_PARTITIONABLE_UNIT,
    POWER,
    COOLING_CAPACITY,
    ETHERNET_SWITCH_PORT,
    LOGICAL_DISK,
    STORAGE_VOLUME,
    ETHERNET_CONNECTION,
    DMTF_RESERVED,
    VENDOR_RESERVED
    }
    private ResourceType resourceType;
    /**
     * This method returns the ResourceAllocationSettingData.resourceType
     * property value. This property is described as follows:
     *
     * The type of resource this allocation setting represents.
     *
     * @return	int	current resourceType property value
     * @exception	Exception
     */
    public ResourceType getResourceType(){

    return this.resourceType;
    } // getResourceType

    /**
     * This method sets the ResourceAllocationSettingData.resourceType
     * property value. This property is described as follows:
     *
     * The type of resource this allocation setting represents.
     *
     * @param	int	new resourceType property value
     * @exception	Exception
     */
    public void setResourceType(ResourceType resourceType){

    this.resourceType = resourceType;
    } // setResourceType


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property otherResourceType.
     */
    private String otherResourceType;
    /**
     * This method returns the ResourceAllocationSettingData.otherResourceType
     * property value. This property is described as follows:
     *
     * A string that describes the resource type when a well defined value is
     * not available and ResourceType has the value "Other".
     *
     * @return	String	current otherResourceType property value
     * @exception	Exception
     */
    public String getOtherResourceType(){

    return this.otherResourceType;
    } // getOtherResourceType

    /**
     * This method sets the ResourceAllocationSettingData.otherResourceType
     * property value. This property is described as follows:
     *
     * A string that describes the resource type when a well defined value is
     * not available and ResourceType has the value "Other".
     *
     * @param	String	new otherResourceType property value
     * @exception	Exception
     */
    public void setOtherResourceType(String otherResourceType) {

    this.otherResourceType = otherResourceType;
    } // setOtherResourceType


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property resourceSubType.
     */
    private String resourceSubType;
    /**
     * This method returns the ResourceAllocationSettingData.resourceSubType
     * property value. This property is described as follows:
     *
     * A string describing an implementation specific sub-type for this
     * resource. For example, this may be used to distinguish different
     * models of the same resource type.The property value shall conform to
     * this format (in ABNF): vs-type = dmtf-value / other-org-value /
     * legacy-value dmtf-value = "DMTF:" defining-org ":" org-vs-type
     * org-value = defining-org ":" org-vs-type Where: dmtf-value: is a
     * property value defined by DMTF and is defined in the description of
     * this property. other-org-value: is a property value defined by a
     * business entity other than DMTF and is not defined in the description
     * of this property. legacy-value: is a property value defined by a
     * business entity other than DMTF and is not defined in the description
     * of this property. These values are permitted but recommended to be
     * deprecated over time. defining-org: is an identifier for the business
     * entity that defines the virtual system type. It shall include a
     * copyrighted, trademarked, or otherwise unique name that is owned by
     * that business entity. It shall not be "DMTF" and shall not contain a
     * colon (:). org-vs-type: is an identifier for the virtual system type
     * within the defining business entity. It shall be unique within the
     * defining-org. It may use any character allowed for CIM strings, except
     * for the following: U0000-U001F (Unicode C0 controls) U0020 (space),
     * note that the reason is that OVF allows for multiple space-separated
     * vs-type values in this property. U007F (Unicode C0 controls)
     * U0080-U009F (Unicode C1 controls) If there is a need to structure the
     * value into segments, the segments should be separated with a single
     * colon (:). The values of this property shall be processed case
     * sensitively. They are intended to be processed programmatically
     * (instead of being a display name) and should be short. The following
     * DMTF values are defined: DMTF:unknown - the resource sub-type is
     * unknown or cannot be determined Developers should consult the relevant
     * profile for defined values.
     *
     * @return	String	current resourceSubType property value
     * @exception	Exception
     */
    public String getResourceSubType(){

    return this.resourceSubType;
    } // getResourceSubType

    /**
     * This method sets the ResourceAllocationSettingData.resourceSubType
     * property value. This property is described as follows:
     *
     * A string describing an implementation specific sub-type for this
     * resource. For example, this may be used to distinguish different
     * models of the same resource type.The property value shall conform to
     * this format (in ABNF): vs-type = dmtf-value / other-org-value /
     * legacy-value dmtf-value = "DMTF:" defining-org ":" org-vs-type
     * org-value = defining-org ":" org-vs-type Where: dmtf-value: is a
     * property value defined by DMTF and is defined in the description of
     * this property. other-org-value: is a property value defined by a
     * business entity other than DMTF and is not defined in the description
     * of this property. legacy-value: is a property value defined by a
     * business entity other than DMTF and is not defined in the description
     * of this property. These values are permitted but recommended to be
     * deprecated over time. defining-org: is an identifier for the business
     * entity that defines the virtual system type. It shall include a
     * copyrighted, trademarked, or otherwise unique name that is owned by
     * that business entity. It shall not be "DMTF" and shall not contain a
     * colon (:). org-vs-type: is an identifier for the virtual system type
     * within the defining business entity. It shall be unique within the
     * defining-org. It may use any character allowed for CIM strings, except
     * for the following: U0000-U001F (Unicode C0 controls) U0020 (space),
     * note that the reason is that OVF allows for multiple space-separated
     * vs-type values in this property. U007F (Unicode C0 controls)
     * U0080-U009F (Unicode C1 controls) If there is a need to structure the
     * value into segments, the segments should be separated with a single
     * colon (:). The values of this property shall be processed case
     * sensitively. They are intended to be processed programmatically
     * (instead of being a display name) and should be short. The following
     * DMTF values are defined: DMTF:unknown - the resource sub-type is
     * unknown or cannot be determined Developers should consult the relevant
     * profile for defined values.
     *
     * @param	String	new resourceSubType property value
     * @exception	Exception
     */
    public void setResourceSubType(String resourceSubType) {

    this.resourceSubType = resourceSubType;
    } // setResourceSubType


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property poolID.
     */
    private String poolID;
    /**
     * This method returns the ResourceAllocationSettingData.poolID property
     * value. This property is described as follows:
     *
     * This property specifies which ResourcePool the resource is currently
     * allocated from, or which ResourcePool the resource will be allocated
     * from when the allocation occurs.
     *
     * @return	String	current poolID property value
     * @exception	Exception
     */
    public String getPoolID(){

    return this.poolID;
    } // getPoolID

    /**
     * This method sets the ResourceAllocationSettingData.poolID property
     * value. This property is described as follows:
     *
     * This property specifies which ResourcePool the resource is currently
     * allocated from, or which ResourcePool the resource will be allocated
     * from when the allocation occurs.
     *
     * @param	String	new poolID property value
     * @exception	Exception
     */
    public void setPoolID(String poolID) {

    this.poolID = poolID;
    } // setPoolID


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property ConsumerVisibility.
     */

    public enum ConsumerVisibility{
    UNKNOWN,
    PASSED_THROUGH,
    VIRTUALIZED,
    NOT_REPRESENTED,
    DMTF_RESERVED,
    VENDOR_RESERVED
    }
    private ConsumerVisibility consumerVisibility;
    /**
     * This method returns the
     * ResourceAllocationSettingData.consumerVisibility property value. This
     * property is described as follows:
     *
     * Describes the consumers visibility to the allocated resource. A value
     * of "Passed-Through" indicates the underlying or host resource is
     * utilized and passed through to the consumer, possibly using
     * partitioning. At least one item shall be present in the HostResource
     * property. A value of "Virtualized" indicates the resource is
     * virtualized and may not map directly to an underlying/host resource.
     * Some implementations may support specific assignment for virtualized
     * resources, in which case the host resource(s) are exposed using the
     * HostResource property. A value of "Not represented" indicates a
     * representation of the resource does not exist within the context of
     * the resource consumer.
     *
     * @return	int	current consumerVisibility property value
     * @exception	Exception
     */
    public ConsumerVisibility getConsumerVisibility(){

    return this.consumerVisibility;
    } // getConsumerVisibility

    /**
     * This method sets the ResourceAllocationSettingData.consumerVisibility
     * property value. This property is described as follows:
     *
     * Describes the consumers visibility to the allocated resource. A value
     * of "Passed-Through" indicates the underlying or host resource is
     * utilized and passed through to the consumer, possibly using
     * partitioning. At least one item shall be present in the HostResource
     * property. A value of "Virtualized" indicates the resource is
     * virtualized and may not map directly to an underlying/host resource.
     * Some implementations may support specific assignment for virtualized
     * resources, in which case the host resource(s) are exposed using the
     * HostResource property. A value of "Not represented" indicates a
     * representation of the resource does not exist within the context of
     * the resource consumer.
     *
     * @param	int	new consumerVisibility property value
     * @exception	Exception
     */
    public void setConsumerVisibility(ConsumerVisibility
	consumerVisibility){

    this.consumerVisibility = consumerVisibility;
    } // setConsumerVisibility


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property hostResource.
     */
    private String[] hostResource;
    /**
     * This method returns the ResourceAllocationSettingData.hostResource
     * property value. This property is described as follows:
     *
     * This property exposes specific assignment of resources. Each non-null
     * value of the HostResource property shall be formated as a URI per
     * RFC3986. If this resource is modeled then a value should be a WBEM URI
     * (DSP0207). If the resource is not modeled then see the appropriate
     * profile. Profiles may further constrain the type of URI. A NULL value
     * or empty array requests the implementation decide the kind of host
     * resource. If the virtual resource is mapped to more than oneunderlying
     * resource, this property may be left NULL. If NULL, the
     * DeviceAllocatedFromPool or ResourceAllocationFromPool associations may
     * be used to determine the pool of host resources this virtual resource
     * may use. If specific assignment is utilized, all underlying resources
     * used by this virtual resource should be listed.The kind of dependency
     * is specified by the ConsumerVisibility and the MappingBehavior
     * properties. Typically the array contains one item, however multiple
     * host resources may be specified. A client may set the value(s) to
     * indicate that the requested virtual resource allocation be based on
     * host resources that are identified by element values.
     *
     * @return	String[]	current hostResource property value
     * @exception	Exception
     */
    public String[] getHostResource(){

    return this.hostResource;
    } // getHostResource

    /**
     * This method sets the ResourceAllocationSettingData.hostResource
     * property value. This property is described as follows:
     *
     * This property exposes specific assignment of resources. Each non-null
     * value of the HostResource property shall be formated as a URI per
     * RFC3986. If this resource is modeled then a value should be a WBEM URI
     * (DSP0207). If the resource is not modeled then see the appropriate
     * profile. Profiles may further constrain the type of URI. A NULL value
     * or empty array requests the implementation decide the kind of host
     * resource. If the virtual resource is mapped to more than oneunderlying
     * resource, this property may be left NULL. If NULL, the
     * DeviceAllocatedFromPool or ResourceAllocationFromPool associations may
     * be used to determine the pool of host resources this virtual resource
     * may use. If specific assignment is utilized, all underlying resources
     * used by this virtual resource should be listed.The kind of dependency
     * is specified by the ConsumerVisibility and the MappingBehavior
     * properties. Typically the array contains one item, however multiple
     * host resources may be specified. A client may set the value(s) to
     * indicate that the requested virtual resource allocation be based on
     * host resources that are identified by element values.
     *
     * @param	String[]	new hostResource property value
     * @exception	Exception
     */
    public void setHostResource(String[] hostResource) {

    this.hostResource = hostResource;
    } // setHostResource


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property allocationUnits.
     */
    private String allocationUnits;
    /**
     * This method returns the ResourceAllocationSettingData.allocationUnits
     * property value. This property is described as follows:
     *
     * This property specifies the units of allocation used by the Reservation
     * and Limit properties. For example, when ResourceType=Processor,
     * AllocationUnits may be set to hertz*10^6 or percent. When
     * ResourceType=Memory, AllocationUnits may be set to bytes*10^3. It is
     * expected that profiles constrain the units that apply in context of
     * particular resource types. The value of this property shall be a legal
     * value of the Programmatic Units qualifier as defined in Annex C.1 of
     * DSP0004 V2.5 or later.
     *
     * @return	String	current allocationUnits property value
     * @exception	Exception
     */
    public String getAllocationUnits(){

    return this.allocationUnits;
    } // getAllocationUnits

    /**
     * This method sets the ResourceAllocationSettingData.allocationUnits
     * property value. This property is described as follows:
     *
     * This property specifies the units of allocation used by the Reservation
     * and Limit properties. For example, when ResourceType=Processor,
     * AllocationUnits may be set to hertz*10^6 or percent. When
     * ResourceType=Memory, AllocationUnits may be set to bytes*10^3. It is
     * expected that profiles constrain the units that apply in context of
     * particular resource types. The value of this property shall be a legal
     * value of the Programmatic Units qualifier as defined in Annex C.1 of
     * DSP0004 V2.5 or later.
     *
     * @param	String	new allocationUnits property value
     * @exception	Exception
     */
    public void setAllocationUnits(String allocationUnits) {

    this.allocationUnits = allocationUnits;
    } // setAllocationUnits


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property virtualQuantity.
     */
    private long virtualQuantity;
    /**
     * This method returns the ResourceAllocationSettingData.virtualQuantity
     * property value. This property is described as follows:
     *
     * This property specifies the quantity of resources presented to the
     * consumer. For example, when ResourceType=Processor, this property
     * would reflect the number of discrete Processors presented to the
     * virtual computer system. When ResourceType=Memory, this property could
     * reflect the number of MB reported to the virtual computer system. The
     * value of the VirtualQuantity property should be expressed in units as
     * defined by the value of the VirtualQuantityUnits property.
     *
     * @return	long	current virtualQuantity property value
     * @exception	Exception
     */
    public long getVirtualQuantity(){

    return this.virtualQuantity;
    } // getVirtualQuantity

    /**
     * This method sets the ResourceAllocationSettingData.virtualQuantity
     * property value. This property is described as follows:
     *
     * This property specifies the quantity of resources presented to the
     * consumer. For example, when ResourceType=Processor, this property
     * would reflect the number of discrete Processors presented to the
     * virtual computer system. When ResourceType=Memory, this property could
     * reflect the number of MB reported to the virtual computer system. The
     * value of the VirtualQuantity property should be expressed in units as
     * defined by the value of the VirtualQuantityUnits property.
     *
     * @param	long	new virtualQuantity property value
     * @exception	Exception
     */
    public void setVirtualQuantity(long virtualQuantity) {

    this.virtualQuantity = virtualQuantity;
    } // setVirtualQuantity


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property reservation.
     */
    private long reservation;
    /**
     * This method returns the ResourceAllocationSettingData.reservation
     * property value. This property is described as follows:
     *
     * This property specifies the amount of resource guaranteed to be
     * available for this allocation. On system which support over-commitment
     * of resources, this value is typically used for admission control to
     * prevent an an allocation from being accepted thus preventing
     * starvation. The value of the Reservation property is expressed in the
     * unit specified by the value of the AllocationUnits property.
     *
     * @return	long	current reservation property value
     * @exception	Exception
     */
    public long getReservation(){

    return this.reservation;
    } // getReservation

    /**
     * This method sets the ResourceAllocationSettingData.reservation property
     * value. This property is described as follows:
     *
     * This property specifies the amount of resource guaranteed to be
     * available for this allocation. On system which support over-commitment
     * of resources, this value is typically used for admission control to
     * prevent an an allocation from being accepted thus preventing
     * starvation. The value of the Reservation property is expressed in the
     * unit specified by the value of the AllocationUnits property.
     *
     * @param	long	new reservation property value
     * @exception	Exception
     */
    public void setReservation(long reservation) {

    this.reservation = reservation;
    } // setReservation


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property limit.
     */
    private long limit;
    /**
     * This method returns the ResourceAllocationSettingData.limit property
     * value. This property is described as follows:
     *
     * This property specifies the upper bound, or maximum amount of resource
     * that will be granted for this allocation. For example, a system which
     * supports memory paging may support setting the Limit of a Memory
     * allocation below that of the VirtualQuantity, thus forcing paging to
     * occur for this allocation. The value of the Limit property is
     * expressed in the unit specified by the value of the AllocationUnits
     * property.
     *
     * @return	long	current limit property value
     * @exception	Exception
     */
    public long getLimit(){

    return this.limit;
    } // getLimit

    /**
     * This method sets the ResourceAllocationSettingData.limit property
     * value. This property is described as follows:
     *
     * This property specifies the upper bound, or maximum amount of resource
     * that will be granted for this allocation. For example, a system which
     * supports memory paging may support setting the Limit of a Memory
     * allocation below that of the VirtualQuantity, thus forcing paging to
     * occur for this allocation. The value of the Limit property is
     * expressed in the unit specified by the value of the AllocationUnits
     * property.
     *
     * @param	long	new limit property value
     * @exception	Exception
     */
    public void setLimit(long limit) {

    this.limit = limit;
    } // setLimit


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property weight.
     */
    private long weight;
    /**
     * This method returns the ResourceAllocationSettingData.weight property
     * value. This property is described as follows:
     *
     * This property specifies a relative priority for this allocation in
     * relation to other allocations from the same ResourcePool. This
     * property has no unit of measure, and is only relevant when compared to
     * other allocations vying for the same host resources.
     *
     * @return	long	current weight property value
     * @exception	Exception
     */
    public long getWeight(){

    return this.weight;
    } // getWeight

    /**
     * This method sets the ResourceAllocationSettingData.weight property
     * value. This property is described as follows:
     *
     * This property specifies a relative priority for this allocation in
     * relation to other allocations from the same ResourcePool. This
     * property has no unit of measure, and is only relevant when compared to
     * other allocations vying for the same host resources.
     *
     * @param	long	new weight property value
     * @exception	Exception
     */
    public void setWeight(long weight) {

    this.weight = weight;
    } // setWeight


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property automaticAllocation.
     */
    private boolean automaticAllocation;
    /**
     * This method returns the
     * ResourceAllocationSettingData.automaticAllocation property value. This
     * property is described as follows:
     *
     * This property specifies if the resource will be automatically
     * allocated. For example when set to true, when the consuming virtual
     * computer system is powered on, this resource would be allocated. A
     * value of false indicates the resource must be explicitly allocated.
     * For example, the setting may represent removable media (cdrom, floppy,
     * etc.) where at power on time, the media is not present. An explicit
     * operation is required to allocate the resource.
     *
     * @return	boolean	current automaticAllocation property
     * value
     * @exception	Exception
     */
    public boolean isAutomaticAllocation(){

    return this.automaticAllocation;
    } // getAutomaticAllocation

    /**
     * This method sets the ResourceAllocationSettingData.automaticAllocation
     * property value. This property is described as follows:
     *
     * This property specifies if the resource will be automatically
     * allocated. For example when set to true, when the consuming virtual
     * computer system is powered on, this resource would be allocated. A
     * value of false indicates the resource must be explicitly allocated.
     * For example, the setting may represent removable media (cdrom, floppy,
     * etc.) where at power on time, the media is not present. An explicit
     * operation is required to allocate the resource.
     *
     * @param	boolean	new automaticAllocation property value
     * @exception	Exception
     */
    public void setAutomaticAllocation(boolean automaticAllocation) {

    this.automaticAllocation = automaticAllocation;
    } // setAutomaticAllocation


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property automaticDeallocation.
     */
    private boolean automaticDeallocation;
    /**
     * This method returns the
     * ResourceAllocationSettingData.automaticDeallocation property value.
     * This property is described as follows:
     *
     * This property specifies if the resource will be automatically
     * de-allocated. For example, when set to true, when the consuming
     * virtual computer system is powered off, this resource would be
     * de-allocated. When set to false, the resource will remain allocated
     * and must be explicitly de-allocated.
     *
     * @return	boolean	current automaticDeallocation property
     * value
     * @exception	Exception
     */
    public boolean isAutomaticDeallocation(){

    return this.automaticDeallocation;
    } // getAutomaticDeallocation

    /**
     * This method sets the
     * ResourceAllocationSettingData.automaticDeallocation property value.
     * This property is described as follows:
     *
     * This property specifies if the resource will be automatically
     * de-allocated. For example, when set to true, when the consuming
     * virtual computer system is powered off, this resource would be
     * de-allocated. When set to false, the resource will remain allocated
     * and must be explicitly de-allocated.
     *
     * @param	boolean	new automaticDeallocation property value
     * @exception	Exception
     */
    public void setAutomaticDeallocation(boolean automaticDeallocation) {

    this.automaticDeallocation = automaticDeallocation;
    } // setAutomaticDeallocation


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property parent.
     */
    private String parent;
    /**
     * This method returns the ResourceAllocationSettingData.parent property
     * value. This property is described as follows:
     *
     * The Parent of the resource. For example, a controller for the current
     * allocation
     *
     * @return	String	current parent property value
     * @exception	Exception
     */
    public String getParent(){

    return this.parent;
    } // getParent

    /**
     * This method sets the ResourceAllocationSettingData.parent property
     * value. This property is described as follows:
     *
     * The Parent of the resource. For example, a controller for the current
     * allocation
     *
     * @param	String	new parent property value
     * @exception	Exception
     */
    public void setParent(String parent) {

    this.parent = parent;
    } // setParent


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property connection.
     */
    private String[] connection;
    /**
     * This method returns the ResourceAllocationSettingData.connection
     * property value. This property is described as follows:
     *
     * The thing to which this resource is connected. For example, a named
     * network or switch port.
     *
     * @return	String[]	current connection property value
     * @exception	Exception
     */
    public String[] getConnection(){

    return this.connection;
    } // getConnection

    /**
     * This method sets the ResourceAllocationSettingData.connection property
     * value. This property is described as follows:
     *
     * The thing to which this resource is connected. For example, a named
     * network or switch port.
     *
     * @param	String[]	new connection property value
     * @exception	Exception
     */
    public void setConnection(String[] connection) {

    this.connection = connection;
    } // setConnection


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property address.
     */
    private String address;
    /**
     * This method returns the ResourceAllocationSettingData.address property
     * value. This property is described as follows:
     *
     * The address of the resource. For example, the MAC address of a Ethernet
     * port.
     *
     * @return	String	current address property value
     * @exception	Exception
     */
    public String getAddress(){

    return this.address;
    } // getAddress

    /**
     * This method sets the ResourceAllocationSettingData.address property
     * value. This property is described as follows:
     *
     * The address of the resource. For example, the MAC address of a Ethernet
     * port.
     *
     * @param	String	new address property value
     * @exception	Exception
     */
    public void setAddress(String address) {

    this.address = address;
    } // setAddress


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property MappingBehavior.
     */

    public enum MappingBehavior{
    UNKNOWN,
    NOT_SUPPORTED,
    DEDICATED,
    SOFT_AFFINITY,
    HARD_AFFINITY,
    DMTF_RESERVED,
    VENDOR_RESERVED
    }
    private MappingBehavior mappingBehavior;
    /**
     * This method returns the ResourceAllocationSettingData.mappingBehavior
     * property value. This property is described as follows:
     *
     * Specifies how this resource maps to underlying resourcesIf the
     * HostResource array contains any entries, this property reflects how
     * the resource maps to those specific resources.
     *
     * @return	int	current mappingBehavior property value
     * @exception	Exception
     */
    public MappingBehavior getMappingBehavior(){

    return this.mappingBehavior;
    } // getMappingBehavior

    /**
     * This method sets the ResourceAllocationSettingData.mappingBehavior
     * property value. This property is described as follows:
     *
     * Specifies how this resource maps to underlying resourcesIf the
     * HostResource array contains any entries, this property reflects how
     * the resource maps to those specific resources.
     *
     * @param	int	new mappingBehavior property value
     * @exception	Exception
     */
    public void setMappingBehavior(MappingBehavior mappingBehavior){

    this.mappingBehavior = mappingBehavior;
    } // setMappingBehavior


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property addressOnParent.
     */
    private String addressOnParent;
    /**
     * This method returns the ResourceAllocationSettingData.addressOnParent
     * property value. This property is described as follows:
     *
     * Describes the address of this resource in the context of the Parent.
     * The Parent/AddressOnParent properties are used to describe the
     * controller relationship as well the ordering of devices on a
     * controller.For example, if the parent is a PCI Controller, this
     * property would specify the PCI slot of this child device.
     *
     * @return	String	current addressOnParent property value
     * @exception	Exception
     */
    public String getAddressOnParent(){

    return this.addressOnParent;
    } // getAddressOnParent

    /**
     * This method sets the ResourceAllocationSettingData.addressOnParent
     * property value. This property is described as follows:
     *
     * Describes the address of this resource in the context of the Parent.
     * The Parent/AddressOnParent properties are used to describe the
     * controller relationship as well the ordering of devices on a
     * controller.For example, if the parent is a PCI Controller, this
     * property would specify the PCI slot of this child device.
     *
     * @param	String	new addressOnParent property value
     * @exception	Exception
     */
    public void setAddressOnParent(String addressOnParent) {

    this.addressOnParent = addressOnParent;
    } // setAddressOnParent


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property virtualQuantityUnits.
     */
    private String virtualQuantityUnits;
    /**
     * This method returns the
     * ResourceAllocationSettingData.virtualQuantityUnits property value.
     * This property is described as follows:
     *
     * This property specifies the units used by the VirtualQuantity property.
     * For example - if ResourceType=Processor, the value of the
     * VirtualQuantityUnits property may be set to "count", indicating that
     * the value of the VirtualQuantity property is expressed as a count. -
     * if ResourceType=Memory, the value of the VirtualQuantityUnits property
     * may be set to "bytes*10^3", indicating that the value of the
     * VirtualQuantity property is expressed in kilobyte. It is expected that
     * profiles constrain the units that apply in context of particular
     * resource types. The value of this property shall be a legal value of
     * the Programmatic Units qualifier as defined in Annex C.1 of DSP0004
     * V2.5 or later.
     *
     * @return	String	current virtualQuantityUnits property
     * value
     * @exception	Exception
     */
    public String getVirtualQuantityUnits(){

    return this.virtualQuantityUnits;
    } // getVirtualQuantityUnits

    /**
     * This method sets the ResourceAllocationSettingData.virtualQuantityUnits
     * property value. This property is described as follows:
     *
     * This property specifies the units used by the VirtualQuantity property.
     * For example - if ResourceType=Processor, the value of the
     * VirtualQuantityUnits property may be set to "count", indicating that
     * the value of the VirtualQuantity property is expressed as a count. -
     * if ResourceType=Memory, the value of the VirtualQuantityUnits property
     * may be set to "bytes*10^3", indicating that the value of the
     * VirtualQuantity property is expressed in kilobyte. It is expected that
     * profiles constrain the units that apply in context of particular
     * resource types. The value of this property shall be a legal value of
     * the Programmatic Units qualifier as defined in Annex C.1 of DSP0004
     * V2.5 or later.
     *
     * @param	String	new virtualQuantityUnits property value
     * @exception	Exception
     */
    public void setVirtualQuantityUnits(String virtualQuantityUnits) {

    this.virtualQuantityUnits = virtualQuantityUnits;
    } // setVirtualQuantityUnits



} // Class ResourceAllocationSettingData
