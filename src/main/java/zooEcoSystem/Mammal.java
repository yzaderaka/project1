package zooEcoSystem;

public abstract class Mammal extends Animal{

    String skinColor;
    public Mammal(String name, int age, String skinColor) {
        super(name, age);
        this.skinColor=skinColor;
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+age);
        System.out.println("Skin color: "+skinColor);
    }

    @Override
    public void eat() {

    }

    @Override
    public void makeSound() {

    }
}
