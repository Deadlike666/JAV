public class sanjiaox{
    private double x;
    private double y;
    private double z;
    double zhou;
    double are;
    public sanjiaox(double x,double y,double z)
    {
        this.x=x;
        this.y=y;
        this.z=z;

    }

    public double getx()
    {
        return x;
    }
    public void setx(double x)
    {
        this.x=x;
    }
    public double gety()
    {
        return y;
    }
    public void sety(double y)
    {
        this.y=y;
    }
    public double getz()
    {
        return z;
    }
    public void setz(double z)
    {
        this.z=z;
    }
    public void getzhou()
    {
        zhou=x+y+z;
        System.out.println(zhou);
    }
    public void getare()
    {
        double q=Math.pow(x, 2)+Math.pow(y,2)+Math.pow(z, 2);
        are=Math.sqrt(q);
        System.out.print(q);
    }
    public static void main(String[] args)
    {
        sanjiaox zhouare=new sanjiaox(3.0,4.0,5.0);
        zhouare.getzhou();
        zhouare.getare();
    }
}