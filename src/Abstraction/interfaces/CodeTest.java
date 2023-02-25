package Abstraction.interfaces;

public class CodeTest {
    public static void main(String[] args) {
        Shape shape1 = new Circle(10,5,4);
        Shape shape2 = new Rectangle(5,4);
        Shape shape3 = new Triangle(7,5,4,5,6);

        System.out.println("Area of a circle: "+ shape1.calculateArea());
        System.out.println("Perimeter of a circle: "+ shape1.calculatePerimeter());

        System.out.println("Area of a rectangle: "+ shape2.calculateArea());
        System.out.println("Perimeter of a rectangle: "+ shape2.calculatePerimeter());

        System.out.println("Area of a triangle: "+ shape3.calculateArea());
        System.out.println("Perimeter of a triangle: "+ shape3.calculatePerimeter());
    }
}
