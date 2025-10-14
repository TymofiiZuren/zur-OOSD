package ie.setu;
// Author: Tymofii Mazurenko
// Student ID: C00325393
// Date: 14/10/2025
// Purpose: To complete myHR system and to use aggregation.

public class Office {
//  variables of an object are defined
    static int officesNum = 100;
    private int myNum;
    private Employee[] employees = new Employee[2];
    private int employeeCount = 0;

    public Office() {
        myNum = officesNum++;
    }

    public int getMyNum() {
        return myNum;
    }

//    The employee count method gives the total of employees created
    public int getEmployeeCount() {
        return employeeCount;
    }

//    This method adds to the employees list and the employee count is incremented
    public void addNewEmployee(Employee employee) {
        if (employeeCount < 2) {
            employees[employeeCount] = employee;
            employeeCount++;
        }
    }

//    This method outputs the employee records, using available properties
    public String employeeRecords() {
        String result = "";
        for (int count = 0; count < employees.length; count++) {
            if (employees[count] != null) {
                result += String.format("""
                Office: %s,
                First Name: %s,
                Last Name: %s,
                Type: %s,
                Address:
                %s""", myNum, employees[count].getFname(), employees[count].getLname(), employees[count].getType(), employees[count].getMyAddress());
                    if (employees[count].getType().equalsIgnoreCase("Manager")) {
                        result += "Car Model: " + employees[count].getCarModel() + "\n";
                    }
                result += "\n";
            }
        }
        return result;
    }

//    The overridden toString function to output the office id field
    @Override
    public String toString() {
        return "Office ID: " + myNum;
    }

}
