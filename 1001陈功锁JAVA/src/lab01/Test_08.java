package lab01;

/**
 * Created by Administrator on 2019-8-30.
 */
public class Test_08 {

    public static void main(String[] args) {


        int row = 0;
        int col = 0;

        for(row = 1; row <= 9; row++){

            for(col = 1; col <= row; col++){

                System.out.print(col+"*"+row+"=" + row*col + " "); //print不换行
            }

            System.out.println(); //pirntln换行
        }
    }
}
