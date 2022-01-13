package day33_Static;

import org.w3c.dom.ls.LSOutput;

public class Address {
    public String street;
    public String city;
    public String state;
    public int zipcode;
    public static String country = "USA";
    public static String planet = "Earth";

    public Address(String street, String city, String state, int zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String toString() {
        return street + " " + "\n"+city + " " + state + ", " + country+ ", "+ zipcode ;
    }
}
/*
5. Address Task:
		1. Create a class named Address:

		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet

	        Add a constructor that can set All the fields (instances)

		    Actions
		            setInfo: sets all the instances
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */

class AddressObjects{
    public static void main(String[] args) {
        Address address1 = new Address("7925 Jones Branch Dr","McLean","VA",22012);

        System.out.println(address1);
    }


}