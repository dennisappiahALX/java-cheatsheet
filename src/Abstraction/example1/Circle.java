package Abstraction;

public class Circle {
    //circle consists of center(point (x,y)) and radius - A circle has-a point
    //composition
    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    //Area of a circle
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
