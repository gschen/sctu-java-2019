package lab_03.Test_04;
//4、	文件拷贝的实现原理通常是通过输入流来读取文件中的数据，通过输出流将数据写入文件。编写一段程序来完成文件拷贝的工作。首先在D盘下创建文件夹source和target，
//        然后在source文件夹中存放“High.mp3”，使用字节输入流读入文件，使用字节输出流写入文件夹target下。


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_04 {
    public static void main(String[] args) {

        FileInputStream fileInputStream =null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\javatxt\\source\\Brika - Moon.mp3");
            fileOutputStream = new FileOutputStream("D:\\javatxt\\target\\High.mp3");
            int i = 0;
            byte[] bytes = new byte[2048];
            while ((i = fileInputStream.read(bytes)) != -1){
                fileOutputStream.write(bytes,0,i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
