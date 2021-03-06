/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class HostedRoutingPolicy as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the
 * HostedRoutingPolicyBean Interface. The CIM class HostedRoutingPolicy is
 * described as follows:
 *
 * A RoutingPolicy is weak to the network device (i.e., the ComputerSystem)
 * that contains it. This association formalizes that relationship.
 */
public class HostedRoutingPolicy extends HostedDependency implements
    Serializable {

    /**
     * This constructor creates a HostedRoutingPolicyBeanImpl Class which
     * implements the HostedRoutingPolicyBean Interface, and encapsulates the
     * CIM class HostedRoutingPolicy in a Java Bean. The CIM class
     * HostedRoutingPolicy is described as follows:
     *
     * A RoutingPolicy is weak to the network device (i.e., the
     * ComputerSystem) that contains it. This association formalizes that
     * relationship.
     */
    public HostedRoutingPolicy(){};
    /**
     * This method create an Association of the type HostedRoutingPolicy
     * between one ComputerSystem object and RoutingPolicy object
     */
    public static HostedRoutingPolicy link(ComputerSystem
	antecedent,RoutingPolicy dependent){

    return (HostedRoutingPolicy)
	Association.link(HostedRoutingPolicy.class,antecedent,dependent);
    }//link

} // Class HostedRoutingPolicy
