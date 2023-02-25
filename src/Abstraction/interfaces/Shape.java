package Abstraction.interfaces;

public interface Shape {
    /*Circle, Triangle, Rectangle is-a Shape */
    //However, code sharing isn't useful in this case because each class implements its behavior differently
    /*                Area    Perimeter
    *   Circle:    Pi * R* R   2* pi* R
    *  Rectangle:  L*W        (w+l)*2
    *  Triangle:   h*b/2      a+b+c
    * */

    double calculateArea();
    double calculatePerimeter();
}
