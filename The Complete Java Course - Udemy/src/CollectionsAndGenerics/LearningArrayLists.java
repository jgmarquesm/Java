package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.LinkedList;

public class LearningArrayLists {

    public static void main(String[] args) {


        // The arraylist is very similar to the array, but it is most useful becsause one of its difference is the fact that
        // an arraylist has no fixed number of slots. So we can work better, using less memory and with the possibility
        // to put more itens on demand. Other difference, between them is that arraylist can mix various data types in same
        // object.

        ArrayList things = new ArrayList();
        things.add("Hey, I'm a ArrayList");
        things.add("and I can store many data types");
        things.add(10);
        things.add(3.14159F);
        things.remove(2);
        things.add('#');

        // The add(item) method just adds the passed parameter in ArrayList;
        // But remove(item) method removes an item from the ArrayList using its index;
        // If we wanna know which item is on an index, we call the method get(index). This method returns an object not a String.

        // To force the Java just accept put the same data type in an ArrayList we must specifie it. Look How:
        // Using Generics <TYPE> -> used to parametrization;

        ArrayList<String> words = new ArrayList<String>();
        words.add("Hey");
        words.add("Are you, okay?");
        words.add("Yes");
        words.add("Thanks!");

        // We can't use primitives types as parameter in complex data types, we need to use Wrappers.

        // Printing the elements of an ArryList
        for(int i = 0; i < words.size(); i++){
            System.out.println(words.get(i));
        }
        System.out.println("-----");
        // For each loop
        for(String word : words){
            System.out.println(word);
        }

        ArrayList<String> newList = new ArrayList<>();
        newList.add("10");
        newList.add("João");
        newList.add("Yes");
        newList.add("Hey");

        // If you wanna merge two lists, you can call the method addAll()
        // list1.addAll(list2) -> merge list2 in list1
        System.out.println("-----");
        newList.addAll(words);
        for (String item : newList){
            System.out.println(item);
        }

        // If you wanna remove the intersection of two lists, you can call the method removeAll()
        // list1.removeAll(list2) -> will remove all comum itens in list1
        System.out.println("-----");
        newList.removeAll(words);
        System.out.println(newList);

        System.out.println("-----");
        newList.add("Yes");
        newList.add("Hey");
        // In oppositive way from removeAll that remove intersection of 2 lists, we
        // can use a method to remove the union of the lists: retainAll()
        newList.retainAll(words);
        System.out.println(newList);

        System.out.println("-----");
        // If you want to delete all data from a list, just call clear() method
        newList.clear();
        System.out.println(newList);

        System.out.println("-----");
        // To verify if the list contains any item, you can use the method contains()
        boolean verify = words.contains("Haha");
        System.out.println(verify);

        System.out.println("-----");
        // To verify if a list is empty, just call isEmpty() method
        boolean empty = newList.isEmpty();
        System.out.println(empty);

    }
}
