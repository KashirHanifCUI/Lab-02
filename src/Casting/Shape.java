package Casting;

public class Shape {
    private double length;
    private double width;
    private double radius;
    public Shape(double length,double width,double radius) {
        setLength(length);
        setRadius(radius);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calArea() {
        return 0.0;
    }
    public boolean equals(Object o){
        if(o instanceof Rectangle){
            return true;
        }
        else {
            return false;
        }
    }
}
