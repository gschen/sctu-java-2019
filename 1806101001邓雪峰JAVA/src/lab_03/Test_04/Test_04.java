package lab_03.Test_04;

import java.io.*;

public class Test_04 {
    public static void main(String[] args) {
        File file = new File("E:\\KuGou张韶涵 - 如河.mp3");
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            dataOutputStream = new DataOutputStream(fileOutputStream);

            dataOutputStream.writeUTF("这里是写入字符串数据");
            dataOutputStream.writeInt(123456789);
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
