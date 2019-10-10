package lab02.test19;
//19、 	编写一个程序，实现字符串的大小写转换并倒序输出，如输入为“HelloWord”，输出为“DROwOLLEH”。
public class Test19 {
    public static void main(String[] args) {
        String str="HelloWord";

        char[] ch = str.toCharArray();
        StringBuffer buffer = new StringBuffer();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                buffer.append(String.valueOf(ch[i]).toLowerCase());
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                buffer.append(String.valueOf(ch[i]).toUpperCase());
            }
        }
        System.out.println(buffer.toString());

    }
}
