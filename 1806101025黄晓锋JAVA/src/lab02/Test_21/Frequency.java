package lab02.Test_21;

import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {

        String zhifuchuan = "dfkjdhtyuiopasdfghjklzxcvbshfjhskjhfkjlaskljfdslafklsdkfksdfhskdfsdhfjksajknm";

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要查找的字符：");
        String a = sc.next();
        char d = a.charAt(0);


        int b = 0;
        for (int i = 0; i <zhifuchuan.length() ; i++) {
            int c = zhifuchuan.charAt(i);
            if ( d == c){
                b++;

            }
        }
        System.out.println(a+" 出现次数为："+b);
    }
}
