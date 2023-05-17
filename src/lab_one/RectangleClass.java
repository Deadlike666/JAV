package lab_one;
public class RectangleClass extends ShapeClass{
    private double x,y;
    public RectangleClass(double x,double y){
        this.x = x;
        this.y = y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getPerimeter() {
        return 2*(x+y);
    }

    @Override
    public double getArea() {
        return x*y;
    }
}
