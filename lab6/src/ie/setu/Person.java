// Name: Tymofii Mazurenko
// StudentID: C00325393
// Date: 23/10/2025
// Purpose: Complete the lab 6 with ( Aggregation and Inheritance )

package ie.setu;

public class Person {
    // Variables
    private String name;
    private String address;

    // Constructors
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    //toString
    public String toString() {
        return name + "(" + address + ")";
    }
}
