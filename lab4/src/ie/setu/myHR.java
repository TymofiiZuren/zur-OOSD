// Author: Tymofii Mazurenko
// Student ID: C00325393
// Date: 14/10/2025
// Purpose: To complete myHR system and to use aggregation.

package ie.setu;

import java.util.Scanner;

public class myHR {

    public static void main(String[] args) {
//        Initializing the
        Scanner scan = new Scanner(System.in);
        Office[] offices = new Office[3];
        Employee[] employees = new Employee[5];
        for (int i = 0; i < offices.length; i++) {
            offices[i] = new Office();
        }

//          Predefined variables for necessary fields.
        int choice;
        String name;
        String surname;
        Address address;
        String street;
        String city;
        String county;
        String type;
        String carModel = null;

//      Taking the choice input the program is routing to the correct function.
        do {
            System.out.println("1. List all offices");
            System.out.println("2. Create a new employee record");
            System.out.println("3. List all employees");
            System.out.println("4. exit");
            choice = scan.nextInt();

//            If choice is 1 then the list of all offices is outputted
            if (choice == 1) {
//                The for loop is dealing with the offices in an array
//                The loop is outputting offices and Employees count respectively.
                for (int i = 0; i < offices.length; i++) {
                    System.out.println(offices[i] + ", Employees: " + offices[i].getEmployeeCount());
                }
            }
//            If choice is 2 then a new employee is created
            else if (choice == 2) {
//                Employee is created only when the list of all employees is less than 5
                if (Employee.listEmployees() < 5) {
//                    The inputs are taken here for all the available fields to create Employee
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter employee name: ");
                    name = sc.nextLine();
                    System.out.println("Enter employee surname: ");
                    surname = sc.nextLine();
                    System.out.println("Enter employee street: ");
                    street = sc.nextLine();
                    System.out.println("Enter employee city: ");
                    city = sc.nextLine();
                    System.out.println("Enter employee county: ");
                    county = sc.nextLine();
                    System.out.println("Enter employee type: ");
                    type = sc.nextLine();
                    if (type.equalsIgnoreCase("Manager")) {
                        System.out.println("Enter employee car model: ");
                        carModel = sc.nextLine();
                    }
                    address = new Address(street, city, county);
                    employees[Employee.listEmployees()] = new Employee(carModel, address, name, surname, type);

//                    This adds new employee if the total count in one office is less than 2
                    for (Office office : offices) {
                        if (office.getEmployeeCount() < 2) {
                            office.addNewEmployee(employees[Employee.listEmployees()-1]);
                            break;
                        }
                    }
                }
            }
//            If the choice is 3 then the employee records are outputted
//            The offices containing employees output the records
            else if (choice == 3) {
                for (int i = 0; i < offices.length; i++) {
                    System.out.print(offices[i].employeeRecords());
                }
            }
        }
//        The loop continues until the choice is 4.
        while (choice != 4);

        scan.close();
    }
}
