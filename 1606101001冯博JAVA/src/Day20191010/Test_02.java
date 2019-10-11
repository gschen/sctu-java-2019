package Day20191010;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test_02 {

    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(
                    new FileWriter("D:\\demo01.txt")
            );
            writer.write("我在旅院等你！" + "\n" + "你要来吗？");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
