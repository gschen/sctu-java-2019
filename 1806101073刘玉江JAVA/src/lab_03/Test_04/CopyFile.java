package src.lab_03.Test_04;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        copyFile("D:\\source\\123.txt","D:\\target\\456.txt");
    }
    public static void copyFile(File src, File dest)  {
        //1选择流
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            //2准备卡车
            byte[] car = new byte[1024];
            //3读入写入
            int len = -1;
            while ((len = is.read(car))!=-1){
                os.write(car,0,len);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (os!=null){
                    os.close();
                }
                if (is!=null){
                    is.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void copyFile(String srcPath,String destPath) throws IOException {
        File src = new File(srcPath);
        File dest = new File(destPath);
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            byte[] flush = new byte[1024];
            int len = -1;
            if ((len=is.read(flush))!=-1){
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            //4.关闭流
            if (os!=null) {
                try {
                    os.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
            if (is!=null) {
                try {
                    is.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }

            }
    }
}}
