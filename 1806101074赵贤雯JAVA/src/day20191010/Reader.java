package day20191010;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        /*
        * 读写文件有两种方式
        * 1. 字符流读写
        * 2. 字节流读写*/


        // 1. 字符流方式读写txt文件
        // Reader , Writer
        // 1.1 读
        BufferedReader reader = null;
        try {
             reader = new BufferedReader(
                    new FileReader("D:\\demo.txt")
            );
            String line = null;
            while (
                    (line = reader.readLine()) != null
                    ) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            } {}
        }

    }
}
