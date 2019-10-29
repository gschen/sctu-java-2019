package lab_03;

import java.io.File;
import java.util.Scanner;

public class test_02 {
    public static void main(String[] args) {
        getFileName();
    }

    public static void getFileName() {
        String filelocation;
        Scanner sca=new Scanner(System.in);
        System.out.println("请输入文件的绝对地址：");
        filelocation=sca.next();// 路径
        File f = new File(filelocation);
        if (!f.exists()) {
            System.out.println(filelocation + " not exists");
            return;
        }

        File fa[] = f.listFiles();
        for (int i = 0; i < fa.length; i++) {
            File fs = fa[i];
            if (fs.isDirectory()) {
                System.out.println(fs.getName() + " [目录]");
            } else {
                System.out.println(fs.getName());
            }
        }
    }



}
