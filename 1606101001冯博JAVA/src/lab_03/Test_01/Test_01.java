package lab_03.Test_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test_01 {
        public static void main(String[] args) {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(
                        new FileReader("D:\\demo.txt")
                );
                String line = null;
                while(
                        (line = reader.readLine()) != null
                ){
                    System.out.println(line);
                }
                System.out.println(line);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
