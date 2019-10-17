package day20191010;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test02 {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(
                    new FileWriter("D:\\demo.txt")
            );
            writer.write("18信管03—1806101003-桂军");
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
