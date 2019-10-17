package day20191010;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
        FileReader reader = null;
        //字符流读写
        //一次读写一个字符
        try {
            reader = new FileReader("D:\\demo.txt");
            int ch = 0;
            while (
                    (ch = reader.read()) != -1
            ) {
                System.out.println((char)ch);
            }

           /* int ch = reader.read();
            System.out.println(ch);*/
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
