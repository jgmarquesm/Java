package OOP;

public class Bird extends Animal{

    // That's the structure of a child class. It extends, "abstract" the parent Class.
    // For example, in parente class (Animal) we can define all comum things of all animals
    // and create children classes with uniques behaviors of a speficied animal.
    // It implies the idea of 'Inheritance'.
    public Bird(String name, int age, double weight, String sex, String localization) {
        super(name, age, weight, sex, localization);
    }

    public void move() {
        System.out.printf("%s is flapping wings.%n", name);
        System.out.println("-----");
    }
}
