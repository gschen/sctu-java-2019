package lab_03.Test_02;

import java.io.File;

public class Test_02 {
    public static void main(String[] args) {
        File f =new File("F:\\MyTry");
        File fs[] = f.listFiles();
        for (int i= 0;i<fs.length;i++){
            if (fs[i].isFile()){
                System.out.println(fs[i].getName());
            }
            else {
                System.out.println("<package>"+fs[i].getName());
            }
        }
    }
}
