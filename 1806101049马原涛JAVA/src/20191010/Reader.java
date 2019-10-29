import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(
                new FileReader("F:\\dev\\sctu-java-2019\\1806101049马原涛JAVA\\src\\20191010\\demo.txt"));
        String line=null;
        while ((line=reader.readLine())!=null)
        {

            System.out.println(line);
        }
    }



    }

