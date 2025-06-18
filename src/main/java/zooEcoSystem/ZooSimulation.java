package zooEcoSystem;

public class ZooSimulation {
    public static void main(String[] args) {
        Animal dik=new Lion("Dik",7,"striped black and yellow");
        Animal jumbo=new Elephant("Jumbo",10,"grey",3.3);
        Animal coco=new Parrot("Coco", 2,0.12,true,"multicolor");
        Animal aquila=new Eagle("Auqila", 4,2.2, true,320);

        Animal[] animals={dik,jumbo,coco,aquila};
        for (Animal animal:animals){
            animal.displayInformation();
            animal.eat();
            animal.makeSound();
            animal.sleep();
            System.out.println();
        }

    }
}
