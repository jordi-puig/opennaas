/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class BGPCluster as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the
 * BGPClusterBean Interface. The CIM class BGPCluster is described as
 * follows:
 *
 * The BGP speakers in an AS are required to be fully meshed. This can lead to
 * a huge number of TCP connections per router. One way to reduce the peering
 * requirements is to use a route reflector. This is based on specifying one
 * or more routers to act as focal points for IBGP sessions. The route
 * reflector as a whole is called a cluster. It is logically divided into
 * three types of routers: reflectors, clients of the route reflector(s), and
 * non-clients of the route reflector. There can be more than one route
 * reflector in a cluster, and there can be more than one cluster in an AS.
 */
public class BGPCluster extends CollectionOfMSEs implements Serializable {

    /**
     * This constructor creates a BGPClusterBeanImpl Class which implements
     * the BGPClusterBean Interface, and encapsulates the CIM class
     * BGPCluster in a Java Bean. The CIM class BGPCluster is described as
     * follows:
     *
     * The BGP speakers in an AS are required to be fully meshed. This can
     * lead to a huge number of TCP connections per router. One way to reduce
     * the peering requirements is to use a route reflector. This is based on
     * specifying one or more routers to act as focal points for IBGP
     * sessions. The route reflector as a whole is called a cluster. It is
     * logically divided into three types of routers: reflectors, clients of
     * the route reflector(s), and non-clients of the route reflector. There
     * can be more than one route reflector in a cluster, and there can be
     * more than one cluster in an AS.
     */
    public BGPCluster(){};
    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property clusterID.
     */
    private long clusterID;
    /**
     * This method returns the BGPCluster.clusterID property value. This
     * property is described as follows:
     *
     * If a cluster has more than one route reflector, all of the route
     * reflectors in the cluster need to be configured with a 4-byte cluster
     * ID. This allows route reflectors to recognize updates from other route
     * reflectors in the same cluster.
     *
     * @return	long	current clusterID property value
     * @exception	Exception
     */
    public long getClusterID(){

    return this.clusterID;
    } // getClusterID

    /**
     * This method sets the BGPCluster.clusterID property value. This property
     * is described as follows:
     *
     * If a cluster has more than one route reflector, all of the route
     * reflectors in the cluster need to be configured with a 4-byte cluster
     * ID. This allows route reflectors to recognize updates from other route
     * reflectors in the same cluster.
     *
     * @param	long	new clusterID property value
     * @exception	Exception
     */
    public void setClusterID(long clusterID) {

    this.clusterID = clusterID;
    } // setClusterID



} // Class BGPCluster
