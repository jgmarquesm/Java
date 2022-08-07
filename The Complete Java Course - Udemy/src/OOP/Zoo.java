package OOP;

public class Zoo {

    public static void main(String[] args) {

    Animal animal1 = new Animal("Lion", "Leo", 5, 190, "M","cage1");
    Animal animal2 = new Animal("Tiger", "Kelloggs", 7, 250, "M","cage2");
    Animal animal3 = new Animal("Cat", "Ravena", 2, 4, "F","free");

    animal1.information();
    animal1.sleep();
    animal2.information();
    animal1.eat();
    animal3.information();
    animal3.jump();

    Bird bird1 = new Bird("Ruby-Throatted Hummingbird", "Vião", 4, 2.835, "M", "free");
    bird1.information();
    bird1.fly();

    Fish fish1 = new Fish("Betta splendens", "Dirac", 3, 0.003, "M", "aquarium");
    fish1.information();
    fish1.swin();
    }
}
