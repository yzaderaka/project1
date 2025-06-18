package zooEcoSystem;

public abstract class Bird extends Animal {
    private double wingspans;
    private boolean canFly;

    public Bird(String name, int age, double wingspans, boolean canFly) {
        super(name, age);
        this.wingspans=wingspans;
        this.canFly=canFly;
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+age);
        System.out.println("Wingspans: "+wingspans);
        System.out.println("Can fly: "+canFly);
    }

    @Override
    public void eat() {

    }

    @Override
    public void makeSound() {

    }
}
