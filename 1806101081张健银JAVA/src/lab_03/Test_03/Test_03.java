package lab_03.Test_03;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//3、	在某目录下创建一个文本文件test.txt，通过字节输出流向文件中写入“Beijing欢迎你！”，通过字节输入流读出文件中的内容并显示；如果在已有文件中再追加“我的学号是：你自己的学号”如何实现
public class Test_03 {
    public static void main(String[] args) {
        //FileOutputStream拥有三个构造函数，其中一个的boolean append属性true为在原有基础上写入否则覆盖
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("D:\\javatxt\\hello1.txt",true);
            String s = "Beijing欢迎你！";
            byte[] bytes = s.getBytes();
            fileOutputStream.write(bytes);
            String s1 = "我的学号是：1806101081";
            byte[] bytess = s1.getBytes();
            fileOutputStream.write(bytess);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
