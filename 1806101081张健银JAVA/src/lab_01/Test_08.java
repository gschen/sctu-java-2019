package lab_01;
//8、	请编写输出乘法口诀表的程序。
//        乘法口诀表的部分内容如下：
//        1*1=1
//        1*2=2 2*2=4
//        1*3=3 2*3=6 3*3=9
//        1*4=4 2*4=8 3*4=12 4*4=16

public class Test_08 {
    public static void main(String[] args) {
        for(int i = 1;i < 10;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(i + " " + "*" + " " + j + " " + "=" + " " + i*j + " ");
            }
            System.out.println();
        }
    }
}
