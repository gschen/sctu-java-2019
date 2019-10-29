package Lab03.Test05;



import java.util.Scanner;

/*5、	将字符串加密后，通过字符输出流写入文件，然后读取该文件并解密。
加密算法为：将原有字符的 ASCII码加1，如'A'字符的 ASCII 码为65，加密后其 ASCII 码变成66。"
Hello"加密后的字符串为"Ifmmp"。*/
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = null;
        System.out.printf("请输入你要加密的字符：");
        string = scanner.nextLine();
        stringToAscii(string);
        asciiToString(stringToAscii(string));


    }
    public static String stringToAscii(String value)//转换为ASCII码值
    {
        StringBuffer stringBuffer = new StringBuffer();

        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i != chars.length - 1)
            {
                stringBuffer.append((int)chars[i]).append(",");
            }
            else {
                stringBuffer.append((int)chars[i]);
            }
        }
        System.out.println("加密后的字符为："+stringBuffer);

        return stringBuffer.toString();


    }
    /**
     * Ascii转换为字符串
     * @param value
     * @return
     */
    public static String asciiToString(String value)
    {
        StringBuffer sbu = new StringBuffer();
        String[] chars = value.split(",");
        for (int i = 0; i < chars.length; i++) {
            sbu.append((char) Integer.parseInt(chars[i]));
        }
        System.out.println("解密后的字符为："+sbu);
        return sbu.toString();
    }
}