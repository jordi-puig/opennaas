/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class CollectionConfiguration as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the
 * CollectionConfigurationBean Interface. The CIM class
 * CollectionConfiguration is described as follows:
 *
 * Note: The Configuration class is being deprecated in lieu of using a
 * ConcreteComponent relationship to indicate a hierarchy of instances of
 * Setting or SettingData. This relationship allows the reuse of the
 * collection-to-Setting and element-to-SettingData associations instead of
 * defining peer associations specifically for Configurations. Deprecated
 * description: This association relates a Configuration object to one or
 * more CollectionOfMSEs objects. The Configuration object represents a
 * certain behavior or a desired functional state for the associated
 * Collection.
 */
    @Deprecated
public class CollectionConfiguration extends Association implements
    Serializable {

    /**
     * This constructor creates a CollectionConfigurationBeanImpl Class which
     * implements the CollectionConfigurationBean Interface, and encapsulates
     * the CIM class CollectionConfiguration in a Java Bean. The CIM class
     * CollectionConfiguration is described as follows:
     *
     * Note: The Configuration class is being deprecated in lieu of using a
     * ConcreteComponent relationship to indicate a hierarchy of instances of
     * Setting or SettingData. This relationship allows the reuse of the
     * collection-to-Setting and element-to-SettingData associations instead
     * of defining peer associations specifically for Configurations.
     * Deprecated description: This association relates a Configuration
     * object to one or more CollectionOfMSEs objects. The Configuration
     * object represents a certain behavior or a desired functional state for
     * the associated Collection.
     */
    public CollectionConfiguration(){};
    /**
     * This method create an Association of the type CollectionConfiguration
     * between one CollectionOfMSEs object and Configuration object
     */
    @Deprecated
    public static CollectionConfiguration link(CollectionOfMSEs
	collection,Configuration configuration){

    return (CollectionConfiguration)
	Association.link(CollectionConfiguration.class,collection,configuration);
    }//link

} // Class CollectionConfiguration
