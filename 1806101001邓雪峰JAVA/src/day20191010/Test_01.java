package day20191010;

import java.io.*;

public interface Test_01 {




    public static void main(String[] args) {
        /*
        * 读写文件有两种方式
        * 1.字符流的读写
        * 2.字节流读写
        * */

        //字符流的读写TXE文件
        //read ,write
        //1.1读
        BufferedReader reader = null;
        try {
         reader = new BufferedReader(
                new FileReader("E:\\MyTry\\test1.txt")
        );
         //读取单行
         //String line = reader.readLine();
         //System.out.println(line);

            //读取整个文件
         String line = null;
         while (
                 (line = reader.readLine()) !=null){
             System.out.println(line);
         }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
