package day20191010;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Test_01 {
    public static void main(String[] args) throws IOException {
        /*
        读写文件有两种方式
        1.字符流读写
        2.字节流读写
         */

        //字符流读写txt文件Reader、writer
        BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\官学琦\\Desktop\\txt文档\\HK解压密码.txt"));
        String line=null;
        while ((line=reader.readLine())!=null){
            System.out.println(line);
        }

        reader.close();
    }
}
