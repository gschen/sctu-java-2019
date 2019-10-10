package day1010;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tets05 {
    public static void main(String[] args) {
        //字节流方式读写文件
        //  InputStream
        //  OutputStream

        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("F:\\demo3.txt");

            fileOutputStream.write(64);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
