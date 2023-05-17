import java.util.Scanner;
public class twoArray {
    public static void main(String[] args){
        int[][] A = new int[3][];
        A[0] = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<A[0].length;i++){
            A[0][i] = sc.nextInt();
        }

    }
}
