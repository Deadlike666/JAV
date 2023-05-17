import java.util.Scanner;
public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] value=new int[count];
        int sum=0;
        int i;
        System.out.println("Please input the Array:");
        for( i=0;i<value.length;i++) {
            value[i]=sc.nextInt();
            sum=sum+value[i];
        }
        double average=sum/count;
        System.out.println("SUM:"+sum);
        System.out.println("AVERAGE"+average);
        System.out.println("The num bigger than aver:");
        int cnt = 0;
        for(i=0;i<value.length;i++){
            if(value[i]>average) {
                cnt++;
                System.out.println(value[i]);
            }
        }
        System.out.println("total num that bigger than average:"+cnt);
    }
}