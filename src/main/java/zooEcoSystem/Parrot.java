package zooEcoSystem;

public class Parrot extends Bird {
    String feathersColor;

    public Parrot(String name, int age, double wingspans, boolean canFly, String feathersColor) {
        super(name, age, wingspans, canFly);
        this.feathersColor = feathersColor;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Featers color: " + feathersColor);
    }

    @Override
    public void eat() {
        System.out.println(name + " the parrot is eating seeds and fruits.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + "can talk & sing");
    }
}
