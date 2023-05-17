public class Delta {
    private double x,y,z;
    private double C = x+y+z;
    double p = C/2;
    private double A = Math.sqrt(C*(p-x)*(p-y)*(p-z));
    public Delta(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Delta(){};

    public void setX(double x) {
        this.x = x;
    }
    public double getX(){
        return x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getY(){
        return y;
    }
    public void setZ(double z){
        this.z =z;
    }
    public double getZ(){
        return z;
    }
    public double getA(){
        double p = (x+y+z)/2;
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }
    public double getC(){
        return x+y+z;
    }
    public static void main(String[] args){
        Delta D1 = new Delta(3,4,5);
        double Are = D1.getA();
        double Cir = D1.getC();
        System.out.println("The area:"+Are);
        System.out.println("The C:"+Cir);
    }
}
