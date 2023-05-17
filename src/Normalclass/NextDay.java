package Normalclass;
import java.util.Scanner;
import java.util.Calendar;
public class NextDay {
    public static String nextDate(int year,int month,int day){
        boolean isleap = false;
        int dnum  = 31;
        if(year%400==0||(year%4!=0&&year%100==0)) isleap = true;
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                dnum = 30;
                break;
            case 2:
                if(isleap) dnum = 29;
                else dnum = 28;
                break;
        }
        if(day!=dnum){
            day++;
        }else {
            if(month==12){
                month = 1;
                day = 1;
                year++;
            }
            else{
                month++;
                day = 1;
            }
        }
        return year+"-"+month+"-"+day;
    }
    public static void main(String[] args){
        int y,m,d;
        System.out.println("Input the date:");
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String ymd[] = date.split("-");
        y = Integer.parseInt(ymd[0]);
        m = Integer.parseInt(ymd[1]);
        d = Integer.parseInt(ymd[2]);
        String day = nextDate(y,m,d);
        System.out.println("The next day:"+day);
    }
}
