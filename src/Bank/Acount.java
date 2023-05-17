package Bank;

import java.time.Year;
import java.util.Date;
public class Acount {
    private String username;
    private String ID;
    private Date makedate;
    private double money;
    public void getID(){
        System.out.println(this.ID);
    }
    public Date getmakedate(){
        return this.makedate;
    }
    public double letMoney(){
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    public void Disply(){
        System.out.println(this.username+"The money:"+this.money);
    }
    public void Addmoney(double money){
        this.money += money;
        System.out.println("Add Successfully");
    }
    public void getMoney(double money){
        if(this.money>=money){
            this.money -= money;
            System.out.println("Get money success!");
        }
    }
    public void ChangeMoney(double money,Acount another){
        if(this.money<money){
            System.out.println("Failed to change money,Not enough money!");
        }
        else{
            this.getMoney(money);
            another.Addmoney(money);
            System.out.println("Change Successfully!");
        }
    }
    public Acount(String ID,String username,double money){
        this.ID  = ID;
        this.username = username;
        this.money = money;
        this.makedate = new Date();
    }
}
class DateAccount extends Acount{
    private int storagetime;
    public DateAccount(String ID,String username,double money,int storagetime){
        super(ID,username,money);
        this.storagetime = storagetime;
    }
    public void Addmoney(double money){
        System.out.println("Add Failed!");
    }
    public void ChangeMoney(){
        System.out.println("you can't do it");
    }
    public void getMoney(double money) {
        Date now = new Date();
        long periodyear = (now.getTime() - this.getmakedate().getTime())/1000/3600/24/365;
        if(periodyear>=storagetime){
            System.out.println("Get Money success!");
            setMoney(0);
        }
        else {
            System.out.println("Time is not come!can't getmoney!");
        }
    }

}
class Credit extends Acount{
    public double debtmoney;
    public Credit(String ID,String username,double money,double debtmoney){
        super(ID,username,money);
        this.debtmoney = debtmoney;
    }
    public void getMoney(double money) {
        if(money<=this.letMoney()){
            this.Addmoney(-money);
            System.out.println("get successfully!");
        }
        else if(money>this.letMoney()&&money<=this.letMoney()+this.debtmoney){
            System.out.println("get successfully!");
            this.debtmoney -= (money-this.letMoney());
            this.setMoney(0);
        }
        else if(money>this.letMoney()+this.debtmoney){
           // System.out.println("your debt has gone!");
            System.out.println("get Failed!");
        }
    }
}