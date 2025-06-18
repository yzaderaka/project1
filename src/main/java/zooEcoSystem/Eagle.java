package zooEcoSystem;

public class Eagle extends Bird{
    private double flyingSpeed;

    public Eagle(String name, int age, double wingspans, boolean canFly, double flyingSpeed) {
        super(name, age, wingspans, canFly);
        this.flyingSpeed=flyingSpeed;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Flying speed "+flyingSpeed+" km/h");
    }

    @Override
    public void eat() {
        System.out.println(name+" eagle is hunting");
    }

    @Override
    public void makeSound() {
        System.out.println(name+" making specific sounds");
    }
}
