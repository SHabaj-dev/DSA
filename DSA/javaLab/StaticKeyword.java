package javaLab;

class NewClass {

    public static void exampleMethod() {
        System.out.println("This is the static example method body.");
    }
}


public class StaticKeyword {
    public static void main(String[] args) {
        NewClass.exampleMethod();
    }
}
