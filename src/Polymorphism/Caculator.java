package Polymorphism;
import java.util.Scanner;
//多态的两种实现方式
//方法的重载
//方法的重载是指一个类中定义了多个名字相同，参数不同的方法，当实际调用时，JAVA编译器会根据参数不同
//来自动决定调用哪一个类方法

//方法的覆盖，即子类通过覆盖父类的方法或类实现接口的方法
public class Caculator {
    public static  double sum(double x,double y){
        return x+y;
    }
    public static int sum(int x,int y){
        return x+y;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=  Caculator.sum(4,5);
        System.out.println("The ans:"+sum);
        System.out.println("The ans type"+sum);
    }
}
