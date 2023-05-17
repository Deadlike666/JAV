package FileStream;
import java.io.File;
import java.util.Date;
public class Test3 {
    public static void main(String[] args){
        File dir = new File("D:\\try");
        System.out.println("exist?:"+dir.exists());
        System.out.println("dir?:"+dir.isDirectory());
        String[] fs = dir.list();
        for(int i=0;i<fs.length;i++){
            System.out.println("filename:"+fs[i]);
            File f1 = new File("D:\\try\\"+fs[i]);
            System.out.println("Name:"+f1.getName());
            System.out.println("LastModified:"+new Date(f1.lastModified()));
            System.out.println("file length:"+f1.length());
            f1.delete();
        }
    }
}
