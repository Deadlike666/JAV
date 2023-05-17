package Setclass;
import java.util.*;
public class Listtest{
    public static void main(String[] args){
        //List接口是Collection接口的子接口
        //允许重复元素，有序对象集合，
        //List接口常用实现类有ArrayList,Vector,LinkedList,Stack;
        List list  = new ArrayList();
        list.add("1");
        list.add(3.0);
        list.add(3.0);//添加重复对象
        System.out.println("List:"+list);

    }
}
