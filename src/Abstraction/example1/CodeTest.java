package Abstraction;

public class CodeTest {
    /* Inheritance is used to implement "is_a" relation */
    /*Composition is used to implement "has_a" relation */
    public static void main(String[] args) {
        Point point = new Point(5,5);
        Circle c1 = new Circle(point, 10);

        System.out.println(c1.calculateArea());
        System.out.println(c1.center.x);
    }

}
