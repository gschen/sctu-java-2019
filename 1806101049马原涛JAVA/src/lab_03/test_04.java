package lab_03;

import java.io.*;

public class test_04 {
    public static void main(String[] args) {
        File file = new File("F:\\dev\\sctu-java-2019\\1806101049马原涛JAVA\\src\\20191010\\demo.txt");
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            dataOutputStream = new DataOutputStream(fileOutputStream);

            dataOutputStream.writeUTF("写入字符串");
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
