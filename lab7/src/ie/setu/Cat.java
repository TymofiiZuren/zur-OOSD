package ie.setu;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public String makeSound() {
        return "Meow!";
    }

    public String eat() {
        return "Cat is eating fish";
    }

    public String status() {
        return "Needs vaccinating";
    }
}
