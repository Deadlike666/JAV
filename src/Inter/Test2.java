package Inter;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] agrs){
        Shape shape1 = new Circle(5);//向上转型，Circle类的对象转型为Shape类的对象
        //但是Shape 类的的对象只具有两个方法，求面积和求周长

        System.out.println("The circle Area:"+shape1.getArea());
        Shape shape2 = new Rectangle(4,5);
        System.out.println("The Rectangle Area:"+shape2.getArea());
    }
}
