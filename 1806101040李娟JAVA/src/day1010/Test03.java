package day1010;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {

        // 字符流读写
        //  一次读一个字符
        //运用在二进制文件

        FileReader reader = null;
        try {
             reader = new FileReader("F:\\demo1.txt");

//            int ch = reader.read();

            int ch = 0;

            while(
                    (ch = reader.read()) != -1
            ){
                System.out.print((char)ch);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
