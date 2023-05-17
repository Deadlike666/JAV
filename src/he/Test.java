package he;
public class Test {
    static {
        System.out.println("Hello World!");
    }
    public static void main(String[] args){
        Circle c1 = new Circle(5);
        System.out.println(c1.getArea());
        System.out.println(c1.getRadius());
        int i;
        for(i = 0;i < 50;i++){
            Circle c = new Circle(2);
        }
        System.out.println("The num of circle is:"+Circle.num);
    }

}
class Circle{
    private double radius;//实例变量
    static int num = 0;
    public Circle(double radius){
        this.radius = radius;
        ++num;
    }
    public double getArea() {
        return 0.5 *radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getmeteri(){
        return 2*radius;
    }
}
