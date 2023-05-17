package Inter;

public class ChInestAirboat implements IAirBoat{
    private String name;
    public ChInestAirboat(String name){
        this.name = name;
    }
    public void fly(double speed){
        System.out.println("Flying in"+speed);
    }

    @Override
    public void sail(double speed) {
        System.out.println("Sailing in"+speed);
    }
    public static void main(String[] args){
        IAirBoat A1  = new ChInestAirboat("NiTian");
        A1.sail(556);
        A1.fly(778);
    }
}
