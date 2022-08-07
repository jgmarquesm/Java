package OOP;

public class Bird extends Animal{

    // That's the structure of a child class. It extends, "abstract" the parent Class.
    // For example, in parente class (Animal) we can define all comum things of all animals
    // and create children classes with uniques behaviors of a speficied animal.
    public Bird(String species, String name, int age, double weight, String sex, String localization) {
        super(species, name, age, weight, sex, localization);
    }

    public void fly(){
        System.out.printf("%s is flying.%n", name);
        System.out.println("-----");
    }
}
