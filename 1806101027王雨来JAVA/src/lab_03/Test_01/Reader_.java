package lab_03.Test_01;
//1、	编程实现读取并输出指定文件的内容，文件名由命令行给出且为绝对路径名。

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader_ {
    public static void main(String[] args) {
        BufferedReader reader = null;{
            try {
                reader = new BufferedReader(
                        new FileReader("E:\\Java面向对象\\测试.txt")
                );

                String line;
                while ((line = reader.readLine()) != null){
                    System.out.println(line);
                }
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
}

