package day20191010;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test01 {

    //字符流读写
    public static void main(String[] args) {



    BufferedReader reader;

    {
        reader = null;
        try {
            reader = new BufferedReader(
                        new FileReader("D:\\test.txt")
                );

            String line=null;
            while(
                    (line=reader.readLine())!=null
            ){
                System.out.println(line);
            }


            reader.readLine();
            /*String line=reader.readLine();
            System.out.println(line);*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件
            try{
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
}