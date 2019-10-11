package lab_03.Test_02;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_02 {

    private static int nextLevel = 0;
    public static void listFilesByDir(File file){

        if(file.isFile() || file.listFiles() == null || file.listFiles().length < 1){
            return;
        }else{
            File[] files = file.listFiles();
            files = sortFile(files);
            for(File f : files){
                System.out.print(getSeperator(nextLevel));
                System.out.print(f.getName());
                if(f.isDirectory()){
                    System.out.print("（文件夹）");
                }
                System.out.println("");

                if(f.isDirectory()){
                    nextLevel++;
                    listFilesByDir(f);
                    nextLevel--;
                }
            }
        }
    }

    public static String getSeperator(int nextLevel){
        StringBuffer buffer = new StringBuffer();
        for(int i=0; i<nextLevel; i++){
            buffer.append("——").append(" ");
        }
        return buffer.toString();
    }

    public static File[] sortFile(File[] files){
        List<File> list = new ArrayList<File>();
        for (File file : files) {
            if(file.isDirectory()){
                list.add(file);
            }
        }
        for (File file : files) {
            if(file.isFile()){
                list.add(file);
            }
        }
        return list.toArray(new File[list.size()]);
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String path=scanner.next();
        System.out.println("请输入文件路径：");
        File file = new File(path);
        listFilesByDir(file);
    }






}
