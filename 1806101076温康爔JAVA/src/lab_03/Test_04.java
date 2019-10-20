package lab_03;

import java.io.*;

public class Test_04 {
    public static void main(String[] args){
        copyFile("D:/javatest/test_04/source/high.txt","D:/javatest/test_04/target/high.txt");
    }
    public static void copyFile(File src,File dest){
        //1.选择流
        InputStream  is=null;
        OutputStream os=null;
        try {
            is=new FileInputStream(src);
            os=new FileOutputStream(dest);
            //2.准备卡车
            byte[] car=new byte[1024];
            //3.读入写出
            int len=-1;  //读入到小卡车中数据的个数
            while((len=is.read(car))!=-1){
                os.write(car,0,len);
            }
            //4.刷出
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //5.关闭   先打开的后关闭
            try {
                //多行添加try..catch=>alt+shift+z
                if(os!=null){
                    os.close();
                }
                if(is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //封装好的复制文件方法
    public static void copyFile(String srcPath,String destPath){ //开始路径 目标路径
        //1.创建源
        File src = new File(srcPath);
        File dest = new File(destPath);
        //2.选择流
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            //3.操作★★★
            byte[] flush = new byte[1024];//缓冲容器
            int len = -1;
            if ((len=is.read(flush))!=-1) {
                os.write(flush, 0, len);

            }
            os.flush();//刷出
        } catch (Exception e) {

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
    }
}
