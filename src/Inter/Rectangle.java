package Inter;

public class Rectangle extends Shape{
    private double x,y;
    public Rectangle(double x,double y){
        this.x = x;
        this.y = y;
    }
    public Rectangle(){};

    @Override
    public double getPerimeter() {
        return x+x+y+y;
    }

    @Override
    public double getArea() {
        return x*y;
    }

}
