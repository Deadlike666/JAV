package Setclass;
import java.util.*;
import java.io.InputStream;
public class IteratorTest {
    public static void main(String[] agrs){
        Set set = new HashSet();//创建有一个set集合
        set.add("Tom");
        set.add("Alice");
        Iterator it = set.iterator();//构造set迭代器
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
