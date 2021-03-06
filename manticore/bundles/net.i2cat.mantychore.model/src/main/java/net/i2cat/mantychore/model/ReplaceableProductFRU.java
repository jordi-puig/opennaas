/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package net.i2cat.mantychore.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined
 * in the CIM class ReplaceableProductFRU as well as methods comparable to
 * the invokeMethods defined for this class. This Class implements the
 * ReplaceableProductFRUBean Interface. The CIM class ReplaceableProductFRU
 * is described as follows:
 *
 * ReplaceableProductFRU is an association between Product and FRU that shows
 * what Product components may be replaced. The association is one to many,
 * conveying that a Product can have many FRUs, and that a particular
 * instance of a FRU is only applied to one (instance of a) Product.
 */
public class ReplaceableProductFRU extends Association implements Serializable
    {

    /**
     * This constructor creates a ReplaceableProductFRUBeanImpl Class which
     * implements the ReplaceableProductFRUBean Interface, and encapsulates
     * the CIM class ReplaceableProductFRU in a Java Bean. The CIM class
     * ReplaceableProductFRU is described as follows:
     *
     * ReplaceableProductFRU is an association between Product and FRU that
     * shows what Product components may be replaced. The association is one
     * to many, conveying that a Product can have many FRUs, and that a
     * particular instance of a FRU is only applied to one (instance of a)
     * Product.
     */
    public ReplaceableProductFRU(){};
    /**
     * This method create an Association of the type ReplaceableProductFRU
     * between one Product object and FRU object
     */
    public static ReplaceableProductFRU link(Product product,FRU fRU){

    return (ReplaceableProductFRU)
	Association.link(ReplaceableProductFRU.class,product,fRU);
    }//link

} // Class ReplaceableProductFRU
