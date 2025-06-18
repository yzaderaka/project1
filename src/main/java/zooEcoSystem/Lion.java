package zooEcoSystem;

public class Lion extends Mammal{
    public Lion(String name, int age, String skinColor) {
        super(name, age, skinColor);
    }

    @Override
    public void eat() {
        System.out.println(name+" lion eating meat.");
    }

    @Override
    public void makeSound() {
        System.out.println(name+" lion roars very loud.");
    }
}
