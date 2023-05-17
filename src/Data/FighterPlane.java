package Data;

public class FighterPlane implements Iplane {
    private String name;
    public FighterPlane(String name){
        this.name = name;
    }
    public void fly(double speed){
        System.out.println("My name is"+name+"my speed is"+speed);
    }
    public static void main(String[] args){
        Iplane plane  = new FighterPlane("Cf");
    }

}
