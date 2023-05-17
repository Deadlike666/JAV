package ErrorTest;
import java.io.*;
public class BufferTest {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream input = new FileInputStream("D:\\1.txt");
        BufferedInputStream bis = null;
        bis  = new BufferedInputStream(input,1024);
    }
}