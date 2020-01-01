package day20191010;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test_02 {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
             writer = new BufferedWriter(
                    new FileWriter("E:\\Java面向对象\\测试.txt")
            );
            writer.write("中文字符");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
