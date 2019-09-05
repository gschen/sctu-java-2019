package week_1;
//打印乘法表
public class Test_2_10 {
    public static void main(String[] args) {
        int row = 0;
        int col = 0;

        for (row = 1; row <= 9; row++){

            for (col = 1; col <= row; col++){
                System.out.print(col+"*"+ row+"="+row*col+ " ");
            }
            System.out.println();
        }
    }
}
