package ie.setu;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String makeSound();

    public abstract String eat();

    public abstract String status();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "name: " + name;
    }
}