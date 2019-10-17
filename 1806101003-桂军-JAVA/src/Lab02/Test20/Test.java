package Lab02.Test20;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入一行含有数字字符的字符串：");
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        String regex = "\\D";
        String[] newInt = str.split(regex);
        for (int i = 0;i<newInt.length;i++){
            System.out.println(newInt[i]);
        }
    }

}
