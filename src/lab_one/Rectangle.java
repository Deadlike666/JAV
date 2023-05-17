package lab_one;

public class Rectangle implements Shape{
    private double x,y;
    public Rectangle(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getArea() {
        return x*y;
    }

    @Override
    public double getPerimeter() {
        return 2*(x+y);
    }
}