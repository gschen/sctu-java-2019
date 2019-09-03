package day20190830;

/**
 * Created by Administrator on 2019-8-30.
 */
public class Test01 {

    public static void main(String[] args) {

        System.out.println("hello,world!");

        int a = 0;

        // ++ 自增
        a++; // a = a + 1  -> a += 1 -> a++; ++a;
        System.out.println("a = " + a);


        // -- 自减
        a--; // a = a - 1 -> a -= 1 -> a--; --a;
        System.out.println("a = " + a);


        int b = 1;

        // 分支语句 if
        if (b >= 0) {
            System.out.println("b是正整数。");
        } else {
            System.out.println("b是负数。");
        }

        // 0,1,2 -> A,B,C
        // 分支语句 switch
        switch (b){
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            default:
                System.out.println("ERROR!");
        }

        // 循环结构 while, do while, for
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }

        System.out.println(sum);


        // continue, break 循环结构
        int c = 0;

        for (int i = 0; i < 100; i++) {

            if ( i == 60){
                break; //跳出for循环
            }

            if (i == 50){
                continue;
            }
        }

        System.out.println("next!");



    }
}
