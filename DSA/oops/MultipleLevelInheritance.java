package oops;

public class MultipleLevelInheritance {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        rectangle.printShapeName("Rectangle");
        rectangle.printShapeColor("Red");

        circle.printShapeName("Circle");
        circle.printShapeColor("Blue");
    }
}

class Shape {

    void printShapeName(String shapeName) {
        System.out.println(shapeName + " is the shape");
    }

    void printShapeColor(String colorName) {
        System.out.println(colorName + " is the shape color");
    }
}

class Rectangle extends Shape {

    @Override
    void printShapeName(String shapeName) {
        System.out.println(shapeName + " is the shape");
    }

    @Override
    void printShapeColor(String colorName) {
        System.out.println(colorName + " is the shape color");
    }
}

class Circle extends Shape {
    @Override
    void printShapeName(String shapeName) {
        System.out.println(shapeName + " is the shape");
    }

    @Override
    void printShapeColor(String colorName) {
        System.out.println(colorName + " is the shape color");
    }
}
