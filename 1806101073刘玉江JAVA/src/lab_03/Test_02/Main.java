package src.lab_03.Test_02;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("d:\\");
        file.mkdir();
        File[] fi = file.listFiles();
        for (int i = 0; i < fi.length ; i++) {
            if (fi[i].isDirectory()) {
                System.out.println("dirctory is "+fi[i].getName());
            }else {
                System.out.println("file is"+fi[i].getName());
            }
        }

    }
}
