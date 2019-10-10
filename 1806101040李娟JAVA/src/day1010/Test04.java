package day1010;

import java.io.FileWriter;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) {

        FileWriter writer = null;
        try {
            writer = new FileWriter("F:\\demo4.txt");

            writer.write(64);
            writer.write(64);

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
