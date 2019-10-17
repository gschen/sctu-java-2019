package src.lab_03.Test_01;
import java.io.*;
public class reader {
    public static void main(String[] args) throws IOException {
        StringBuffer strBuf = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("d:\\demo3.txt"), "UTF-8"));
        int tempchar;
        while ((tempchar = bufferedReader.read()) != -1) {
            strBuf.append((char) tempchar);
        }
        bufferedReader.close();
        System.out.println(strBuf);
    }
}
