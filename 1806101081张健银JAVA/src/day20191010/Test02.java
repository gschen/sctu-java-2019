package day20191010;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("D:\\sctu-java-2019\\1806101081张健银JAVA\\src\\day20191010\\hello1.txt"));
            bufferedWriter.write("你好");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
