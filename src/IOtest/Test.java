package IOtest;
import he.Fi;

import java.io.File;
import java.io.InputStream;
public class Test {
    public static void main(String[] args){
        File file1 = new File("D:\\hello.txt");//创建file类
        //File构造方法中的参数可以是相对路径也可以是绝对路径
        //创建目录对象一般使用绝对路径
        File f2 = new File("D:\\demo");
        f2.mkdir();//创建目录对象后如果磁盘上没有这个目录，则调用mkdir创建
        //此目录



    }
}
