package lab_03.Test_03;

import java.io.*;

public class Test_03 {
    public static void main(String[] args) {
        File file = new File("D:\\test.txt");
        FileWriter writer = null;
        try {
            writer = new FileWriter(file,true);
            writer.write("北京欢迎你" + "\n");
            writer.write("我的学号是：" + "1606101001");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //字节流读取
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char ch[] = new char[1024];
            int a;
            while((a = reader.read(ch)) !=-1){
                System.out.println("文件的内容为：" +new String(ch));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
