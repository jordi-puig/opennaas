/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class HostedAdminDistance as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the
 * HostedAdminDistanceBean Interface. The CIM class HostedAdminDistance is
 * described as follows:
 *
 * AdministrativeDistance, being a global object, is weak to the AdminDomain
 * that contains it. This association formalizes that relationship.
 */
public class HostedAdminDistance extends HostedDependency implements
    Serializable {

    /**
     * This constructor creates a HostedAdminDistanceBeanImpl Class which
     * implements the HostedAdminDistanceBean Interface, and encapsulates the
     * CIM class HostedAdminDistance in a Java Bean. The CIM class
     * HostedAdminDistance is described as follows:
     *
     * AdministrativeDistance, being a global object, is weak to the
     * AdminDomain that contains it. This association formalizes that
     * relationship.
     */
    public HostedAdminDistance(){};
    /**
     * This method create an Association of the type HostedAdminDistance
     * between one AdminDomain object and AdministrativeDistance object
     */
    public static HostedAdminDistance link(AdminDomain
	antecedent,AdministrativeDistance dependent){

    return (HostedAdminDistance)
	Association.link(HostedAdminDistance.class,antecedent,dependent);
    }//link

} // Class HostedAdminDistance
