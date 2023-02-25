package Abstraction.interfaces;

public class Triangle implements Shape {
    double height;
    double base;
    double a;
    double b;
    double c;

    public Triangle(double height, double base, double a, double b, double c) {
        this.height = height;
        this.base = base;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        return 1/2 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }
}
