package lab_03;

import java.io.*;
import java.util.Scanner;

public class test_05 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);System.out.println("请输入字符串：");String str=scanner.next();
        BufferedWriter writer=new BufferedWriter(new FileWriter("F:\\dev\\sctu-java-2019\\1806101049马原涛JAVA\\src\\20191010\\demo.txt"));
        writer.write(encryption(str));writer.close();
        BufferedReader reader=new BufferedReader(new FileReader("F:\\dev\\sctu-java-2019\\1806101049马原涛JAVA\\src\\20191010\\demo.txt"));
        String line=null;
        while ((line=reader.readLine())!=null){
            System.out.println(decrypt(line));
        }reader.close();
    }

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
