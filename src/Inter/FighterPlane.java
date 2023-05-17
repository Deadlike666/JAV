package Inter;

public class FighterPlane implements IPlane{
    private String name;
    public FighterPlane(String name){
        this.name = name;
    }

    @Override
    public void fly(double speed) {
        System.out.println("Flying in:"+speed);
    }
    public static void main(String[] args){
        IPlane p1 = new FighterPlane("Fighter1");
        p1.fly(444);
    }
}
