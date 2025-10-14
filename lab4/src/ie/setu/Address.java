// Author: Tymofii Mazurenko
// Student ID: C00325393
// Date: 14/10/2025
// Purpose: To complete myHR system and to use aggregation.

package ie.setu;

public class Address {
//  The list of variables if defined for address object
    private String street;
    private String city;
    private String county;

//  Creating a constructor for the address object to set the arguments taken.
    public Address(String street, String city, String county) {
        setStreet(street);
        setCity(city);
        setCounty(county);
    }

//    This method sets the street argument to it's object
    public void setStreet(String street) {
        this.street = street;
    }

//    This method gets the street instance variable from the object
    public String getStreet() {
        return street;
    }

//    This method sets the city argument to it's object
    public void setCity(String city) {
        this.city = city;
    }

//    This method gets the city instance variable from the object
    public String getCity() {
        return city;
    }

//    This method sets the county to it's object
    public void setCounty(String county) {
        this.county = county;
    }

//    This method gets the city instance variable from the object
    public String getCounty() {
        return county;
    }

//    This method overrides the default toString method
    @Override
    public String toString() {
        String result = String.format("""
            Street: %s,
            City: %s,
            County: %s
            """, street, city, county);

        return result;
    }
}
