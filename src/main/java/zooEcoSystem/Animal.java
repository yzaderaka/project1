package zooEcoSystem;

public abstract class Animal implements AnimalBehavior {

    protected String name;
    protected int age;

    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public void sleep() {

    }

    public abstract void displayInformation();

}
