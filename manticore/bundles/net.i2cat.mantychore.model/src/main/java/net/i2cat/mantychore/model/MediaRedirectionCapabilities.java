/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class MediaRedirectionCapabilities as well as methods
 * comparable to the invokeMethods defined for this class. This Class
 * implements the MediaRedirectionCapabilitiesBean Interface. The CIM class
 * MediaRedirectionCapabilities is described as follows:
 *
 * MediaRedirectionCapabilities describes the capabilities of the Media
 * Redirection Service.
 */
public class MediaRedirectionCapabilities extends
    RedirectionServiceCapabilities implements Serializable {

    /**
     * This constructor creates a MediaRedirectionCapabilitiesBeanImpl Class
     * which implements the MediaRedirectionCapabilitiesBean Interface, and
     * encapsulates the CIM class MediaRedirectionCapabilities in a Java
     * Bean. The CIM class MediaRedirectionCapabilities is described as
     * follows:
     *
     * MediaRedirectionCapabilities describes the capabilities of the Media
     * Redirection Service.
     */
    public MediaRedirectionCapabilities(){};
    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property ConnectionModesSupported.
     */

    public enum ConnectionModesSupported{
    UNKNOWN,
    LISTEN,
    CONNECT,
    DMTF_RESERVED,
    VENDOR_SPECIFIED
    }
    private ConnectionModesSupported connectionModesSupported;
    /**
     * This method returns the
     * MediaRedirectionCapabilities.connectionModesSupported property value.
     * This property is described as follows:
     *
     * The connection mode used to configure the session. A value set to 2 =
     * "Listen" shall indicate that the SAP will listen for a connection
     * request from the remote Media redirection server. A CIM_BindsTo
     * association to a CIM_ProtocolEndoint may be used to represent where
     * the SAP is listening for the connection request. A value set to 3 =
     * "Connect" shall indicate that the the SAP shall initiate the
     * connection to the remote Media redirection server. A
     * CIM_RemoteAccessAvailableToElement association to a
     * CIM_RemoteServiceAccessPoint may be used to represent where the SAP
     * shall connect to the remote Media redirection server.
     *
     * @return	int	current connectionModesSupported property
     * value
     * @exception	Exception
     */
    public ConnectionModesSupported getConnectionModesSupported(){

    return this.connectionModesSupported;
    } // getConnectionModesSupported

    /**
     * This method sets the
     * MediaRedirectionCapabilities.connectionModesSupported property value.
     * This property is described as follows:
     *
     * The connection mode used to configure the session. A value set to 2 =
     * "Listen" shall indicate that the SAP will listen for a connection
     * request from the remote Media redirection server. A CIM_BindsTo
     * association to a CIM_ProtocolEndoint may be used to represent where
     * the SAP is listening for the connection request. A value set to 3 =
     * "Connect" shall indicate that the the SAP shall initiate the
     * connection to the remote Media redirection server. A
     * CIM_RemoteAccessAvailableToElement association to a
     * CIM_RemoteServiceAccessPoint may be used to represent where the SAP
     * shall connect to the remote Media redirection server.
     *
     * @param	int	new connectionModesSupported property value
     * @exception	Exception
     */
    public void setConnectionModesSupported(ConnectionModesSupported
	connectionModesSupported){

    this.connectionModesSupported = connectionModesSupported;
    } // setConnectionModesSupported


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property DevicesSupported.
     */

    public enum DevicesSupported{
    UNKNOWN,
    CIM_CDROMDRIVE,
    CIM_DISKDRIVE,
    CIM_DISKETTEDRIVE,
    CIM_DVDDRIVE,
    CIM_MAGNETOOPTICALDRIVE,
    CIM_TAPDRIVE,
    CIM_WORMDRIVE,
    DMTF__RESERVED,
    VENDOR__SPECIFIED
    }
    private DevicesSupported devicesSupported;
    /**
     * This method returns the MediaRedirectionCapabilities.devicesSupported
     * property value. This property is described as follows:
     *
     * An enumeration indicating the types of Media Devices which are
     * supported by the Media Redirection Service. Note that each entry of
     * this array is related to the entry in the MaxDevicesSupported array
     * that is located at the same index.
     *
     * @return	int	current devicesSupported property value
     * @exception	Exception
     */
    public DevicesSupported getDevicesSupported(){

    return this.devicesSupported;
    } // getDevicesSupported

    /**
     * This method sets the MediaRedirectionCapabilities.devicesSupported
     * property value. This property is described as follows:
     *
     * An enumeration indicating the types of Media Devices which are
     * supported by the Media Redirection Service. Note that each entry of
     * this array is related to the entry in the MaxDevicesSupported array
     * that is located at the same index.
     *
     * @param	int	new devicesSupported property value
     * @exception	Exception
     */
    public void setDevicesSupported(DevicesSupported devicesSupported){

    this.devicesSupported = devicesSupported;
    } // setDevicesSupported


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property maxDevicesSupported.
     */
    private int[] maxDevicesSupported;
    /**
     * This method returns the
     * MediaRedirectionCapabilities.maxDevicesSupported property value. This
     * property is described as follows:
     *
     * An enumeration indicating the number of Media devices which are
     * supported for the devices specified in the DevicesSupported array
     * property. Note that each entry of this array is related to the entry
     * in the DevicesSupported that is located at the same index.
     *
     * @return	int[]	current maxDevicesSupported property value
     * @exception	Exception
     */
    public int[] getMaxDevicesSupported(){

    return this.maxDevicesSupported;
    } // getMaxDevicesSupported

    /**
     * This method sets the MediaRedirectionCapabilities.maxDevicesSupported
     * property value. This property is described as follows:
     *
     * An enumeration indicating the number of Media devices which are
     * supported for the devices specified in the DevicesSupported array
     * property. Note that each entry of this array is related to the entry
     * in the DevicesSupported that is located at the same index.
     *
     * @param	int[]	new maxDevicesSupported property value
     * @exception	Exception
     */
    public void setMaxDevicesSupported(int[] maxDevicesSupported) {

    this.maxDevicesSupported = maxDevicesSupported;
    } // setMaxDevicesSupported


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property maxDevicesPerSAP.
     */
    private int[] maxDevicesPerSAP;
    /**
     * This method returns the MediaRedirectionCapabilities.maxDevicesPerSAP
     * property value. This property is described as follows:
     *
     * An enumeration indicating the number of Media devices per
     * MediaRedirection Session which are supported for the devices specified
     * in the DevicesSupported array property. Note that each entry of this
     * array is related to the engry in the DevicesSupported array that is
     * located at the same index.
     *
     * @return	int[]	current maxDevicesPerSAP property value
     * @exception	Exception
     */
    public int[] getMaxDevicesPerSAP(){

    return this.maxDevicesPerSAP;
    } // getMaxDevicesPerSAP

    /**
     * This method sets the MediaRedirectionCapabilities.maxDevicesPerSAP
     * property value. This property is described as follows:
     *
     * An enumeration indicating the number of Media devices per
     * MediaRedirection Session which are supported for the devices specified
     * in the DevicesSupported array property. Note that each entry of this
     * array is related to the engry in the DevicesSupported array that is
     * located at the same index.
     *
     * @param	int[]	new maxDevicesPerSAP property value
     * @exception	Exception
     */
    public void setMaxDevicesPerSAP(int[] maxDevicesPerSAP) {

    this.maxDevicesPerSAP = maxDevicesPerSAP;
    } // setMaxDevicesPerSAP


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property SAPCapabilitiesSupported.
     */

    public enum SAPCapabilitiesSupported{
    UNKNOWN,
    MODIFY_SAP,
    DMTF_RESERVED,
    VENDOR_SPECIFIED
    }
    private SAPCapabilitiesSupported sAPCapabilitiesSupported;
    /**
     * This method returns the
     * MediaRedirectionCapabilities.sAPCapabilitiesSupported property value.
     * This property is described as follows:
     *
     * An enumeration indicating the whether instances of USBRedirectionSAPs
     * already exist and whether whether SAPs can be created. A value set to
     * 2 = "Modify Timeouts" shall indicate that the timeout parameters of
     * instances of CIM_USBRedirectionSAP can be modified by applications
     * using 'ModifyInstance'
     *
     * @return	int	current sAPCapabilitiesSupported property
     * value
     * @exception	Exception
     */
    public SAPCapabilitiesSupported getSAPCapabilitiesSupported(){

    return this.sAPCapabilitiesSupported;
    } // getSAPCapabilitiesSupported

    /**
     * This method sets the
     * MediaRedirectionCapabilities.sAPCapabilitiesSupported property value.
     * This property is described as follows:
     *
     * An enumeration indicating the whether instances of USBRedirectionSAPs
     * already exist and whether whether SAPs can be created. A value set to
     * 2 = "Modify Timeouts" shall indicate that the timeout parameters of
     * instances of CIM_USBRedirectionSAP can be modified by applications
     * using 'ModifyInstance'
     *
     * @param	int	new sAPCapabilitiesSupported property value
     * @exception	Exception
     */
    public void setSAPCapabilitiesSupported(SAPCapabilitiesSupported
	sAPCapabilitiesSupported){

    this.sAPCapabilitiesSupported = sAPCapabilitiesSupported;
    } // setSAPCapabilitiesSupported


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property InfoFormatsSupported.
     */

    public enum InfoFormatsSupported{
    OTHER,
    HOST_NAME,
    IPV4_ADDRESS,
    IPV6_ADDRESS,
    IPX_ADDRESS,
    DECNET_ADDRESS,
    SNA_ADDRESS,
    IPV4_SUBNET_ADDRESS,
    IPV6_SUBNET_ADDRESS,
    IPV4_ADDRESS_RANGE,
    IPV6_ADDRESS_RANGE,
    DIAL_STRING,
    ETHERNET_ADDRESS,
    TOKEN_RING_ADDRESS,
    URL,
    FQDN,
    USER_FQDN,
    DER_ASN1_DN,
    DER_ASN1_GN,
    KEY_ID,
    DMTF_RESERVED,
    VENDOR_RESERVED
    }
    private InfoFormatsSupported infoFormatsSupported;
    /**
     * This method returns the
     * MediaRedirectionCapabilities.infoFormatsSupported property value. This
     * property is described as follows:
     *
     * An enumeration indicating which of the formats for
     * CIM_RemoteServiceAccessPoint.InfoFormat are supported by the Media
     * Redirection Service.
     *
     * @return	int	current infoFormatsSupported property value
     * @exception	Exception
     */
    public InfoFormatsSupported getInfoFormatsSupported(){

    return this.infoFormatsSupported;
    } // getInfoFormatsSupported

    /**
     * This method sets the MediaRedirectionCapabilities.infoFormatsSupported
     * property value. This property is described as follows:
     *
     * An enumeration indicating which of the formats for
     * CIM_RemoteServiceAccessPoint.InfoFormat are supported by the Media
     * Redirection Service.
     *
     * @param	int	new infoFormatsSupported property value
     * @exception	Exception
     */
    public void setInfoFormatsSupported(InfoFormatsSupported
	infoFormatsSupported){

    this.infoFormatsSupported = infoFormatsSupported;
    } // setInfoFormatsSupported



} // Class MediaRedirectionCapabilities
