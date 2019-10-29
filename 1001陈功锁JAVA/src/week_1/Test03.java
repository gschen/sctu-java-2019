package week_1;

import java.io.*;

public class Test03 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
        String s;
        while (true) {
            System.out.print("请输入一个字符串： ");
            System.out.flush();
            s = br.readLine();
            if (s.length() == 0) break;
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}