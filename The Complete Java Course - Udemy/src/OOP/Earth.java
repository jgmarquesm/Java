package OOP;

public class Earth{

    public static void main(String[] args) {

        // Instance creating using our own constructor
        Human joao = new Human("João", 24, 1.78, "brown");
        // Instance creating using SEC
        Human edla = new Human();

        joao.speak();
        System.out.println("-----");
        edla.speak();
        System.out.println("-----");

        // initializing the atributes of object
        edla.name = "Édla";
        edla.age = 24;
        edla.heightInMeters = 1.6;
        edla.eyeColor = "brown";
        edla.speak();
        System.out.println("-----");

        joao.work();
        System.out.println("-----");
        edla.sleep();
        System.out.println("-----");
    }
}
