package day20191010;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.management.BufferPoolMXBean;

public class Test_01 {
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
