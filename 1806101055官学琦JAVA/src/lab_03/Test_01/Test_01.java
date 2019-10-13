package lab_03.Test_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input file path:");
        String path=scanner.next();
        BufferedReader reader=null;
        try {

            reader=new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("over");
        }
    }
}
