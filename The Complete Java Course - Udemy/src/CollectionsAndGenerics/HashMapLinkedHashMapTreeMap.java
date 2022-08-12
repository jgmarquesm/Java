package CollectionsAndGenerics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapLinkedHashMapTreeMap {

    public static void main(String[] args) {

        // A map is like the dictionaries in Python - it's a key-value data structure;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");
        hashMap.put("key4", "value4");
        hashMap.put("key5", "value5");

//        for (String word: hashMap.keySet()){
//            System.out.println(word);
//        }
        // If you wanna print in atribuition order, you must use LinkedHashMap<>...
        // If you wann to print it in 'Natural order: alphabetical, ascending, ...' you must
        // use TreeMap

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("a", "1");
        linkedHashMap.put("j", "2");
        linkedHashMap.put("l", "3");
        linkedHashMap.put("z", "4");
        linkedHashMap.put("b", "5");

        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("v", "4");
        treeMap.put("z", "5");
        treeMap.put("c", "2");
        treeMap.put("f", "3");
        treeMap.put("a", "1");


        // To print the key and values together, you must use:
        System.out.println("----- HashMap -----");
        System.out.println("\"Random\" Order");
        for (Map.Entry<String, String> entry: hashMap.entrySet() ){
            System.out.printf("%s: %s.%n", entry.getKey(), entry.getValue());
        }
        System.out.println("----- LinkedHashMap -----");
        System.out.println("Atribuition Order");
        for (Map.Entry<String, String> entry: linkedHashMap.entrySet() ){
            System.out.printf("%s: %s.%n", entry.getKey(), entry.getValue());
        }
        System.out.println("---- TreeMap -----");
        System.out.println("Alphabetical Order");
        for (Map.Entry<String, String> entry: treeMap.entrySet() ){
            System.out.printf("%s: %s.%n", entry.getKey(), entry.getValue());
        }
    }
}
