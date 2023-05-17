package ErrorTest;
import java.io.*;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        File start  = new File("D:\\Person.java");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(start);
            while(fis.available()>0){
                System.out.println((char)fis.read());
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }finally{
            if(fis!=null){
                try {
                    fis.close();//关闭流
                } catch (IOException ex){
                    ex.printStackTrace();
                }
                fis = null;
            }
        }
    }
}
