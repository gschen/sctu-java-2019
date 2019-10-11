package lab03.test01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test01 {

        public static void main(String[] args) {
            /*
             * 读写文件的两种方式
             * 1， 字符流方式读写
             * 2，字节流方式读写
             * */

            //字节流方式读
            //Reader Writer
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(
                        new FileReader("F:\\demo1.txt")
                );

                String line= null;

                while(
                        (line = reader. readLine()) != null
                ){
                    System.out.println(line);
                }

                reader.readLine();
            } catch (FileNotFoundException e) {  //出错一般用try catch;
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

