/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class WiFiEndpointCapabilities as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the
 * WiFiEndpointCapabilitiesBean Interface. The CIM class
 * WiFiEndpointCapabilities is described as follows:
 *
 * Describes the capabilities of a WiFiEndpoint.
 */
public class WiFiEndpointCapabilities extends
    EnabledLogicalElementCapabilities implements Serializable {

    /**
     * This constructor creates a WiFiEndpointCapabilitiesBeanImpl Class which
     * implements the WiFiEndpointCapabilitiesBean Interface, and
     * encapsulates the CIM class WiFiEndpointCapabilities in a Java Bean.
     * The CIM class WiFiEndpointCapabilities is described as follows:
     *
     * Describes the capabilities of a WiFiEndpoint.
     */
    public WiFiEndpointCapabilities(){};
    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property SupportedEncryptionMethods.
     */

    public enum SupportedEncryptionMethods{
    OTHER,
    WEP,
    TKIP,
    CCMP,
    NONE,
    DMTF_RESERVED
    }
    private SupportedEncryptionMethods supportedEncryptionMethods;
    /**
     * This method returns the
     * WiFiEndpointCapabilities.supportedEncryptionMethods property value.
     * This property is described as follows:
     *
     * The set of IEEE 802.11 encryption methods supported by the associated
     * WifiEndpoint. Shall contain one or more of the values below. 	*
     * Other (1): shall indicate that at least one encryption method not
     * specified in the list below is supported. If
     * SupportedEncryptionMethods contains 1, OtherSupportedEncryptionMethods
     * shall not be NULL and shall not be empty. 	* WEP (2): shall
     * indicate that Wired Equivalency Privacy (WEP) is supported.
     * SupportedEncryptionMethods shall contain 2 only if
     * SupportedAuthenticationMethods contains 2 ("Open System") or 3
     * ("Shared Key"). 	* TKIP (3): shall indicate that the Temporal
     * Key Integrity Protocol (TKIP) is supported. SupportedEncryptionMethods
     * shall contain 3 only if SupportedAuthenticationMethods contains 4
     * ("WPA PSK"), 5 ("WPA IEEE 802.1x"), 6 ("WPA2 PSK"), or 7
     * ("WPA2 IEEE 802.1x"). 	* CCMP (4): shall indicate that the
     * Counter Mode with Cipher Block Chaining Message Authentication Code
     * Protocol (CCMP) is supported. SupportedEncryptionMethods shall contain
     * 4 only if SupportedAuthenticationMethods contains 4 ("WPA PSK"), 5
     * ("WPA IEEE 802.1x"), 6 ("WPA2 PSK"), or 7 ("WPA2 IEEE 802.1x").
     * 	* None (5): shall indicate that the associated WiFiEndpoint
     * supports connecting to a network without encryption.
     * SupportedEncryptionMethods shall contain 5 only if
     * SupportedAuthenticationMethods contains 2 ("Open System") or 3
     * ("Shared Key").
     *
     * @return	int	current supportedEncryptionMethods property
     * value
     * @exception	Exception
     */
    public SupportedEncryptionMethods getSupportedEncryptionMethods(){

    return this.supportedEncryptionMethods;
    } // getSupportedEncryptionMethods

    /**
     * This method sets the
     * WiFiEndpointCapabilities.supportedEncryptionMethods property value.
     * This property is described as follows:
     *
     * The set of IEEE 802.11 encryption methods supported by the associated
     * WifiEndpoint. Shall contain one or more of the values below. 	*
     * Other (1): shall indicate that at least one encryption method not
     * specified in the list below is supported. If
     * SupportedEncryptionMethods contains 1, OtherSupportedEncryptionMethods
     * shall not be NULL and shall not be empty. 	* WEP (2): shall
     * indicate that Wired Equivalency Privacy (WEP) is supported.
     * SupportedEncryptionMethods shall contain 2 only if
     * SupportedAuthenticationMethods contains 2 ("Open System") or 3
     * ("Shared Key"). 	* TKIP (3): shall indicate that the Temporal
     * Key Integrity Protocol (TKIP) is supported. SupportedEncryptionMethods
     * shall contain 3 only if SupportedAuthenticationMethods contains 4
     * ("WPA PSK"), 5 ("WPA IEEE 802.1x"), 6 ("WPA2 PSK"), or 7
     * ("WPA2 IEEE 802.1x"). 	* CCMP (4): shall indicate that the
     * Counter Mode with Cipher Block Chaining Message Authentication Code
     * Protocol (CCMP) is supported. SupportedEncryptionMethods shall contain
     * 4 only if SupportedAuthenticationMethods contains 4 ("WPA PSK"), 5
     * ("WPA IEEE 802.1x"), 6 ("WPA2 PSK"), or 7 ("WPA2 IEEE 802.1x").
     * 	* None (5): shall indicate that the associated WiFiEndpoint
     * supports connecting to a network without encryption.
     * SupportedEncryptionMethods shall contain 5 only if
     * SupportedAuthenticationMethods contains 2 ("Open System") or 3
     * ("Shared Key").
     *
     * @param	int	new supportedEncryptionMethods property value
     * @exception	Exception
     */
    public void setSupportedEncryptionMethods(SupportedEncryptionMethods
	supportedEncryptionMethods){

    this.supportedEncryptionMethods = supportedEncryptionMethods;
    } // setSupportedEncryptionMethods


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property otherSupportedEncryptionMethods.
     */
    private String[] otherSupportedEncryptionMethods;
    /**
     * This method returns the
     * WiFiEndpointCapabilities.otherSupportedEncryptionMethods property
     * value. This property is described as follows:
     *
     * Shall contain additional encryption methods supported by the associated
     * WifiEndpoint, but not listed in the valuemap for
     * SupportedEncryptionMethods. The positions of these strings are the
     * lowest indices of the array, and do not correspond to the positions of
     * the values in SupportedEncryptionMethods.
     *
     * @return	String[]	current otherSupportedEncryptionMethods
     * property value
     * @exception	Exception
     */
    public String[] getOtherSupportedEncryptionMethods(){

    return this.otherSupportedEncryptionMethods;
    } // getOtherSupportedEncryptionMethods

    /**
     * This method sets the
     * WiFiEndpointCapabilities.otherSupportedEncryptionMethods property
     * value. This property is described as follows:
     *
     * Shall contain additional encryption methods supported by the associated
     * WifiEndpoint, but not listed in the valuemap for
     * SupportedEncryptionMethods. The positions of these strings are the
     * lowest indices of the array, and do not correspond to the positions of
     * the values in SupportedEncryptionMethods.
     *
     * @param	String[]	new otherSupportedEncryptionMethods
     * property value
     * @exception	Exception
     */
    public void setOtherSupportedEncryptionMethods(String[]
	otherSupportedEncryptionMethods) {

    this.otherSupportedEncryptionMethods = otherSupportedEncryptionMethods;
    } // setOtherSupportedEncryptionMethods


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property SupportedAuthenticationMethods.
     */

    public enum SupportedAuthenticationMethods{
    OTHER,
    OPEN_SYSTEM,
    SHARED_KEY,
    WPA_PSK,
    WPA_IEEE_802_1X,
    WPA2_PSK,
    WPA2_IEEE_802_1X,
    DMTF_RESERVED
    }
    private SupportedAuthenticationMethods supportedAuthenticationMethods;
    /**
     * This method returns the
     * WiFiEndpointCapabilities.supportedAuthenticationMethods property
     * value. This property is described as follows:
     *
     * The set of IEEE 802.11 authentication methods supported by the
     * associated WifiEndpoint.	* Other (1): shall indicate that at
     * least one authentication method not specified in the list below is
     * supported. If SupportedAuthenticationMethods contains 1,
     * OtherSupportedAuthenticationMethods shall not be NULL and shall not be
     * empty. 	* Open System (2): shall indicate that Open System
     * authentication is supported. SupportedAuthenticationMethods shall
     * contain 2 only if SupportedEncryptionMethods contains 2 ("WEP") or 5
     * ("None"). 	* Shared Key (3): shall indicate Shared Key
     * authentication is supported. SupportedAuthenticationMethods shall
     * contain 3 only if SupportedEncryptionMethods contains 2 ("WEP") or 5
     * ("None"). 	* WPA PSK (4): shall indicate that WPA (Wi-Fi
     * Protected Access) PSK (Pre-Shared Key) authentication is supported.
     * SupportedAuthenticationMethods shall contain 4 only if
     * SupportedEncryptionMethods contains 3 ("TKIP") or 4 ("CCMP").
     * 	* WPA IEEE 802.1x (5): shall indicate that WPA (Wi-Fi
     * Protected Access) IEEE 802.1x authentication is supported.
     * SupportedAuthenticationMethods shall contain 5 only if
     * SupportedEncryptionMethods contains 3 ("TKIP") or 4 ("CCMP").
     * 	* WPA2 PSK (6): shall indicate that WPA2 (Wi-Fi Protected
     * Access Version 2) PSK (Pre-Shared Key) authentication is supported.
     * SupportedAuthenticationMethods shall contain 6 only if
     * SupportedEncryptionMethods contains 3 ("TKIP") or 4 ("CCMP").
     * 	* WPA2 IEEE 802.1x (7): shall indicate that WPA2 (Wi-Fi
     * Protected Access Version 2) IEEE 802.1x authentication is supported.
     * SupportedAuthenticationMethods shall contain 7 only if
     * SupportedEncryptionMethods contains 3 ("TKIP") or 4 ("CCMP").
     *
     * @return	int	current supportedAuthenticationMethods
     * property value
     * @exception	Exception
     */
    public SupportedAuthenticationMethods
	getSupportedAuthenticationMethods(){

    return this.supportedAuthenticationMethods;
    } // getSupportedAuthenticationMethods

    /**
     * This method sets the
     * WiFiEndpointCapabilities.supportedAuthenticationMethods property
     * value. This property is described as follows:
     *
     * The set of IEEE 802.11 authentication methods supported by the
     * associated WifiEndpoint.	* Other (1): shall indicate that at
     * least one authentication method not specified in the list below is
     * supported. If SupportedAuthenticationMethods contains 1,
     * OtherSupportedAuthenticationMethods shall not be NULL and shall not be
     * empty. 	* Open System (2): shall indicate that Open System
     * authentication is supported. SupportedAuthenticationMethods shall
     * contain 2 only if SupportedEncryptionMethods contains 2 ("WEP") or 5
     * ("None"). 	* Shared Key (3): shall indicate Shared Key
     * authentication is supported. SupportedAuthenticationMethods shall
     * contain 3 only if SupportedEncryptionMethods contains 2 ("WEP") or 5
     * ("None"). 	* WPA PSK (4): shall indicate that WPA (Wi-Fi
     * Protected Access) PSK (Pre-Shared Key) authentication is supported.
     * SupportedAuthenticationMethods shall contain 4 only if
     * SupportedEncryptionMethods contains 3 ("TKIP") or 4 ("CCMP").
     * 	* WPA IEEE 802.1x (5): shall indicate that WPA (Wi-Fi
     * Protected Access) IEEE 802.1x authentication is supported.
     * SupportedAuthenticationMethods shall contain 5 only if
     * SupportedEncryptionMethods contains 3 ("TKIP") or 4 ("CCMP").
     * 	* WPA2 PSK (6): shall indicate that WPA2 (Wi-Fi Protected
     * Access Version 2) PSK (Pre-Shared Key) authentication is supported.
     * SupportedAuthenticationMethods shall contain 6 only if
     * SupportedEncryptionMethods contains 3 ("TKIP") or 4 ("CCMP").
     * 	* WPA2 IEEE 802.1x (7): shall indicate that WPA2 (Wi-Fi
     * Protected Access Version 2) IEEE 802.1x authentication is supported.
     * SupportedAuthenticationMethods shall contain 7 only if
     * SupportedEncryptionMethods contains 3 ("TKIP") or 4 ("CCMP").
     *
     * @param	int	new supportedAuthenticationMethods property
     * value
     * @exception	Exception
     */
    public void
	setSupportedAuthenticationMethods(SupportedAuthenticationMethods
	supportedAuthenticationMethods){

    this.supportedAuthenticationMethods = supportedAuthenticationMethods;
    } // setSupportedAuthenticationMethods


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property otherSupportedAuthenticationMethods.
     */
    private String[] otherSupportedAuthenticationMethods;
    /**
     * This method returns the
     * WiFiEndpointCapabilities.otherSupportedAuthenticationMethods property
     * value. This property is described as follows:
     *
     * Shall contain additional authentication methods supported by the
     * associated WifiEndpoint, but not listed in the valuemap for
     * SupportedAuthenticationMethods. The positions of these strings are the
     * lowest indices of the array, and do not correspond to the positions of
     * the values in SupportedAuthenticationMethods.
     *
     * @return	String[]	current
     * otherSupportedAuthenticationMethods property value
     * @exception	Exception
     */
    public String[] getOtherSupportedAuthenticationMethods(){

    return this.otherSupportedAuthenticationMethods;
    } // getOtherSupportedAuthenticationMethods

    /**
     * This method sets the
     * WiFiEndpointCapabilities.otherSupportedAuthenticationMethods property
     * value. This property is described as follows:
     *
     * Shall contain additional authentication methods supported by the
     * associated WifiEndpoint, but not listed in the valuemap for
     * SupportedAuthenticationMethods. The positions of these strings are the
     * lowest indices of the array, and do not correspond to the positions of
     * the values in SupportedAuthenticationMethods.
     *
     * @param	String[]	new otherSupportedAuthenticationMethods
     * property value
     * @exception	Exception
     */
    public void setOtherSupportedAuthenticationMethods(String[]
	otherSupportedAuthenticationMethods) {

    this.otherSupportedAuthenticationMethods =
	otherSupportedAuthenticationMethods;
    } // setOtherSupportedAuthenticationMethods



} // Class WiFiEndpointCapabilities
