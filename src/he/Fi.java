package he;
//Final 修饰符
public class Fi {
    public static final int num;
    static {
        num = 6;
    }
    public static void main(String[] args){
        System.out.println(num);
        Circle c1 = new Circle(12);
        System.out.println("The circle 's area is :"+c1.getArea());
    }
}
