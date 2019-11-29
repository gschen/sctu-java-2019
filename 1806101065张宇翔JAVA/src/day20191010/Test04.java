package day20191010;

import java.io.FileWriter;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\demo.02.txt");

            writer.write(34);
            writer.write(25);

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
