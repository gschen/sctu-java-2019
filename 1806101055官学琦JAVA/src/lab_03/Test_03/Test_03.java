package lab_03.Test_03;

import java.io.*;

public class Test_03 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\官学琦\\Desktop\\Java实验报告\\1.txt"));
        writer.write("Beijing欢迎你！");
        writer.close();
        System.out.println("完成");
        BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\官学琦\\Desktop\\Java实验报告\\1.txt"));
        String line=null;
        while ((line=reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();
        System.out.println("完成");
        BufferedWriter writer1=new BufferedWriter(new FileWriter("C:\\Users\\官学琦\\Desktop\\Java实验报告\\1.txt"));
        writer1.append("\n我的学号是：你自己的学号");
        writer1.close();
        System.out.println("完成");

    }
}
