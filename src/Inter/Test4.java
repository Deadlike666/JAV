package Inter;

public class Test4 {
    public double SumArea(Shape[] shapes){
        double sum = 0;
        int i;
        for(i=0;i<shapes.length;i++){
            sum += shapes[i].getArea();
        }
        return sum;
    }
    public static void main(String[] args){
        Shape[] s = new Shape[4];
        s[0] = new Circle(5);
        s[1] = new Circle(8);
        s[2] = new Rectangle(7,8);
        s[3] = new Rectangle(8,8);
        Test4 t = new Test4();
        double ans = t.SumArea(s);
        System.out.print("The sumArea:"+ans);

    }
}
