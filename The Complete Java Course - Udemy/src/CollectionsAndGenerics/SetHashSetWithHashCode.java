package CollectionsAndGenerics;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetHashSetWithHashCode {

    public static void main(String[] args) {

        // Sets are too similar to Lists, the difference is that sets does not allow duplicated
        // values on them, but Lists allows.
        HashSet<Integer> values = new HashSet<Integer>();
        values.add(20);
        values.add(3);
        values.add(99);
        values.add(42);
        values.add(1);
        values.add(50);
        values.add(565);
        values.add(42);

        LinkedHashSet<String> words = new LinkedHashSet<String>();
        words.add("Hey");
        words.add("João");
        words.add("Hey");
        words.add("hey");
        words.add("Thanks");
        words.add("Java");
        words.add("Hey");

        // It will be printed in any order because it's a HashSet
        for (int value : values){
            System.out.println(value);
        }
        // And it will be printed in order of atribuiton, because it's a LinkedHashSet
        for (String word : words){
            System.out.println(word);
        }

        HashSet<Animal> animals = new HashSet<Animal>();

        Animal animal1 = new Animal("Dog", 12);
        Animal animal2 = new Animal ("Cat", 8);
        Animal animal3 = new Animal("Bird", 3);
        Animal animal4 = new Animal ("Dog", 12);
        Animal animal5 = new Animal ("Kangaroo", 24);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);

        // Warning: Before Overwrite the methods toString and hashcode, the animal1 and animal4
        // were being considered differents, and were assigned twice in the HashSet;
        // The HasSet verify the equality of hashcode to validate if the values are equals.

        System.out.printf("Animal1 hashcode: %d.%n", animal1.hashCode());
        System.out.printf("Animal4 hashcode: %d.%n", animal4.hashCode());
        System.out.printf("Animal1 is equals to Animal4? %b.%n", animal1.equals(animal4));

        for (Animal animal : animals){
            System.out.println(animal);
        }
    }
}
