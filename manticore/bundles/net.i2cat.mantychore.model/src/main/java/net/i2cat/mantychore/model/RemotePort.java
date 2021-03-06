/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class RemotePort as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the
 * RemotePortBean Interface. The CIM class RemotePort is described as
 * follows:
 *
 * RemotePort adds port information to the access data (such as IP Address)
 * that is specified in and inherited from RemoteServiceAccessPoint. For
 * example, using the additional properties in this class, you could indicate
 * that UDP Port 123 is accessed at IP Address xyz. The IP Address would be
 * specified in the inherited AccessInfo property, while the UDP Port number
 * would be specified in the PortInfo property of this class.
 */
public class RemotePort extends RemoteServiceAccessPoint implements
    Serializable {

    /**
     * This constructor creates a RemotePortBeanImpl Class which implements
     * the RemotePortBean Interface, and encapsulates the CIM class
     * RemotePort in a Java Bean. The CIM class RemotePort is described as
     * follows:
     *
     * RemotePort adds port information to the access data (such as IP
     * Address) that is specified in and inherited from
     * RemoteServiceAccessPoint. For example, using the additional properties
     * in this class, you could indicate that UDP Port 123 is accessed at IP
     * Address xyz. The IP Address would be specified in the inherited
     * AccessInfo property, while the UDP Port number would be specified in
     * the PortInfo property of this class.
     */
    public RemotePort(){};
    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property portInfo.
     */
    private String portInfo;
    /**
     * This method returns the RemotePort.portInfo property value. This
     * property is described as follows:
     *
     * Port information that might further specify the remote access
     * information.
     *
     * @return	String	current portInfo property value
     * @exception	Exception
     */
    public String getPortInfo(){

    return this.portInfo;
    } // getPortInfo

    /**
     * This method sets the RemotePort.portInfo property value. This property
     * is described as follows:
     *
     * Port information that might further specify the remote access
     * information.
     *
     * @param	String	new portInfo property value
     * @exception	Exception
     */
    public void setPortInfo(String portInfo) {

    this.portInfo = portInfo;
    } // setPortInfo


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property PortProtocol.
     */

    public enum PortProtocol{
    OTHER,
    TCP,
    UDP,
    VENDOR_SPECIFIC
    }
    private PortProtocol portProtocol;
    /**
     * This method returns the RemotePort.portProtocol property value. This
     * property is described as follows:
     *
     * An enumerated integer that describes the protocol of the port that is
     * addressed by PortInformation.
     *
     * @return	int	current portProtocol property value
     * @exception	Exception
     */
    public PortProtocol getPortProtocol(){

    return this.portProtocol;
    } // getPortProtocol

    /**
     * This method sets the RemotePort.portProtocol property value. This
     * property is described as follows:
     *
     * An enumerated integer that describes the protocol of the port that is
     * addressed by PortInformation.
     *
     * @param	int	new portProtocol property value
     * @exception	Exception
     */
    public void setPortProtocol(PortProtocol portProtocol){

    this.portProtocol = portProtocol;
    } // setPortProtocol


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property otherProtocolDescription.
     */
    private String otherProtocolDescription;
    /**
     * This method returns the RemotePort.otherProtocolDescription property
     * value. This property is described as follows:
     *
     * Describes the protocol when the property PortProtocol is set to 1
     * (Other).
     *
     * @return	String	current otherProtocolDescription property
     * value
     * @exception	Exception
     */
    public String getOtherProtocolDescription(){

    return this.otherProtocolDescription;
    } // getOtherProtocolDescription

    /**
     * This method sets the RemotePort.otherProtocolDescription property
     * value. This property is described as follows:
     *
     * Describes the protocol when the property PortProtocol is set to 1
     * (Other).
     *
     * @param	String	new otherProtocolDescription property value
     * @exception	Exception
     */
    public void setOtherProtocolDescription(String otherProtocolDescription)
	{

    this.otherProtocolDescription = otherProtocolDescription;
    } // setOtherProtocolDescription



} // Class RemotePort
