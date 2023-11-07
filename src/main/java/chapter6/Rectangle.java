package chapter6;
/*
Write a class that describes the fields and methods of a rectangle. Then write another
class that creates instances of the rectangle class to find the total area of two rooms.
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length;
        setWidth(width);

    }

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double calculatePerimeter(){
        double perimeter = 2 * (width + length);
        return perimeter;
    }

    public double calculateArea(){
        double area = width * length;
        return area;

    }


}
