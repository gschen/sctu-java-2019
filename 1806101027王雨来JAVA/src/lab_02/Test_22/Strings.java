package lab_02.Test_22;
/*22、 	给定一个字符串，将字符串中的所有大写字母变成小写字母，数字用0 来代替，其他符号用#代替。*/
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String string = scanner.next();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if((int)ch > 64 & (int)ch < 91)
                System.out.print((char)(ch + 32));

            else if ((int)ch < 58 & (int)ch > 47)
                System.out.print("0");

            else if ((int)ch > 96 & (int)ch < 123)
                System.out.print(ch);

            else
                System.out.print("#");
        }
    }
}



