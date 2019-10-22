package lab_03;

import java.io.*;

public class test_03 {
    public static void main(String[] args) {
        File file = new File("F:\\dev\\sctu-java-2019\\1806101049马原涛JAVA\\src\\20191010\\demo.txt");

        FileWriter fileWriter = null;
        FileReader fileReader = null;
        //文件的写入（输出流）
        try {
            fileWriter = new FileWriter(file,true);//ture在原文件下追加

            String string = "我的学号是：1806101049";
            fileWriter.write(string);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileWriter != null ){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //文件的读取（输入流）
        try {
            fileReader = new FileReader(file);
            char ch[] = new char[1024];//缓冲区
            int count;//已经读出的字符数
            while ((count = fileReader.read(ch)) !=-1){//循环读取文件中的数据，直到所有字符都读完
                System.out.println("文件中的内容为："+new String(ch));

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
