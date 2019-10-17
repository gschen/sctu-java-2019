package Lab_02.Test_022;

import java.util.Scanner;

//22、 	给定一个字符串，将字符串中的所有大写字母变成小写字母，数字用0 来代替，其他符号用#代替。
public class StringTest {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] c = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < c.length ; i++) {
            if(c[i] >= 'A' && c[i] <= 'Z'){
              stringBuffer.append(String.valueOf(c[i]).toLowerCase());
            }else if(c[i] >= '0' && c[i] <= '9'){
                stringBuffer.append("0");
            }else{
                stringBuffer.append("#");
            }
        }
        System.out.println(stringBuffer.toString());
    }
}
