package Bank;
import java.util.Date;
public class Test {
    public static void main(String[] args){
        DateAccount count1 = new DateAccount("001","张三",3000,3);
        Credit count2 = new Credit("002","李四",4000,10000);
        count1.getMoney(200);
        count1.getMoney(3000);
        count1.Addmoney(5000);
        count2.getMoney(12000);
        count2.getMoney(20000);
        count2.Addmoney(6000);
        count2.getMoney(20000);
        count1.getID();
    }

}
