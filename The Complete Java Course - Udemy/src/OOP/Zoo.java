package OOP;

public class Zoo {

    public static void main(String[] args) {

        Bird bird1 = new Bird("Vião", 4, 2.835, "M", "free");
        Sparrow sparrow1 = new Sparrow("Jack", 2, 0.5, "M", "free");
        Fish fish1 = new Fish("Dirac", 3, 0.003, "M", "aquarium");
        Chicken chicken1 = new Chicken("Zé Frango", 1, 3, "M", "Not here.");

        animalInformation(bird1);
        animalInformation(sparrow1);
        animalInformation(fish1);
        animalInformation(chicken1);
        animalName(bird1);
        moveAnimal(bird1);
        animalName(sparrow1);
        moveAnimal(sparrow1);
        animalName(fish1);
        moveAnimal(fish1);
        animalName(chicken1);
        moveAnimal(chicken1);

    }

    public static void animalName(Animal animal){
        System.out.printf("Its names is %s. %n", animal.name);
        System.out.println("-----");
    }

    public static void animalInformation(Animal animal){
        animal.information();
    }

    public static void moveAnimal(Animal animal){
        animal.move();
    }
}
