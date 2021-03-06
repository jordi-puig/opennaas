/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class CollectionSetting as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the
 * CollectionSettingBean Interface. The CIM class CollectionSetting is
 * described as follows:
 *
 * CollectionSetting represents the association between a CollectionOfMSEs
 * class and the Setting classes that are defined for it.
 */
public class CollectionSetting extends Association implements Serializable {

    /**
     * This constructor creates a CollectionSettingBeanImpl Class which
     * implements the CollectionSettingBean Interface, and encapsulates the
     * CIM class CollectionSetting in a Java Bean. The CIM class
     * CollectionSetting is described as follows:
     *
     * CollectionSetting represents the association between a CollectionOfMSEs
     * class and the Setting classes that are defined for it.
     */
    public CollectionSetting(){};
    /**
     * This method create an Association of the type CollectionSetting between
     * one CollectionOfMSEs object and Setting object
     */
    public static CollectionSetting link(CollectionOfMSEs collection,Setting
	setting){

    return (CollectionSetting)
	Association.link(CollectionSetting.class,collection,setting);
    }//link

} // Class CollectionSetting
