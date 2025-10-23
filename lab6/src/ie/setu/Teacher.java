// Name: Tymofii Mazurenko
// StudentID: C00325393
// Date: 23/10/2025
// Purpose: Complete the lab 6 with ( Aggregation and Inheritance )

package ie.setu;

public class Teacher extends Person {
    private int numCourses; // The number of courses
    private String[] courses; // The courses array
    public final int MAX_NUMBER_COURSES = 3; // The max number of courses

    public Teacher(String name, String address) {
        super(name, address); // The super class with name and address fields
        courses = new String[MAX_NUMBER_COURSES]; // initialization of courses variable
        numCourses = 0; // counter is initialized
    }

    // Method that adds the course to an array
    public boolean addCourse(String course) {
        // Looping through all the added courses
        for (int i = 0; i < numCourses; i++) {
            // Checks course existence against the available courses
            if (courses[i].equals(course)) {
                return false;
            }
        }
        courses[numCourses] = course; // assigns the course to an array's index
        numCourses++; // counts up the courses number
        return true;
    }

    public boolean removeCourse(String course) {
        int index = numCourses; // saves the number to numCourses
        for (int i = 0; i < numCourses; i++) {
            // Finds the index of a matching course.
            if (courses[i].equals(course)) {
                index = i;
            }
        }
        if (index == numCourses) {
            return false;
        } else {
            // left shifts the array
            for  (int i = 1; i < numCourses; i++) {
                courses[i-1] = courses[i];
            }
            // decrements the numCourses
            numCourses--;
            return true;
        }
    }

    public String toString(){
        // return the Teachers description
        return "Teacher: " + super.toString();
    }
}
