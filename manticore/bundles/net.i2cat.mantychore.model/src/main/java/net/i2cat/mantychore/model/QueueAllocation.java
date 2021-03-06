/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class QueueAllocation as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the
 * QueueAllocationBean Interface. The CIM class QueueAllocation is described
 * as follows:
 *
 * Describes the reliance of a QueuingService on the availability of space in
 * a BufferPool.
 */
public class QueueAllocation extends Dependency implements Serializable {

    /**
     * This constructor creates a QueueAllocationBeanImpl Class which
     * implements the QueueAllocationBean Interface, and encapsulates the CIM
     * class QueueAllocation in a Java Bean. The CIM class QueueAllocation is
     * described as follows:
     *
     * Describes the reliance of a QueuingService on the availability of space
     * in a BufferPool.
     */
    public QueueAllocation(){};
    /**
     * This method create an Association of the type QueueAllocation between
     * one BufferPool object and QueuingService object
     */
    public static QueueAllocation link(BufferPool antecedent,QueuingService
	dependent){

    return (QueueAllocation)
	Association.link(QueueAllocation.class,antecedent,dependent);
    }//link
    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property allocationPercentage.
     */
    private short allocationPercentage;
    /**
     * This method returns the QueueAllocation.allocationPercentage property
     * value. This property is described as follows:
     *
     * This property is an 8-bit unsigned integer representing a percentage
     * from 0 to 100. It defines the percentage of the BufferPool that should
     * be allocated to the referenced QueuingService. If absolute sizes are
     * desired, this is accomplished by defining individual BufferPools of
     * the specified sizes, with QueueAllocation.AllocationPercentages set to
     * 100.
     *
     * @return	short	current allocationPercentage property value
     * @exception	Exception
     */
    public short getAllocationPercentage(){

    return this.allocationPercentage;
    } // getAllocationPercentage

    /**
     * This method sets the QueueAllocation.allocationPercentage property
     * value. This property is described as follows:
     *
     * This property is an 8-bit unsigned integer representing a percentage
     * from 0 to 100. It defines the percentage of the BufferPool that should
     * be allocated to the referenced QueuingService. If absolute sizes are
     * desired, this is accomplished by defining individual BufferPools of
     * the specified sizes, with QueueAllocation.AllocationPercentages set to
     * 100.
     *
     * @param	short	new allocationPercentage property value
     * @exception	Exception
     */
    public void setAllocationPercentage(short allocationPercentage) {

    this.allocationPercentage = allocationPercentage;
    } // setAllocationPercentage



} // Class QueueAllocation
