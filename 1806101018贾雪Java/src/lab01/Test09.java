package lab_01;

public class Test09 {
    public static void main(String[] args) {
        String[] obj=new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"};
        int num=0;
        int nums=10;
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print(" ");
                System.out.print(obj[num]);
                num++;
            }
            System.out.print("\n");
        }
        for (int i = 1; i<=4 ; i++) {
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }
            for (int k =1; k<=4-i+1; k++) {
                System.out.print(" ");
                System.out.print(obj[nums]);
                nums++;
            }
            System.out.print("\n");
        }
    }
}
