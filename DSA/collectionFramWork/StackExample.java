package collectionFramWork;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> name = new Stack<>();

        name.push("Shabaj");
        name.push("Asif");
        name.push("Irshad");

        while(!name.isEmpty()){
            System.out.println(name.pop());
        }
    }
}
