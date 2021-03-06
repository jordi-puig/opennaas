/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class NextScheduler as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the
 * NextSchedulerBean Interface. The CIM class NextScheduler is described as
 * follows:
 *
 * This association is a subclass of NextService, and defines a
 * predecessor-successor relationship between Packet SchedulingServices. In a
 * hierarchical queuing configuration (where a second scheduler treats the
 * output of a first scheduler as a single, aggregated input), the two
 * schedulers are related via the NextScheduler association.
 */
public class NextScheduler extends NextService implements Serializable {

    /**
     * This constructor creates a NextSchedulerBeanImpl Class which implements
     * the NextSchedulerBean Interface, and encapsulates the CIM class
     * NextScheduler in a Java Bean. The CIM class NextScheduler is described
     * as follows:
     *
     * This association is a subclass of NextService, and defines a
     * predecessor-successor relationship between Packet SchedulingServices.
     * In a hierarchical queuing configuration (where a second scheduler
     * treats the output of a first scheduler as a single, aggregated input),
     * the two schedulers are related via the NextScheduler association.
     */
    public NextScheduler(){};
    /**
     * This method create an Association of the type NextScheduler between one
     * PacketSchedulingService object and PacketSchedulingService object
     */
    public static NextScheduler link(PacketSchedulingService
	precedingService,PacketSchedulingService followingService){

    return (NextScheduler)
	Association.link(NextScheduler.class,precedingService,followingService);
    }//link

} // Class NextScheduler
