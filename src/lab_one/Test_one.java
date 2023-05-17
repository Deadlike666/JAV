package lab_one;

public class Test_one {
    public static void main(String[] args){
        Circle circle = new Circle(4);//设置圆的半径为四
        System.out.println(String.format("The p:%.2f The Area:%.2f",circle.getPerimeter(),circle.getArea()));
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(String.format("The p:%.2f The Area:%.2f",rectangle.getPerimeter(),rectangle.getArea()));
    }
}
