package Array;
import java.util.Scanner;
public class Array {
    public static  void main(String args[]){
        int[] arr = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The input is over !");
        for(i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
