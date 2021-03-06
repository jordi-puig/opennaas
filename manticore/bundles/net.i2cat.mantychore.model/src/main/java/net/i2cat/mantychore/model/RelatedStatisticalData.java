/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;
import java.lang.Exception;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class RelatedStatisticalData as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the
 * RelatedStatisticalDataBean Interface. The CIM class RelatedStatisticalData
 * is described as follows:
 *
 * CIM_RelatedStatisticalData is an association that defines hierarchies
 * and/or dependencies of related CIM_Statistical Data classes.
 */
public class RelatedStatisticalData extends Association implements
    Serializable {

    /**
     * This constructor creates a RelatedStatisticalDataBeanImpl Class which
     * implements the RelatedStatisticalDataBean Interface, and encapsulates
     * the CIM class RelatedStatisticalData in a Java Bean. The CIM class
     * RelatedStatisticalData is described as follows:
     *
     * CIM_RelatedStatisticalData is an association that defines hierarchies
     * and/or dependencies of related CIM_Statistical Data classes.
     */
    public RelatedStatisticalData(){};
    /**
     * This method create an Association of the type RelatedStatisticalData
     * between one StatisticalData object and StatisticalData object
     */
    public static RelatedStatisticalData link(StatisticalData
	stats,StatisticalData relatedStats){

    return (RelatedStatisticalData)
	Association.link(RelatedStatisticalData.class,stats,relatedStats);
    }//link
    /**
     * The following constants are defined for use with the ValueMap/Values
     * qualified property description.
     */
    private String description;
    /**
     * This method returns the RelatedStatisticalData.description property
     * value. This property is described as follows:
     *
     * A free-form string describing how the statistics are related.
     *
     * @return	String	current description property value
     * @exception	Exception
     */
    public String getDescription(){

    return this.description;
    } // getDescription

    /**
     * This method sets the RelatedStatisticalData.description property value.
     * This property is described as follows:
     *
     * A free-form string describing how the statistics are related.
     *
     * @param	String	new description property value
     * @exception	Exception
     */
    public void setDescription(String description) {

    this.description = description;
    } // setDescription



} // Class RelatedStatisticalData
