package day20191010;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 字符 字节流读写
         */
        //字符流读写TXT文件
        //reader , writer
        //读
        BufferedReader reader = null;
        try {
             reader = new BufferedReader(
                    new FileReader("C:\\demo.txt")
            );
            //String line = reader.readLine();

            String line = null;
            while(
                    (line = reader.readLine()) != null
                    ){
                    System.out.println(line);}


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
            }
        }
    }
}
