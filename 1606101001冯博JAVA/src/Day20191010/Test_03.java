package Day20191010;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;

public class Test_03 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("D:\\demo.txt");

            int ch = reader.read();
            System.out.println(ch);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
