/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class AFRelatedServices as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the
 * AFRelatedServicesBean Interface. The CIM class AFRelatedServices is
 * described as follows:
 *
 * The IETF's RFC2597 describes a Differentiated Services Per-Hop-Behavior
 * (PHB) Group called Assured Forwarding (AF). Quoting from the RFC, 'The AF
 * PHB group provides delivery of IP packets in four independently forwarded
 * AF classes. Within each AF class, an IP packet can be assigned one of
 * three different levels of drop precedence.' The AFRelatedServices
 * association describes the precedence of the individual AF drop-related
 * Services within an AF IP packet-forwarding class.
 */
public class AFRelatedServices extends Association implements Serializable {

    /**
     * This constructor creates a AFRelatedServicesBeanImpl Class which
     * implements the AFRelatedServicesBean Interface, and encapsulates the
     * CIM class AFRelatedServices in a Java Bean. The CIM class
     * AFRelatedServices is described as follows:
     *
     * The IETF's RFC2597 describes a Differentiated Services Per-Hop-Behavior
     * (PHB) Group called Assured Forwarding (AF). Quoting from the RFC, 'The
     * AF PHB group provides delivery of IP packets in four independently
     * forwarded AF classes. Within each AF class, an IP packet can be
     * assigned one of three different levels of drop precedence.' The
     * AFRelatedServices association describes the precedence of the
     * individual AF drop-related Services within an AF IP packet-forwarding
     * class.
     */
    public AFRelatedServices(){};
    /**
     * This method create an Association of the type AFRelatedServices between
     * one AFService object and AFService object
     */
    public static AFRelatedServices link(AFService
	aFLowerDropPrecedence,AFService aFHigherDropPrecedence){

    return (AFRelatedServices) Association.link(AFRelatedServices.class,aFLowerDropPrecedence,aFHigherDropPrecedence);
    }//link

} // Class AFRelatedServices
