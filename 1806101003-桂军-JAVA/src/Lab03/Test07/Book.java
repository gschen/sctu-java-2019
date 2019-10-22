package Lab03.Test07;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Book {
    public static void main(String[] temp) {
        ZipInputStream zin;//创建ZipInputStream对象
        try {
            zin = new ZipInputStream(new FileInputStream("F:\\桌面壁纸.zip"));

            ZipEntry entry = zin.getNextEntry();//获取下一个ZipEntry
            while (((entry = zin.getNextEntry()) != null)//获取文件目录
            && !entry.isDirectory()){
                //如果entry不为空，并不在同一目录下
                File file = new File("F:\\桌面壁纸"+entry.getName());//获取文件目录
                System.out.println(file);
                if (!file.exists()){//如果文件夹不存在
                    file.mkdirs();//创建文件所在文件夹
                    file.createNewFile();//创建文件
                   /* OutputStream os = new FileOutputStream(String.valueOf(tmp));
                    InputStream in = ZipFile.*/
                }
                zin.closeEntry();//关闭当前entry
                System.out.println(entry.getName()+"解压成功");

            }
            zin.close();//关闭流
            //实例化对象，指明要进行解压的文件
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
