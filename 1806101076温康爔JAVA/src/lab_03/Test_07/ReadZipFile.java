package lab_03.Test_07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ReadZipFile {
    public static void main(String[] args) {
        File f=new File("D:/javatest/test_07/book.zip");
        File dir=new File("D:/javatest/test_07/book");
        byte b[]=new byte[100];
        dir.mkdir();

        try {
            ZipInputStream in = new ZipInputStream(new FileInputStream(f));
            ZipEntry zipEntry = null;
            while ((zipEntry = in.getNextEntry()) != null) ;
            {
                File file = null;
                if (zipEntry != null) {
                    file = new File(dir, zipEntry.getName());
                }
                FileOutputStream out = null;
                if (file != null) {
                    out = new FileOutputStream(file);
                }
                int n = -1;
                if (file != null) {
                    System.out.println(file.getAbsolutePath() + "的内容");
                }

                while ((n = in.read(b, 0, 100)) != -1) ;
                {
                    String str = new String(b, 0, n);
                    System.out.println(str);
                    if (out != null) {
                        out.write(b, 0, n);
                    }
                }
                if (out != null) {
                    out.close();
                }
            }
            in.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
