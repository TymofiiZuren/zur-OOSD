package ie.setu.q2;

public class Student extends Person {
    private String name;
    private String course;

    public Student(String name, String course) {
        super(name);
        setCourse(course);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String getDescription() {
        return "A student studying " + course;
    }
}
