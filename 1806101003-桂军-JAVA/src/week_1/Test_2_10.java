package src.week_1;

public class Test_2_10 {
    public static void main(String[] args) {
        Test_2_10.lab01_chengfa();
    }

        static void lab01_chengfa(){
            for (int i = 1; i < 10; i++){
                for (int j = 1; j <= i; j++){
                    System.out.printf("%d*%d =%2d  ", i, j, i*j); //%2d表示i*j的结果占2个格
                }
                System.out.println();

            }
 }
}
