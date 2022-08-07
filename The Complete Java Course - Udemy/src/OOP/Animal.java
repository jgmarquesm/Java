package OOP;

public class Animal {

    String species;
    String name;
    int age;
    double weight;
    String sex;
    String localization;

    public Animal(String species, String name, int age, double weight, String sex, String localization) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        this.localization = localization;
    }

    public void information(){
        System.out.printf("%s is a %s %s. %s is %d years old and its weight is %3.3f Kg. Loaclization " +
                        "at the Zoo: %s.%n", name, sex, species, name, age, weight, localization);
        System.out.println("----");
    }

    public void eat(){
        System.out.printf("%s is eating.%n", name);
        System.out.println("----");
    }

    public void sleep(){
        System.out.printf("%s is sleeping.%n", name);
        System.out.println("----");
    }

    public void run(){
        System.out.printf("%s is running.%n", name);
        System.out.println("----");
    }

    public void jump(){
        System.out.printf("%s is jumping.%n", name);
        System.out.println("----");
    }
}
