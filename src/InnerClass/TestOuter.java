package InnerClass;

public class TestOuter {
    public static void main(String[] args){
        Outer o1 = new Outer("Alice");
        o1.print();
        Outer.Inner inner = o1.new Inner();
        inner.print();
    }
}
