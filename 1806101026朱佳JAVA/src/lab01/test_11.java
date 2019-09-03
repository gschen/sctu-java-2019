package lab01;

import java.util.Scanner;

public class test_11 {
    public static void main(String[] args) {
        System.out.println("请输入你的数:");
        Scanner mas = new Scanner(System.in);
        String word = mas.next();
        int i =word.length();
        System.out.print("你的是" + i + "位数,");
        int j = 0;
        while (j <= (i / 2) -1 && word.charAt(j) == word.charAt(i - j - 1))
            j++;
        if (j == i / 2)
            System.out.println("它是回文数。");
        else
            System.out.println("它不是回文数。");
    }
}

