package Inter;

import org.w3c.dom.css.Rect;

public class Test3 {
    public double SumCircle(Circle[] Cirlcles){
        double sum = 0;
        int i;
        for(i=0;i<Cirlcles.length;i++){
            sum += Cirlcles[i].getArea();
        }
        return sum;
    }
    public double SumRenctangle(Rectangle[] Rec){
        double sum  = 0;
        int i;
        for(i=0;i<Rec.length;i++){
            sum += Rec[i].getArea();
        }
        return sum;
    }
    public static void main(String[] args){
        Circle[] c = new Circle[2];
        c[1] = new Circle(5);
        c[0] = new Circle(8);
        Rectangle[] R = new Rectangle[2];
        R[0] = new Rectangle(5,6);
        R[1] = new Rectangle(7,9);
        Test3 t1 = new Test3();
        double sum1 = t1.SumCircle(c);
        System.out.println("The sumCircle:"+sum1);
        double sum2 = t1.SumRenctangle(R);
        System.out.println("The sumRectangle:"+sum2);
    }
}
