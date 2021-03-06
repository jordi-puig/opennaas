/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class SwitchServiceTransparentBridging as well as methods
 * comparable to the invokeMethods defined for this class. This Class
 * implements the SwitchServiceTransparentBridgingBean Interface. The CIM
 * class SwitchServiceTransparentBridging is described as follows:
 *
 * An association linking a SwitchService to a component
 * TransparentBridgingService. The cardinality of the
 * TransparentBridgingService is 0..1 for a VLAN-unaware switch.
 */
public class SwitchServiceTransparentBridging extends ServiceComponent
    implements Serializable {

    /**
     * This constructor creates a SwitchServiceTransparentBridgingBeanImpl
     * Class which implements the SwitchServiceTransparentBridgingBean
     * Interface, and encapsulates the CIM class
     * SwitchServiceTransparentBridging in a Java Bean. The CIM class
     * SwitchServiceTransparentBridging is described as follows:
     *
     * An association linking a SwitchService to a component
     * TransparentBridgingService. The cardinality of the
     * TransparentBridgingService is 0..1 for a VLAN-unaware switch.
     */
    public SwitchServiceTransparentBridging(){};
    /**
     * This method create an Association of the type
     * SwitchServiceTransparentBridging between one SwitchService object and
     * TransparentBridgingService object
     */
    public static SwitchServiceTransparentBridging link(SwitchService
	groupComponent,TransparentBridgingService partComponent){

    return (SwitchServiceTransparentBridging) Association.link(SwitchServiceTransparentBridging.class,groupComponent,partComponent);
    }//link

} // Class SwitchServiceTransparentBridging
