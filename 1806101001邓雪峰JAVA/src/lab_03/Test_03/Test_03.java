package lab_03.Test_03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test_03 {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(
                    new FileWriter("F:\\MyTry\\javatry\\test.txt")
            );

            writer.write("Beijing欢迎你！");
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
