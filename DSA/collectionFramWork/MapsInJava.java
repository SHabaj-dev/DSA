package collectionFramWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapsInJava {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        System.out.println("Hashmap -> " + map);
        map.put("Java", 8);
        map.put("C++", 2);
        map.put("Python", 7);
        map.put("Kotlin", 9);

        System.out.println("Hashmap Key set : " + map.keySet());
        System.out.println("Hashmap values : " + map.values());
        System.out.println("Hashmap entrySet : " + map.entrySet());

        System.out.println("key java is Mapped to " + map.get("Java"));
    }
}
