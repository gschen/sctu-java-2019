package lab_03;

import java.io.*;

public class Test_02 {
    public static void main(String[] args) {
        File file = new File("D:\\");
        file.mkdir();
        File[]f1=file.listFiles();
        for (int i=0;i<f1.length;i++){
           if(f1[i].isDirectory()){
               System.out.println("dirctory is"+f1[i].getName());
           }
           else{
               System.out.println("file is"+f1[i].getName());
           }
        }
    }
}
