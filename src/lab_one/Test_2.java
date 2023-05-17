package lab_one;

public class Test_2 {
    public static void main(String[] args){
        RectangleClass r1  = new RectangleClass(4,8);
        System.out.println("The Area:"+r1.getArea()+"The P:"+r1.getPerimeter());
        CircleClass c1 = new CircleClass(6);
        System.out.println("The p:"+String.format("%.2f",c1.getPerimeter())+"The Area:"+String.format("%.2f",c1.getArea()));
    }
}
