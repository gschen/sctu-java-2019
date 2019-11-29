package week_1;
public class Test_2_11 {
    public static void main(String[] args) {
//                         i  k  j  l
//        111A             0  3  1 -1     找到k与j与行数（i）的关系
//        11B C            1  2  2 -2       k = 3 - i   j = i + 1
//        1D E F           2  1  3 -3
//        G H I J          3  0  4 -4
//        K L M G          0  0  4
//         O P Q           1  1  3
//          R S            2  3  2
//           T             3  4  1
//        char c = 'a';
//        int i =  c;
//        System.out.print(i);

        Num m = new Num();
        for(int i = 0;i < 4;i++){
            for(int k = 0;k < 3 - i;k++){
                System.out.print(" ");
            }
            for(int j = 0;j < i +1;j++){
                for(int l = j;l < j + 1;l++){
                    m.num();
                }
            }
            System.out.println();
        }
        for(int i = 0;i < 4;i++){
            for(int k = 0;k < i ;k++){
                System.out.print(" ");
            }
            for(int j = 0;j < 4 - i;j++){
                for(int l = j;l < j + 1;l++){
                    m.num();
                }
            }
            System.out.println();
        }
    }

}

class Num{
    private int num = 64;


    public void num(){
        char z = (char)(num + 1);
        System.out.print(z + " ");
        num = (int)z;
    }
}