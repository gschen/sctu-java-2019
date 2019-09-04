package lab_01;
public class Test_09 {
    public static void main(String[] args) {
        String[] obj=new String[]
                {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"};
        int x1=0;
        int x2=10;
        for (int i = 1; i <=4 ; i++) {

            for (int j = 1; j <=4-i ; j++) {
                //空格输出数量
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {//空格后面输出的字母数量
                System.out.print(" ");
                System.out.print(obj[x1]);
                x1++;
            }
            System.out.print("\n");//输出换行符
        }


        for (int i = 1; i<=4 ; i++) {
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }
            for (int k =1; k<=4-i+1; k++) {
                System.out.print(" ");
                System.out.print(obj[x2]);
                x2++;
            }
            System.out.print("\n");
        }
    }
}
