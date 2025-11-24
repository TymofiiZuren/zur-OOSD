package ie.setu.q2;

public class TestPerson {

    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Alex", 3423);
        people[1] = new Student("John", "Robotics");

        System.out.println("Employee using superclass reference Person");
        System.out.println("Name: " + people[0].getName());
        System.out.println("Description: " + people[0].getDescription());

        System.out.println("\nStudent using superclass reference Person");
        System.out.println("Name: " + people[1].getName());
        System.out.println("Description: " + people[1].getDescription());
    }

}
