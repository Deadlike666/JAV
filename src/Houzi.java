import java.util.Scanner;
public class Houzi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//天数
        int a = Zongshu(n);
        System.out.print(a);
    }

    public static int Zongshu(int y) {
        int sum = 1;
        if (y == 1) {
            sum = 1;
            return sum;
        } else {
            for (int i = 0; i < y; i++) {
                sum = (sum + 1) * 2;
                return sum;
            }
        }
        return -1;
    }
}