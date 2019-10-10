package day20191010;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {


    public static void main(String[] args) {

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(
                    new FileWriter("D:\\demo01.txt")
            );

            writer.write("hello, Java!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
