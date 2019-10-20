package src.week_1;

import java.io.*;

public class Test01 {
    public static void main(String[] args) {

        BufferedReader reader = null;
        try {
             reader = new BufferedReader(
                    new FileReader("D:\\demo.docx")
            );
            String line = null;
            while (
                    (line = reader.readLine()) != null
                    ){

                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            
        }
    }
}
