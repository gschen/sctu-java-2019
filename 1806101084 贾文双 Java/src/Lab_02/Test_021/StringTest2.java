package Lab_02.Test_021;

import java.util.Scanner;

//21、 	统计一个字符串中给定字符出现的频率。
public class StringTest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String str = s.next();
        System.out.println("请输入要查找频率的字母：");
        String str1 = s.next();

    char[] ch = str.toCharArray();
    char[] ch1 = str1.toCharArray();
    int count = 0;
        for (int i = 0; i < ch.length ; i++) {
            if(ch[i] == ch1[0]){
                count += 1;
            }
        }

        System.out.println(str1 + "出现的频率是：" + count);
    }

}

