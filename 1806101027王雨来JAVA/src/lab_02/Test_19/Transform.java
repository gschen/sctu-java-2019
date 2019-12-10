package lab_02.Test_19;
/*19、 	编写一个程序，实现字符串的大小写转换并倒序输出，
如输入为“HelloWord”，输出为“DROwOLLEH”。*/
public class Transform {
    public static void main(String[] args) {
        String aa ="HelloWord";
        char ch;
        for (int i = 0; i < aa.length(); i++) {
            ch = aa.charAt(aa.length() - 1 - i);
            if((int)ch < 91)
                System.out.print((char)(ch + 32));
            else
                System.out.print((char)(ch - 32));

        }
    }
}
