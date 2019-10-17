package lab_03.Test_05;

import java.io.*;
import java.util.Scanner;

public class Test_05 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入存入的字符串：");
        String str=scanner.next();
        BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\官学琦\\Desktop\\Java实验报告\\1.txt"));
        writer.write(encryption(str));
        writer.close();
        BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\官学琦\\Desktop\\Java实验报告\\1.txt"));
        String line=null;
        while ((line=reader.readLine())!=null){
            System.out.println(decrypt(line));
        }
        reader.close();
    }
    //加密算法
    public static String encryption(String x){
        char[] a=x.toCharArray();
        for (int i = 0; i <a.length ; i++) {
            a[i]+=1;
        }
        String str=new String(a);
        return str;
    }
    //解密算法
    public static String decrypt(String x){
        char[] a=x.toCharArray();
        for (int i = 0; i <a.length ; i++) {
            a[i]-=1;
        }
        String str=new String(a);
        return str;
    }
}
