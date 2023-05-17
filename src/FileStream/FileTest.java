package FileStream;
import he.Fi;

import java.io.File;
import java.util.Date;
public class FileTest {
    public static void main(String[] args){
        int dirnum = 0,filenum = 0;
        File file = new File("D:\\auto.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            }catch (Exception ex){
                System.out.println("Error!");
            }
        }
        System.out.println("The file exist?:"+file.exists());
        System.out.println("The name:"+file.getName()+"The Path:"+file.getAbsolutePath());
        System.out.println("File?:"+file.isFile()+"DIR?"+file.isDirectory());
        File directory = new File("D:\\NewTest\\hello\\1");
        System.out.println(directory.mkdirs());
        String[] str = directory.list();
        for(int i = 0;i<str.length;i++){
            System.out.println(str[i]);
        }
        File[] fs = directory.listFiles();
        for(int i=0;i<fs.length;i++){
            System.out.println(fs[i]);
            System.out.println(fs[i].getName());
            System.out.println(new Date(fs[i].lastModified()));
            if(fs[i].isDirectory()){
                dirnum++;
                System.out.println("<DIR>\t");
            } else{
                filenum++;
                System.out.println("The filelength:"+fs[i].length()+'\t');
            }
        }
        file.delete();
    }
}
