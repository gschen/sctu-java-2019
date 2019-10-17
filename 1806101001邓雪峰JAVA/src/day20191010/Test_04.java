package day20191010;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test_04 {
    public static void main(String[] args) throws FileNotFoundException {
        FileWriter writer = null;

        try {
            writer = new FileWriter("E:\\MyTry\\test1.txt");
            writer.write(64);
            writer.write(65);
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
