package Inter;
import java.util.Scanner;
public class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(){};
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    public static void main(String[] args){
        Circle C1 = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the radius:");
        double radius = sc.nextDouble();
        C1.setRadius(radius);
        System.out.println("The Circle:"+C1.radius);
    }
}
