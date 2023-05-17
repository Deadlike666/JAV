package bubbleSort;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the num of Array:");
        int Arraynum = sc.nextInt();
        int[] Array =  new int[Arraynum];
        int index;
        for(index=0;index<Array.length;index++){
            System.out.println("Please input the"+(index+1)+"num");
            Array[index] = sc.nextInt();
        }
        System.out.println("Input is over!");
        System.out.println("BubbleSort is running!");
        int temp,j;
        for(index=0;index<Array.length-1;index++){
            for(j=index+1;j<Array.length;j++){
                if(Array[index]>Array[j]){
                    temp = Array[index];
                    Array[index] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        System.out.println("BubbleSort is finishing!");
        for(index = 0;index<Array.length;index++){
            System.out.println(Array[index]);
        }
    }
}
