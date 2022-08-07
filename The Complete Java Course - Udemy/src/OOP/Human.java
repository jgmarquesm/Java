package OOP;

public class Human {

    String name;
    int age;
    double heightInMeters;
    String eyeColor;

    // We have a Standard IMPLICIT Constructor(SIC) in all Java Classes that cresate the objects
    // of the class, but we can define our own constructor special method, and the SIC will
    // disappear, so if we wanna maintain the SIC we need to Create it explicit: SIC -> SEC.

    // SEC - Standard EXPLICIT Constructor
    public Human(){}

    public Human(String name, int age, double heightInMeters, String eyeColor){
        this.name = name;
        this.age = age;
        this.heightInMeters= heightInMeters;
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.printf("Hello, my name is %s.%n", name);
        System.out.printf("I'm %d years old.%n", age);
        System.out.printf("I'm %3.2f meters tall.%n", heightInMeters);
        System.out.printf("My eye color is %s.%n", eyeColor);
    }

    public void eat(){
        System.out.printf("%s is eating.%n", name);
    }

    public void walk(){
        System.out.printf("%s is walking.%n", name);
    }

    public void work(){
        System.out.printf("%s is working.%n", name);
    }

    public void sleep(){
        System.out.printf("%s is sleeping.%n", name);
    }
}
