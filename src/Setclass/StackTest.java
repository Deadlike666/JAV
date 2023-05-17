package Setclass;
import java.util.*;
public class StackTest {
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push("a1");
        stack.push("a2");
        stack.push("a3");
        System.out.println(stack);
        String t1 = (String)stack.pop();//"a3"
        String t2 = (String)stack.pop();//a2
        String t3 = (String)stack.pop();//a3
    }
}
