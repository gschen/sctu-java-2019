package Lab03.Test07;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Test {
    

private static void decompression(String taragetFileName,String parent) {
    try {

        ZipInputStream zin = new ZipInputStream(new FileInputStream(taragetFileName));
        ZipEntry entry = null;
        File file = null;
        while ((entry = zin.getNextEntry())!= null && !entry.isDirectory()){
            file = new File(parent,entry.getName());
            if (!file.exists()){
                new File(file.getParent()).mkdir();//创建此文件的上级目录
            }
            FileOutputStream out = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(out);
            byte[] bytes= new byte[1024];
            int len = -1;
            while ((len= zin.read(bytes))!= -1){
                bos.write(bytes,0,len);
            }
            bos.close();
            System.out.println(file.getAbsoluteFile()+"解压成功");
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

}

    public static void main(String[] args) {
        decompression("F:\\桌面壁纸.zip","F:\\桌面壁纸\\");
    }
}