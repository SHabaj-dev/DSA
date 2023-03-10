package collectionFramWork;
/*
Example program to demonstrate the array list in java
 */
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Shabaj");
        name.add("Asif");
        name.add("Irshad");
        name.add("Kashif");
        name.add("Prabhat");

        System.out.println(name);

        name.add(3, "Superman");
        for(String s : name){
            System.out.println(s);
        }

        if(name.contains("Asif")){
            System.out.println("Is Present");
        }



    }
}
