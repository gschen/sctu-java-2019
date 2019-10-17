package day20191010;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//在写过程中相当于新建一个文本，会覆盖之前的文本，需要优先先建立一个新的空白文本
public class Test_02 {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(
                    new FileWriter("E:\\MyTry\\test1.txt")

            );
            writer.write("this is a try!");
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
