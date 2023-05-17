package Dateclass;

import java.util.Calendar;
import java.util.Date;

public class TestCalender {
    public static void main(String[] args){
        //Calendar is a abstract class
        //Use getInstance to creat a object of Calendar
        Calendar date = Calendar.getInstance();
        date.setTime(new Date());
        System.out.println("Now time :"+date

        );
    }
}
