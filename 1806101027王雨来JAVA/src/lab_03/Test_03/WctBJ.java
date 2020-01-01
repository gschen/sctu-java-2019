package lab_03.Test_03;
import java.io.*;

/*3、	在某目录下创建一个文本文件test.txt，通过字节输出流向文件中写入“Beijing欢迎你！”，
通过字节输入流读出文件中的内容并显示；如果在已有文件中再追加“我的学号是：你自己的学号”如何实现？*/
public class WctBJ {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        byte bytes[] = "Beijing欢迎你！".getBytes();
        byte bytes2[] = "我的学号是：1806101027".getBytes();
        try {
            fileOutputStream = new FileOutputStream("D:\\dev\\sctu-java-2019.git" +
                    "\\1806101027王雨来JAVA\\src\\lab_03\\test03.txt");

            fileOutputStream.write(bytes);
            fileOutputStream.write(bytes2);

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
        
        String line = null;

        BufferedReader reader = null;{
            try {
                reader = new BufferedReader(
                        new FileReader("D:\\dev\\sctu-java-2019.git" +
                                "\\1806101027王雨来JAVA\\src\\lab_03\\test03.txt")
                );

                
                while ((line = reader.readLine()) != null){
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {

                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}