public class Simpleclass{
    public static void main(String[] args){
        //去掉前导空格和后缀空格
        String str  = new String("   hello world   ");
        String ans = str.trim();//trim方法
        System.out.println("The String after clear:"+ans);
        //String index
        String aim = new String("I am a good cat");
        int aimpoint = aim.indexOf("am");
        System.out.println("The son String'poisition is "+aimpoint);
    }
}