package lab_03.Test_05;

import java.io.*;
import java.util.Scanner;

//5、	将字符串加密后，通过字符输出流写入文件，然后读取该文件并解密。加密算法为：将原有字符的 ASCII码加1，
//        如'A'字符的 ASCII 码为65，加密后其 ASCII 码变成66。"	Hello"加密后的字符串为"Ifmmp"。
public class Test_05 {
    public static void main(String[] args) {
        Test_05 t = new Test_05();
        t.write();
        t.readAndzhuanMi();
    }




    public StringBuffer goOn(){
        StringBuffer sb = new StringBuffer();
        Scanner s = new Scanner(System.in);
        System.out.println("输入字符串");
        String s1 = s.next();
        char[] c = s1.toCharArray();
        for (int i = 0; i < c.length ; i++) {
            sb.append((char)((Integer.valueOf(c[i]).intValue()) + 1));
        }
        return sb;
    }

    public void write(){
        Test_05 t1 = new Test_05();
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("D:\\javatxt\\jiami.txt"));
            char[] chars;
            chars = (t1.goOn().toString()).toCharArray();
            bufferedWriter.write(chars);
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

    public void readAndzhuanMi(){
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("D:\\javatxt\\jiami.txt"));
            String str = bufferedReader.readLine();
            System.out.println("加密后："+str);
            StringBuffer s2 = new StringBuffer();
            char[] chars1 = str.toCharArray();
            for (int i = 0; i < chars1.length ; i++) {
                s2.append((char)(Integer.valueOf(chars1[i]).intValue() - 1));
            };
            System.out.println("转密后："+s2.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
