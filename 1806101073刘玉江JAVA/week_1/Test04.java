package week_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test04 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("D:\\demo3.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
