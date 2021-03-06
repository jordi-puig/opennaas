/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class ToSMarkerService as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the
 * ToSMarkerServiceBean Interface. The CIM class ToSMarkerService is
 * described as follows:
 *
 * ToSMarkerService marks the ToS (type of service) field in the IPv4 packet
 * header [R791] with a specific value. Packets are marked in order to
 * control the conditioning that they will subsequently receive. Following
 * common practice, the value to be written into the ToS field is represented
 * as an unsigned 8-bit integer.
 */
public class ToSMarkerService extends MarkerService implements Serializable
    {

    /**
     * This constructor creates a ToSMarkerServiceBeanImpl Class which
     * implements the ToSMarkerServiceBean Interface, and encapsulates the
     * CIM class ToSMarkerService in a Java Bean. The CIM class
     * ToSMarkerService is described as follows:
     *
     * ToSMarkerService marks the ToS (type of service) field in the IPv4
     * packet header [R791] with a specific value. Packets are marked in
     * order to control the conditioning that they will subsequently receive.
     * Following common practice, the value to be written into the ToS field
     * is represented as an unsigned 8-bit integer.
     */
    public ToSMarkerService(){};
    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property toSValue.
     */
    private short toSValue;
    /**
     * This method returns the ToSMarkerService.toSValue property value. This
     * property is described as follows:
     *
     * This property is an unsigned 8-bit integer, representing a value to be
     * used for marking the type of service (ToS) field in the IPv4 packet
     * header. The ToS field is defined to be a complete octet, so the range
     * for this property is 0..255. Some implementations, however, require
     * that the lowest-order bit in the field is always 0. Such an
     * implementation cannot support an odd TosValue.
     *
     * @return	short	current toSValue property value
     * @exception	Exception
     */
    public short getToSValue(){

    return this.toSValue;
    } // getToSValue

    /**
     * This method sets the ToSMarkerService.toSValue property value. This
     * property is described as follows:
     *
     * This property is an unsigned 8-bit integer, representing a value to be
     * used for marking the type of service (ToS) field in the IPv4 packet
     * header. The ToS field is defined to be a complete octet, so the range
     * for this property is 0..255. Some implementations, however, require
     * that the lowest-order bit in the field is always 0. Such an
     * implementation cannot support an odd TosValue.
     *
     * @param	short	new toSValue property value
     * @exception	Exception
     */
    public void setToSValue(short toSValue) {

    this.toSValue = toSValue;
    } // setToSValue



} // Class ToSMarkerService
