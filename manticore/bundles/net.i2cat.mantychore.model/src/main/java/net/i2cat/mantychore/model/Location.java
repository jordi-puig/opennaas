/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class Location as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the
 * LocationBean Interface. The CIM class Location is described as follows:
 *
 * The Location class specifies the position and address of a PhysicalElement.
 */
public class Location extends ManagedElement implements Serializable {

    /**
     * This constructor creates a LocationBeanImpl Class which implements the
     * LocationBean Interface, and encapsulates the CIM class Location in a
     * Java Bean. The CIM class Location is described as follows:
     *
     * The Location class specifies the position and address of a
     * PhysicalElement.
     */
    public Location(){};
    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property name.
     */
    private String name;
    /**
     * This method returns the Location.name property value. This property is
     * described as follows:
     *
     * Name is a free-form string defining a label for the Location. It is a
     * part of the key for the object.
     *
     * @return	String	current name property value
     * @exception	Exception
     */
    public String getName(){

    return this.name;
    } // getName

    /**
     * This method sets the Location.name property value. This property is
     * described as follows:
     *
     * Name is a free-form string defining a label for the Location. It is a
     * part of the key for the object.
     *
     * @param	String	new name property value
     * @exception	Exception
     */
    public void setName(String name) {

    this.name = name;
    } // setName


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property physicalPosition.
     */
    private String physicalPosition;
    /**
     * This method returns the Location.physicalPosition property value. This
     * property is described as follows:
     *
     * Position is a free-form string that indicates the placement of a
     * PhysicalElement. It can specify slot information on a HostingBoard,
     * mounting site in a Cabinet, or latitude and longitude information, for
     * example, from a GPS. It is part of the key of the Location object.
     *
     * @return	String	current physicalPosition property value
     * @exception	Exception
     */
    public String getPhysicalPosition(){

    return this.physicalPosition;
    } // getPhysicalPosition

    /**
     * This method sets the Location.physicalPosition property value. This
     * property is described as follows:
     *
     * Position is a free-form string that indicates the placement of a
     * PhysicalElement. It can specify slot information on a HostingBoard,
     * mounting site in a Cabinet, or latitude and longitude information, for
     * example, from a GPS. It is part of the key of the Location object.
     *
     * @param	String	new physicalPosition property value
     * @exception	Exception
     */
    public void setPhysicalPosition(String physicalPosition) {

    this.physicalPosition = physicalPosition;
    } // setPhysicalPosition


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property address.
     */
    private String address;
    /**
     * This method returns the Location.address property value. This property
     * is described as follows:
     *
     * Address is a free-form string indicating a street, building, or other
     * type of address for the location of the PhysicalElement.
     *
     * @return	String	current address property value
     * @exception	Exception
     */
    public String getAddress(){

    return this.address;
    } // getAddress

    /**
     * This method sets the Location.address property value. This property is
     * described as follows:
     *
     * Address is a free-form string indicating a street, building, or other
     * type of address for the location of the PhysicalElement.
     *
     * @param	String	new address property value
     * @exception	Exception
     */
    public void setAddress(String address) {

    this.address = address;
    } // setAddress



} // Class Location
