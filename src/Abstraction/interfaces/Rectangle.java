package Abstraction.interfaces;

public class Rectangle implements Shape{
        double length;
        double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length* width;
    }

    @Override
    public double calculatePerimeter() {
        return (width + length) *2;
    }
}
