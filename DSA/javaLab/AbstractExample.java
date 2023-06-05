package javaLab;

abstract class Animals {
    public abstract void isWalking();

    public abstract void isEating();
}

class Dog extends Animals {

    @Override
    public void isWalking() {
        System.out.println("Dog is Walking");
    }

    @Override
    public void isEating() {
        System.out.println("Dog is Eating");
    }
}

class Cat extends Animals {

    @Override
    public void isWalking() {
        System.out.println("Cat is walking");
    }

    @Override
    public void isEating() {
        System.out.println("Cat is walking");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Animals dog = new Dog();
        Animals cat = new Cat();
        dog.isWalking();
        dog.isEating();
        cat.isWalking();
        cat.isEating();
    }
}
