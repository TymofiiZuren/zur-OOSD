package ie.setu;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public String makeSound() {
        return "Woof!";
    }

    public String eat() {
        return "Dog eats meat";
    }

    public String status() {
        return "Needs vaccinating";
    }
}
