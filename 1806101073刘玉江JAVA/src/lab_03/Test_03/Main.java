package src.lab_03.Test_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream out = null;
        byte[] b = "Beijing欢迎你".getBytes();
        try {
            out = new FileOutputStream("d:\\temp.txt");
            out.write(b);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
