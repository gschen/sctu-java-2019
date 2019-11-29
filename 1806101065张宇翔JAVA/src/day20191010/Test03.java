package day20191010;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
        //字符流读写
        //一次读一个字符
        FileReader reader = null;
        try {
            reader = new FileReader("D:\\demo.txt");
           // int ch = reader.read();

            int ch = 0;
            while(
                    (ch = reader.read()) != -1
            ){
            System.out.println((char)ch);
            }  //强制类型转换

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
