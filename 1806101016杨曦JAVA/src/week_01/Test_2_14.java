package week_01;

public class Test_2_14 {
    public static void main(String[] args) {
        int i,j;
        for(i = 3; i <= 1000; i++){
            for(j = 2; j <= i/2; j++){
                if(i % j == 0)
                    break;

            }
            if(j > i/2){
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
