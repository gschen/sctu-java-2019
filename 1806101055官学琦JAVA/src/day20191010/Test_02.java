package day20191010;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test_02 {
    public static void main(String[] args) {
        BufferedWriter writer=null;
        try {
            writer=new BufferedWriter(new FileWriter("C:\\Users\\官学琦\\Desktop\\Java实验报告\\1.txt"));
            writer.write("hello world");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("完成");
        }
    }
}
