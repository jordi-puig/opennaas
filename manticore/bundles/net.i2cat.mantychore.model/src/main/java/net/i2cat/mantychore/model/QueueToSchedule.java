/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class QueueToSchedule as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the
 * QueueToScheduleBean Interface. The CIM class QueueToSchedule is described
 * as follows:
 *
 * This is a top-level association, representing the relationship between a
 * queue (QueuingService) and a SchedulingElement. The SchedulingElement, in
 * turn, represents the information in a packet scheduling service that is
 * specific to this queue, such as relative priority or allocated bandwidth.
 * Although it cannot be expressed formally with the association
 * cardinalities, there is an additional constraint on participation in this
 * association. A particular instance of (a subclass of) SchedulingElement
 * always participates either in exactly one instance of this association, or
 * in exactly one instance of the association SchedulingServiceToSchedule.
 */
public class QueueToSchedule extends Association implements Serializable {

    /**
     * This constructor creates a QueueToScheduleBeanImpl Class which
     * implements the QueueToScheduleBean Interface, and encapsulates the CIM
     * class QueueToSchedule in a Java Bean. The CIM class QueueToSchedule is
     * described as follows:
     *
     * This is a top-level association, representing the relationship between
     * a queue (QueuingService) and a SchedulingElement. The
     * SchedulingElement, in turn, represents the information in a packet
     * scheduling service that is specific to this queue, such as relative
     * priority or allocated bandwidth. Although it cannot be expressed
     * formally with the association cardinalities, there is an additional
     * constraint on participation in this association. A particular instance
     * of (a subclass of) SchedulingElement always participates either in
     * exactly one instance of this association, or in exactly one instance
     * of the association SchedulingServiceToSchedule.
     */
    public QueueToSchedule(){};
    /**
     * This method create an Association of the type QueueToSchedule between
     * one QueuingService object and SchedulingElement object
     */
    public static QueueToSchedule link(QueuingService queue,SchedulingElement
	schedElement){

    return (QueueToSchedule)
	Association.link(QueueToSchedule.class,queue,schedElement);
    }//link

} // Class QueueToSchedule
