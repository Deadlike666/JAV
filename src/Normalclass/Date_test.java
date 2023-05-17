package Normalclass;
import java.util.Date;
public class Date_test {
    public static void main(String[] args){
        Date now = new Date();
        Date when  = new Date(101005000500880L);
        boolean b1 = now.before(when);
        boolean b2 = now.after(when);
        Long d1 = now.getTime();
        Long d2 = when.getTime();
        System.out.println("The value of now:"+now+"when:"+when);
        System.out.println("The value of b1"+b1+"The value b2"+b2);
        System.out.println("d1"+d1+"d2"+d2);
    }
}
