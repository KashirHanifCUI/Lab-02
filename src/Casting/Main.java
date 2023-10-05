package Casting;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(3,4);
        Shape s2 = new Circle(3);
        System.out.println(s1.calArea());
        System.out.println(s2.calArea());
        boolean result = s2.equals(s2);
        System.out.println(result);
    }
}
