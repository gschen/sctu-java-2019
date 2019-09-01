package lab_01;

import java.util.Scanner;

//使用for循环
public class Test_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入n：");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

//使用while循环
class Test_041{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入n：");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}

//使用dowhile循环
class Test_042{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入n：");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;

        do {
            sum += i;
            i++;
        }while (i <= n );
        System.out.println(sum);
    }
}