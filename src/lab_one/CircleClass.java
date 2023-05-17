package lab_one;
import java.lang.Math;
public class CircleClass  extends ShapeClass{
    private double radius;
    public CircleClass(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
