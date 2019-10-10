import java.rmi.server.ExportException;

public class test_3 {
    static void work(int i){
        System.out.println(i);
        if (i == 30) {
            try {
                System.out.println(i/0);

            }catch (Exception e){
                System.out.println(e.toString());
            }finally {

            }

        }
    };

    public static void main(String[] args) {
        for (int i = 0; i <50 ; i++) {
            work(i);
        }
    }
}
