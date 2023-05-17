import java.util.Scanner;
public class STR {
    public static void main(String[] args) {
       // char[] str = new char[10];
        int i;
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        System.out.println("The str length:"+str.length());
        for(i=0;i<str.length();i++){
            System.out.println("The element in the index:"+i);
            System.out.println(str.charAt(i));
        }
        System.out.print(str);
        char[] S = new char[12];
        System.out.println("Please input a String that length is 12:");
        for(i=0;i<5;i++){
            S[i] = sc.next().charAt(0);
        }
        System.out.println("Input over!");
        for(i=0;i<5;i++){
            System.out.println(S[i]);
        }
        System.out.println(S.length);
    }
}
