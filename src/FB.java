public class FB {
    public static int Fbnaci(int x){
        if(x==1||x==2) return 1;
        return Fbnaci(x-1)+Fbnaci(x-2);
    }
    public static void main(String[] args){
        int i;
        Test t1 = new Test();
        for(i=1;i<=20;i++){
            System.out.println(i+":"+ t1.Fb2(i));
        }
    }
}
class Test{
    public int Fb2(int x){
        if(x==1||x==2) return 1;
        return Fb2(x-1)+Fb2(x-2);
    }
}
