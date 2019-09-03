package week_01;

public class Test_2_11 {
    public static void main(String[] args) {
        String[] obj=new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"};
        int num=0;
        int nums=10;
        for (int i = 1; i <=4 ; i++) {//最外层for控制第一到第四行输出
            for (int j = 1; j <=4-i ; j++) {//充值每行开头的空格输出数量
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {//控制接着空格后面输出的字母数量
                System.out.print(" ");
                System.out.print(obj[num]);
                num++;
            }
            System.out.print("\n");//每行前两部分输出完成后，输出一个换行符到下一行
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