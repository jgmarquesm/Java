package OOP;

public class Sparrow extends Bird implements Flyable{

    public Sparrow(String name, int age, double weight, String sex, String localization) {
        super(name, age, weight, sex, localization);
    }

    @Override
    public void fly() {
        System.out.printf("%s is flying.%n", name);
        System.out.println("-----");
    }
}
