package javaLab;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(Rectangle rectangle) {
        this.length = rectangle.length;
        this.breadth = rectangle.breadth;
    }

    public void calArea() {
        double area = this.length * this.breadth;
        System.out.println("Area of the rectangle is: " + area);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.calArea();

        Rectangle rectangle2 = new Rectangle(5, 10);
        rectangle2.calArea();

        Rectangle rectangle3 = new Rectangle(rectangle2);
        rectangle3.calArea();
    }
}

