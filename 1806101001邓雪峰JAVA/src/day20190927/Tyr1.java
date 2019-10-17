package day20190927;

import javax.xml.transform.TransformerException;

public class Tyr1 {
   // int a;

    //void study(){

   // }

    public static void main(String[] args) {
        try {
            for (int i=10;i>=-10;i--){

                System.out.println( 100/i);

            }

        } catch ( Exception e) {
            e.printStackTrace();
            System.out.println("miss");



        }
        finally {
            for (int i = -1; i>=-10;i--){
                System.out.println(100/i);
            }
        }

    }
}
