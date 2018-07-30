
package com.capg.soapmain;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.capg.soapmain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.capg.soapmain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDetails }
     * 
     */
    public GetDetails createGetDetails() {
        return new GetDetails();
    }

    /**
     * Create an instance of {@link InputBody }
     * 
     */
    public InputBody createInputBody() {
        return new InputBody();
    }

    /**
     * Create an instance of {@link GetDetailsHeader }
     * 
     */
    public GetDetailsHeader createGetDetailsHeader() {
        return new GetDetailsHeader();
    }

    /**
     * Create an instance of {@link InputHeader }
     * 
     */
    public InputHeader createInputHeader() {
        return new InputHeader();
    }

    /**
     * Create an instance of {@link GetDetailsResponse }
     * 
     */
    public GetDetailsResponse createGetDetailsResponse() {
        return new GetDetailsResponse();
    }

    /**
     * Create an instance of {@link ResponseClass }
     * 
     */
    public ResponseClass createResponseClass() {
        return new ResponseClass();
    }

}
