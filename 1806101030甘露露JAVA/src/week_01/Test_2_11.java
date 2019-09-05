package week_01;

public class Test_2_11 {
    public static void main(String[] args) {

        int num = 64;
        for(int i = 0;i < 4;i++){
            for(int k = 0;k < 3 - i;k++){
                System.out.print(" ");
            }
            for(int j = 0;j < i +1;j++){
                for(int l = j;l < j + 1;l++){
                    char z = (char)(num + 1);
                    System.out.print(z + " ");
                    num = (int)z;
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
                    char z = (char)(num + 1);
                    System.out.print(z + " ");
                    num = (int)z;
                }
            }

            System.out.println();
        }

    }
    }

