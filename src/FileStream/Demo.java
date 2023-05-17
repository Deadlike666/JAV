package FileStream;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String args[]) throws IOException {
        File f1 = new File("D:\\end.bat");
        File f2 = new File("hello.txt");
        File dir = new File("D:\\DIR\\dir");
         boolean ans =   dir.mkdir();
     if(ans) {
         System.out.println("Yes");
     }
        f1.createNewFile();
        f2.createNewFile();
        String f1path = f1.getPath();
        System.out.println("The file:"+f1path);
        System.out.println("F1:"+f1.exists());
        f1.delete();
        System.out.println("F1:"+f1.getAbsolutePath()+"Last Modified"+f1.lastModified());
        System.out.println("F1:"+f1.exists());
    }
}
