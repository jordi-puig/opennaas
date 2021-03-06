/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class Confederation as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the
 * ConfederationBean Interface. The CIM class Confederation is described as
 * follows:
 *
 * The BGP speakers in an AS are required to be fully meshed. This can lead to
 * a huge number of TCP connections per router. One way to reduce the peering
 * requirements is to use a confederation. A confederation effectively
 * partitions one AS into a group of 'sub-ASs'. This enables all of the
 * benefits of IBGP to be applied inside the confederation, while enabling
 * EBGP to be run between each confederation. It also enables certain BGP
 * attribute values to be preserved between confederations. However, to the
 * outside world, the AS with its confederations appear to be a single AS.
 */
public class Confederation extends SystemComponent implements Serializable {

    /**
     * This constructor creates a ConfederationBeanImpl Class which implements
     * the ConfederationBean Interface, and encapsulates the CIM class
     * Confederation in a Java Bean. The CIM class Confederation is described
     * as follows:
     *
     * The BGP speakers in an AS are required to be fully meshed. This can
     * lead to a huge number of TCP connections per router. One way to reduce
     * the peering requirements is to use a confederation. A confederation
     * effectively partitions one AS into a group of 'sub-ASs'. This enables
     * all of the benefits of IBGP to be applied inside the confederation,
     * while enabling EBGP to be run between each confederation. It also
     * enables certain BGP attribute values to be preserved between
     * confederations. However, to the outside world, the AS with its
     * confederations appear to be a single AS.
     */
    public Confederation(){};
    /**
     * This method create an Association of the type Confederation between one
     * AutonomousSystem object and AutonomousSystem object
     */
    public static Confederation link(AutonomousSystem
	groupComponent,AutonomousSystem partComponent){

    return (Confederation)
	Association.link(Confederation.class,groupComponent,partComponent);
    }//link
    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property parentASNumber.
     */
    private long parentASNumber;
    /**
     * This method returns the Confederation.parentASNumber property value.
     * This property is described as follows:
     *
     * A unique identifier of the AutonomousSystem that contains the
     * confederations.
     *
     * @return	long	current parentASNumber property value
     * @exception	Exception
     */
    public long getParentASNumber(){

    return this.parentASNumber;
    } // getParentASNumber

    /**
     * This method sets the Confederation.parentASNumber property value. This
     * property is described as follows:
     *
     * A unique identifier of the AutonomousSystem that contains the
     * confederations.
     *
     * @param	long	new parentASNumber property value
     * @exception	Exception
     */
    public void setParentASNumber(long parentASNumber) {

    this.parentASNumber = parentASNumber;
    } // setParentASNumber


    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property childASNumber.
     */
    private long childASNumber;
    /**
     * This method returns the Confederation.childASNumber property value.
     * This property is described as follows:
     *
     * A unique identifier of the Confederation within the AutonomousSystem.
     *
     * @return	long	current childASNumber property value
     * @exception	Exception
     */
    public long getChildASNumber(){

    return this.childASNumber;
    } // getChildASNumber

    /**
     * This method sets the Confederation.childASNumber property value. This
     * property is described as follows:
     *
     * A unique identifier of the Confederation within the AutonomousSystem.
     *
     * @param	long	new childASNumber property value
     * @exception	Exception
     */
    public void setChildASNumber(long childASNumber) {

    this.childASNumber = childASNumber;
    } // setChildASNumber



} // Class Confederation
