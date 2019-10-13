package Lab02.Test22;

import java.util.Scanner;

public class stringchange {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] c = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z') {
                stringBuffer.append(String.valueOf(c[i]).toLowerCase());
            }
            else if (c[i] >= '0' && c[i] <= '9') {
                stringBuffer.append("0");
            }
            else {
                stringBuffer.append("#");
            }
        }
        System.out.println(stringBuffer.toString());
    }
}

