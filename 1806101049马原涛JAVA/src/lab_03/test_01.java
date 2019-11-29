package lab_03;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) throws IOException {
        String filelocation;
        Scanner sca=new Scanner(System.in);
        System.out.println("请输入文件的绝对地址：");
        filelocation=sca.next();
        BufferedReader reader=new BufferedReader(
                new FileReader(filelocation));
        String line=null;
        while ((line=reader.readLine())!=null)
        {

            System.out.println(line);
        }
    }
}
