package lab_01;
//   A
//  B C
// D E F
//G H I J
//K L M N
// O P Q
//  R S
//   T

public class Test_09 {
    public static void main(String[] args) {
        int n=64;
        //上半部分
        for(int i = 0;i < 4;i++){        //行数
            for(int k = 0;k < 3 - i;k++){
                System.out.print(" ");
            }
            for(int j = 0;j < i +1;j++){
                for(int l = j;l < j + 1;l++){
                    char z = (char)(n + 1);
                    System.out.print(z + " ");
                    n = (int)z;
                }
            }
            System.out.println();
        }
        //下半部分
        for(int i = 0;i < 4;i++){
            for(int k = 0;k < i ;k++){
                System.out.print(" ");
            }
            for(int j = 0;j < 4 - i;j++){
                for(int l = j;l < j + 1;l++){
                    char z = (char)(n + 1);
                    System.out.print(z + " ");
                    n = (int)z;
                }
            }
            System.out.println();
        }
    }
}
