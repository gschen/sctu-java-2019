package lab_03.Test_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//8、	将文件一和文件二的内容合并成文件三，合并方法是：从文件一读取一个字节放入文件三，再从文件二读取一个字节放入文件三，如此轮流直至某一个文件读完，再将较长文件中的剩余部分读取放入至文件三。
public class Test_08 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileInputStream fileInputStream1 = null;
        FileOutputStream fileOutputStream = null;
        byte[] bytes = new byte[1];
        byte[] bytes1 = new byte[1];
        try {
            fileInputStream = new FileInputStream("D:\\javatxt\\jiami.txt");
            fileInputStream1 = new FileInputStream("D:\\javatxt\\jiami1.txt");
            fileOutputStream = new FileOutputStream("D:\\javatxt\\jiamiall.txt",true);

            while (fileInputStream.read(bytes) != -1){
                fileOutputStream.write(bytes);
                while (fileInputStream1.read(bytes1)!=-1){
                    fileOutputStream.write(bytes1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                fileOutputStream.close();
                fileInputStream.close();
                fileInputStream1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
