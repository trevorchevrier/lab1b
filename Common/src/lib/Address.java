/**
 *  Defines an Address type.
 */

package lib;

/**
 * @author Trevor Cole Chevrier
 */

public class Address {
    private String civicNumber;
    private String streetName;
    	
    public Address() { }

    public Address (String civicNumber, String streetName)    {
    	this.civicNumber = civicNumber;
    	this.streetName = streetName;
    }
    
    public String getAddress()  {
    	return civicNumber + " " + streetName;
    }

    public String getCivicNumber()  {
    	return civicNumber;
    }
    
    public String getStreetName()    {
    	return streetName;
    }
}
