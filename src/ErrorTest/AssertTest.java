package ErrorTest;

public class AssertTest {
    public static void main(String[] args) {
        int a = 10,b = 0,c =0;
        assert b!=0:"b is zero";
        c = a/b;
        System.out.printf("c="+c);
    }
}
