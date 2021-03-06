/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class LogicalPortGroup as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the
 * LogicalPortGroupBean Interface. The CIM class LogicalPortGroup is
 * described as follows:
 *
 * A collection of one or more ports that are logically grouped for
 * administrative and discovery or topology purposes. LogicalPortGroups
 * define port collections for access control, or for use in routing policy
 * or other management tasks. For example, in Fibre Channel and Infiniband, a
 * LogicalPortGroup represents the concept of a 'node'.
 */
public class LogicalPortGroup extends SystemSpecificCollection implements
    Serializable {

    /**
     * This constructor creates a LogicalPortGroupBeanImpl Class which
     * implements the LogicalPortGroupBean Interface, and encapsulates the
     * CIM class LogicalPortGroup in a Java Bean. The CIM class
     * LogicalPortGroup is described as follows:
     *
     * A collection of one or more ports that are logically grouped for
     * administrative and discovery or topology purposes. LogicalPortGroups
     * define port collections for access control, or for use in routing
     * policy or other management tasks. For example, in Fibre Channel and
     * Infiniband, a LogicalPortGroup represents the concept of a 'node'.
     */
    public LogicalPortGroup(){};
    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property name.
     */
    private String name;
    /**
     * This method returns the LogicalPortGroup.name property value. This
     * property is described as follows:
     *
     * The Name property defines the identity by which the LogicalPortGroup is
     * known.
     *
     * @return	String	current name property value
     * @exception	Exception
     */
    public String getName(){

    return this.name;
    } // getName

    /**
     * This method sets the LogicalPortGroup.name property value. This
     * property is described as follows:
     *
     * The Name property defines the identity by which the LogicalPortGroup is
     * known.
     *
     * @param	String	new name property value
     * @exception	Exception
     */
    public void setName(String name) {

    this.name = name;
    } // setName


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property NameFormat.
     */

    public enum NameFormat{
    UNKNOWN,
    OTHER,
    WWN,
    GUID
    }
    private NameFormat nameFormat;
    /**
     * This method returns the LogicalPortGroup.nameFormat property value.
     * This property is described as follows:
     *
     * The NameFormat property identifies how the Name of the LogicalPortGroup
     * is generated.
     *
     * @return	String	current nameFormat property value
     * @exception	Exception
     */
    public NameFormat getNameFormat(){

    return this.nameFormat;
    } // getNameFormat

    /**
     * This method sets the LogicalPortGroup.nameFormat property value. This
     * property is described as follows:
     *
     * The NameFormat property identifies how the Name of the LogicalPortGroup
     * is generated.
     *
     * @param	String	new nameFormat property value
     * @exception	Exception
     */
    public void setNameFormat(NameFormat nameFormat){

    this.nameFormat = nameFormat;
    } // setNameFormat


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property otherNameFormat.
     */
    private String otherNameFormat;
    /**
     * This method returns the LogicalPortGroup.otherNameFormat property
     * value. This property is described as follows:
     *
     * A string that describes how the LogicalPortGroup is identified when the
     * NameFormat is "Other".
     *
     * @return	String	current otherNameFormat property value
     * @exception	Exception
     */
    public String getOtherNameFormat(){

    return this.otherNameFormat;
    } // getOtherNameFormat

    /**
     * This method sets the LogicalPortGroup.otherNameFormat property value.
     * This property is described as follows:
     *
     * A string that describes how the LogicalPortGroup is identified when the
     * NameFormat is "Other".
     *
     * @param	String	new otherNameFormat property value
     * @exception	Exception
     */
    public void setOtherNameFormat(String otherNameFormat) {

    this.otherNameFormat = otherNameFormat;
    } // setOtherNameFormat



} // Class LogicalPortGroup
