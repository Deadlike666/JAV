package FileStream;
import he.Fi;

import java.io.*;
public class imagcopy {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Hello.jpg");
        FileInputStream fin  = new FileInputStream(file);
        FileOutputStream fou = new FileOutputStream(new File("D:\\Again.jpg"));
        int num = 0;
        if(!file.exists()){
            System.out.println("File not exist!");
        } else{
            while((num = fin.read())!=-1){
                fou.write(num+9999999);
            }
            fou.flush();
            fin.close();
            fou.close();
        }
        System.out.println("Copy over!");
      //  FileInputStream finput = new FileInputStream(new File("D:\\Again.jpg"));

    }
}
