package ie.setu.q2;

public class Employee extends Person {
    private String name;

    private double annualSalary;

    public Employee(String name, double annualSalary) {
        super(name);
        setAnnualSalary(annualSalary);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String getDescription() {
        return "An employee with a salary of " + annualSalary;
    }
}
