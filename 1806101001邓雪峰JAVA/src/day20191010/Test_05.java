package day20191010;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_05 {
    public static void main(String[] args) {
        //字节流方式读文件
        //InputStream
        //OutputStream

        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("E:\\MyTry\\test1.txt");
            fileOutputStream.write(64);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
