package OOP;

public class Fish extends Animal{

    public Fish(String species, String name, int age, double weight, String sex, String localization) {
        super(species, name, age, weight, sex, localization);
    }

    public void swin(){
        System.out.printf("%s is swinning.%n", name);
        System.out.println("-----");
    }
}
