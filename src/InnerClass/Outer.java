package InnerClass;
//实例成员的内部类
//实例成员的内部类存在于类的内部，方法外卖呢的一个类，他与实例变量的地位相同
//内部类为外部类所有，存在于对象的内存空间
import javax.management.InstanceNotFoundException;
import java.util.Scanner;
public class Outer {
    private String name;
    static String country = "Chinese";//Outer的类变量
    public Outer(String name){
        this.name = name;
    }
    public void print(){
        System.out.println("Outer Class method:");
        new Inner().print();
    }
    public class Inner{
        public void print(){
            System.out.println("Inner method classs"+name);//访问实例变量
            System.out.println("country"+country);//访问类变量
        }
    }
}
