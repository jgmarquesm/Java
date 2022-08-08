package OOP;

// Abstract classes are a special kind of classes that can't be instantiated, but it just
// can be extended. So an abstract class is alway a parent class and never can be instantiated.
// Abstract classes and methods implies the idea of 'Polymorphism'.
public abstract class Animal {

    String name;
    int age;
    double weight;
    String sex;
    String localization;

    public Animal(String name, int age, double weight, String sex, String localization) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        this.localization = localization;
    }

    public void information() {
        System.out.printf("%s is a %s. %s is %d years old and its weight is %3.3f Kg. Loaclization " +
                "at the Zoo: %s.%n", name, sex, name, age, weight, localization);
        System.out.println("----");
    }

    public void eat() {
        System.out.printf("%s is eating.%n", name);
        System.out.println("----");
    }

    public void sleep() {
        System.out.printf("%s is sleeping.%n", name);
        System.out.println("----");
    }

    // In same way that abstract classes, abstract methods are just declared here and
    // only will be defined in the child class.
    public abstract void move();
}
