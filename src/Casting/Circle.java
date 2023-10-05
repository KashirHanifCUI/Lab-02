package Casting;

public class Circle extends Shape{
    public Circle(double radius){
        super(0.0,0.0,radius);
    }
    @Override
    public double calArea(){
        return getRadius() * getRadius() * Math.PI;
    }
}
