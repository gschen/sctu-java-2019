package lab_03.Test_04;

import java.io.*;

public class Test_04 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\官学琦\\Desktop\\Java实验报告\\1.txt"));
        writer.write("High.mp3");
        writer.close();
        BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\官学琦\\Desktop\\Java实验报告\\1.txt"));
        String line=null;
        BufferedWriter writer1=new BufferedWriter(new FileWriter("C:\\Users\\官学琦\\Desktop\\Java实验报告\\2.txt"));
        while ((line=reader.readLine())!=null){
            writer1.write(line);
        }
        writer1.close();
        reader.close();
        System.out.println("拷贝完成");
    }
}
