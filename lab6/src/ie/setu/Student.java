// Name: Tymofii Mazurenko
// StudentID: C00325393
// Date: 23/10/2025
// Purpose: Complete the lab 6 with ( Aggregation and Inheritance )

package ie.setu;

public class Student extends Person {
    private int numCourses; // creates a variable numCourses
    private String[] courses; // creates a variable courses
    private int[] grades; // creates a variable grades
    private final int MAX_NUMBER_COURSES = 5; // creates a variable MAX_NUMBER_COURSES

    public Student(String name, String address) {
        super(name, address); // refers to the super class to initialize it
        courses = new String[MAX_NUMBER_COURSES]; // initializes courses with MAX_NUMBER_COURSES
        grades = new int[MAX_NUMBER_COURSES]; // initializes grades with MAX_NUMBER_COURSES
        numCourses = 0; // initializes numCourses
    }

    // Method that adds the Course and Grade
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course; // assigns the course to the index numCourses in courses array
        grades[numCourses] = grade; // assigns the grade to the index numCourses in grades array
        numCourses++; // increments the numCourses
    }

    // Method prints the courses and their grades
    public void printGrades() {
        // Loops through the array to get courses and grades
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ":" + grades[i]);
        }
    }

    // Method gets the average grade
    public double getAverageGrade() {
        double average = 0;
        // get the grades and calculate the average
        for (int grade : grades) {
            average += grade;
        }
        return average / numCourses;
    }

    public String toString() {
        // Returns the Student description
        return "Student: " + super.toString();
    }
}
