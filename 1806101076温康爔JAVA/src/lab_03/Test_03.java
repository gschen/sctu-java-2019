package lab_03;

import  java.io.*;

public class Test_03 {
    public static void main(String[] args) {
        int a;byte[] b="Beijing欢迎你！".getBytes();
            try {
            FileOutputStream out= new FileOutputStream("D:\\javatest\\test_03.txt");
            out.write(b);
            out.close();
        } catch (IOException e) {
                System.out.println("error"+e);
        }
    }
}

