package FileStream;
import java.io.*;
public class InputDemo {
    public static void main(String[] args){
        File start = new File("D:\\Person.java");
        FileInputStream fis  = null;
        try{
            fis = new FileInputStream(start);
            while(fis.available() > 0){
                System.out.println((char)fis.read());
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        } finally{
            if(fis != null){
                try{
                    fis.close();
                } catch (IOException ex){
                    ex.printStackTrace();
                }
                fis = null;
            }
        }
    }
}
