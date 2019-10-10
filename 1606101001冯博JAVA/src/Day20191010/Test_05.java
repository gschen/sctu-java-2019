package Day20191010;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_05 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("D:\\demo.txt");
            fileOutputStream.write(10);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
