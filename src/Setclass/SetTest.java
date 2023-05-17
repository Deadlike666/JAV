package Setclass;
import java.util.*;
public class SetTest {
    public static void main(String[] args){
        Set set = new HashSet();
        set.add("a3");
        set.add("a1");
        set.add(7.0);
        set.add(1);
        set.add("b4");
        System.out.println("set = "+set);
        for (Object o:set)
            System.out.println(" "+o);

    }
}
