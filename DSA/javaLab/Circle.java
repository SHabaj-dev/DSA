package javaLab;

public class Circle {
    private double radius;
    private double area;
    private double perimeter;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calArea() {
        this.area = Math.PI * this.radius * this.radius;
    }

    public void calPerimeter() {
        this.perimeter = 2 * Math.PI * this.radius;
    }

    public void displayAreaPerimeter() {
        System.out.println("Circle with radius " + this.radius);
        System.out.println("Area: " + this.area);
        System.out.println("Perimeter: " + this.perimeter);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        circle1.calArea();
        circle1.calPerimeter();
        circle1.displayAreaPerimeter();

        Circle circle2 = new Circle(20);
        circle2.calArea();
        circle2.calPerimeter();
        circle2.displayAreaPerimeter();
    }
}
