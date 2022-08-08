package OOP;

public class Fish extends Animal{

    public Fish(String name, int age, double weight, String sex, String localization) {
        super(name, age, weight, sex, localization);
    }

    public void move() {
        System.out.printf("%s is swimming.%n", name);
        System.out.println("-----");
    }
}
