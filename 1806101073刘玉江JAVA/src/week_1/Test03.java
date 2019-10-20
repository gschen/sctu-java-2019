package src.week_1;

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
            int ch = reader.read();
            System.out.println((char) ch);
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
