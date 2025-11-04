package ie.setu;

public class Vet {
    private String name;

    public Vet(String name) {
        this.name = name;
    }

    public void vaccinate(Animal animal) {
        System.out.println(this.name + " is vaccinating.");
        if (animal instanceof Dog) {
            System.out.println("Dog has been vaccinated.");
        } else if (animal instanceof Cat) {
            System.out.println("Cat has been vaccinated.");
        }
    }
}
