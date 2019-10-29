package lab_03.Test_07;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

//7、	读取book.zip,并将book.zip中含有的文件重新存放到当前目录中的book文件夹中，即将book.zip的内容解压到book文件夹中。
public class Test_07 {
    public static void main(String[] args) {
        ZipInputStream zipInputStream = null;
        byte[] bytes;
        try {
            zipInputStream = new ZipInputStream(new FileInputStream("D:\\javatxt\\book.zip"));
            ZipEntry zipEntry =null;
            while ((zipEntry = zipInputStream.getNextEntry()) != null){
                if(zipEntry.isDirectory()){
                    File file = new File("D:\\javatxt\\book.zip"+zipEntry.getName());
                    if(!file.exists()){
                        file.mkdirs();
                    }
                }else {
                    String str = new String("D:\\javatxt\\book.zip"+zipEntry.getName());
                    FileOutputStream fileOutputStream = new FileOutputStream(str);
                    bytes= new byte[1024];
                    int n;
                    while ((n = zipInputStream.read(bytes,0,1024)) != -1){
                        fileOutputStream.write(bytes,0,n);
                    }
                    fileOutputStream.close();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                zipInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
