package Casting;

public class Rectangle extends Shape{
    public Rectangle(double length,double width){
        super(length,width,0.0);
    }
    @Override
    public double calArea(){
        return getLength() * getWidth();
    }
}
