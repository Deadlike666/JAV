package Dateclass;
import java.util.Date;
public class Testdate {
    //Date class provide many method to change date
    //The Date class make up method:
    public static void main(String[] args){
        Date date = new Date();
        System.out.println("Now time:"+date.getTime());
        Date date2 = new Date(1234545);
        System.out.println("The sec date:"+date2.getTime());//
        date.setTime(4545545);
        System.out.println(date.after(date2));

    }
}
