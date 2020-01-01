package lab_03.Test_02;

import java.io.File;

public class Cd {
    public static void main(String[] args) {
        File file=new File("E:\\");
        for(File temp:file.listFiles()){
            if(temp.isFile()){
                System.out.println(temp.toString());
            }

        }
    }

}
