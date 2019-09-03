package lab01;
/*8、	请编写输出乘法口诀表的程序。
乘法口诀表的部分内容如下：
1*1=1
1*2=2 2*2=4
1*3=3 2*3=6 3*3=9
1*4=4 2*4=8 3*4=12 4*4=16
...
*/

public class Test_08 {
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
