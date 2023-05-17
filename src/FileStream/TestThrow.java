package FileStream;
public class TestThrow {
    public static int divide(int a,int b) throws Exception{
        if(b==0) throw  new Exception("divisdor is 0");
        int c = 0;
        c = a/b;
        return c;
    }
    public static void main(String[] args){
        int a = 3,b = 0,c = 0;
        try{
            c=  divide(a,b);
        } catch (Exception e){
            System.out.println("Error!"+e.getMessage());
        }
        System.out.println("c:"+c);
    }
}
