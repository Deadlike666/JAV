package Bank;

import java.util.Date;

public class AccountManager {
    public static void main(String[] args){
        Acount acount1 = new Acount("001","张三",1000);
        Acount acount2 = new Acount("002","李四",300);
        acount1.Addmoney(500);
        acount2.Addmoney(500);
        acount1.getMoney(200);//张三取出200
        acount1.ChangeMoney(300,acount2);//张三转给李四300
        acount1.Disply();
        acount2.Disply();
    }
}
