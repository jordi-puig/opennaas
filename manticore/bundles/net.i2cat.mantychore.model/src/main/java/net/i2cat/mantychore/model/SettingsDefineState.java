/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class SettingsDefineState as well as methods comparable to the
 * invokeMethods defined for this class. This Class implements the
 * SettingsDefineStateBean Interface. The CIM class SettingsDefineState is
 * described as follows:
 *
 * SettingsDefineState is used to associate an instance of SettingData with an
 * instance of ManagedElement. This association indicates that the
 * SettingData instance provides additional information about the Current
 * State of the associated ManagedElement. State is broadly defined to
 * include the configuration, status, capabilities, and other information of
 * an instance. Use of the same instance of SettingData to represent more
 * than one of Current State (SettingsDefineState) and Desired State
 * (ElementSettingData) and Possible State (SettingsDefineCapabilities) for a
 * ManagedElement is not recommended.
 */
public class SettingsDefineState extends Association implements Serializable
    {

    /**
     * This constructor creates a SettingsDefineStateBeanImpl Class which
     * implements the SettingsDefineStateBean Interface, and encapsulates the
     * CIM class SettingsDefineState in a Java Bean. The CIM class
     * SettingsDefineState is described as follows:
     *
     * SettingsDefineState is used to associate an instance of SettingData
     * with an instance of ManagedElement. This association indicates that
     * the SettingData instance provides additional information about the
     * Current State of the associated ManagedElement. State is broadly
     * defined to include the configuration, status, capabilities, and other
     * information of an instance. Use of the same instance of SettingData to
     * represent more than one of Current State (SettingsDefineState) and
     * Desired State (ElementSettingData) and Possible State
     * (SettingsDefineCapabilities) for a ManagedElement is not recommended.
     */
    public SettingsDefineState(){};
    /**
     * This method create an Association of the type SettingsDefineState
     * between one ManagedElement object and SettingData object
     */
    public static SettingsDefineState link(ManagedElement
	managedElement,SettingData settingData){

    return (SettingsDefineState)
	Association.link(SettingsDefineState.class,managedElement,settingData);
    }//link

} // Class SettingsDefineState
