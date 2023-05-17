package Normalclass;
import java.util.Date;
import java.util.Calendar;
public class Calender_Test{
    public static void main(String[] args){
        System.out.println("Calendar Test:");
        Calendar c1 = Calendar.getInstance();
        c1.setTime(new Date());
        System.out.println(c1.getTime());
        System.out.println("month:"+c1.get(Calendar.MONTH)+1);
        System.out.println("year:"+c1.get(Calendar.YEAR));
    }

}