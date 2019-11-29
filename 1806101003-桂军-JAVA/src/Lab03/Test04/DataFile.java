package Lab03.Test04;

import java.io.*;

public class DataFile {
    public static void main(String[] args) {
        File file = new File("D:\\javatest\\平凡之路");
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            dataOutputStream = new DataOutputStream(fileOutputStream);//将文件流包装成数据流

            dataOutputStream.writeUTF("这里是写入字符串数据");//这里是写入字符串数据
            dataOutputStream.writeInt(123456789);//这里写入整数
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataOutputStream!=null){
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
