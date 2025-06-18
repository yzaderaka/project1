package zooEcoSystem;

public class Elephant extends Mammal {
    private double trunkLength;

    public Elephant(String name, int age, String skinColor, double trunkLength) {
        super(name, age, skinColor);
        this.trunkLength = trunkLength;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Trunk lenght: " + trunkLength + " meters");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }
}
