package ie.setu;

public class Employee {
//  A list of variables is defined
    static int employeeNum = 1000;
    private int myNum;
    private Address myAddress;
    private String carModel;
    private String type;
    private String fname;
    private String lname;

//  A constructor is defined setting the arguments to the object
    public Employee(String carModel, Address address, String fname, String lname, String type) {
        myNum = employeeNum++;
        setMyAddress(address);
        setCarModel(carModel);
        setFname(fname);
        setLname(lname);
        setType(type);
    }

//  This method gets the employee number
    public int getMyNum() {
        return myNum;
    }

//  This method sets the car model to an object
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

//  This method gets the car model instance variable from the object
    public String getCarModel() {
        return carModel;
    }

//  This method sets the address to an object
    public void setMyAddress(Address address) {
        this.myAddress = address;
    }

//  This method gets the address instance variable from the object
    public Address getMyAddress() {
        return myAddress;
    }

//  This method returns the list of all employees created
    public static int listEmployees() {
        return employeeNum - 1000;
    }

//  This method sets the type to an object
    public void setType(String type) {
        this.type = type;
    }

//  This method gets the type instance variable from the object
    public String getType() {
        return type;
    }

//  This method sets the first name to an object
    public void setFname(String fname) {
        this.fname = fname;
    }

//  This method gets the first name instance variable from an object
    public String getFname() {
        return fname;
    }

//  This method sets the last name to an Object
    public void setLname(String lname) {
        this.lname = lname;
    }

//  This method gets the Last name instance variable from an object
    public String getLname() {
        return lname;
    }

//  This overrides the default toString method
    @Override
    public String toString() {
        if (type.equalsIgnoreCase("Manager")) {
            return "Employee ID: " + getMyNum() + "\nFirst Name: " + getFname() + "\nLast Name: " + getLname() + "\nType: " + getType() + "\nCar Model: " + getCarModel() + "\nMy Address: " + getMyAddress();
        } else {
            return "Employee ID: " + getMyNum() + "\nFirst Name: " + getFname() + "\nLast Name " + getLname() + "\nType: " + getType() + "\nMy Address: " + getMyAddress();
        }
    }
}
