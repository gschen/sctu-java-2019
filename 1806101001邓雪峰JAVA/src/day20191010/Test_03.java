package day20191010;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test_03 {
    public static void main(String[] args) {
        //一次读一个字符
        //字符流读写
        //reader 读字符
        //只读一个字符，返回值为ascll码值
        //可应用于exe文件和二进制文件的读
        FileReader reader = null;
        try {
            reader = new FileReader("E:\\MyTry\\test1.txt");

            int ch = reader.read();

            while (
                    (ch = reader.read()) != -1
            ){
                System.out.println((char)ch);
            }

            System.out.println((char)ch);
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
