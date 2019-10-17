package lab_03.Test_02;

import java.io.File;

public class Test_02 {
    public static void main(String[] args) {
        File f = new File("D:\\fb");
        for(File temp : f.listFiles()) {
            if(temp.isFile()) {
                System.out.println(temp.getName());
            }
        }
    }
}
