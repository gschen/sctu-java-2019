package day20191010;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test_03 {
    public static void main(String[] args) {
        FileReader reader=null;
        try {
            reader=new FileReader("C:\\Users\\官学琦\\Desktop\\Java实验报告\\1.txt");
            int ch=reader.read();
            System.out.println(ch);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("完成");
        }
    }
}
