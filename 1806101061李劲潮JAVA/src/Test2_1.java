// 演示字符与unicode字符表编码的关系


public class Test2_1 {
    public static void main(String[] args) {
        final char SQ = 39;
        char ch1 = '中', ch2 = '国', ch3 = '梦';  // char 定义字符

        int n1, n2, n3;

        n1 = (int) ch1;
        n2 = (int) ch2;
        n3 = (int) ch3;

        System.out.println("在 unicode 表中序号" + ch1 + "对应的字符为" + SQ + n1 + SQ);
        System.out.println("在 unicode 表中序号" + ch2 + "对应的字符为" + SQ + n2 + SQ);
        System.out.println("在 unicode 表中序号" + ch3 + "对应的字符为" + SQ + n3 + SQ);

        n1=22797;
        ch1 = (char)n1;
        n2 = 20852;n3 = 26790;
        ch2 = (char)n2;ch3 = (char)n3;

        System.out.println("在 unicode 表中序号" + n1 + "对应的字符为" + SQ + ch1 + SQ);
        System.out.println("在 unicode 表中序号" + n2 + "对应的字符为" + SQ + ch2 + SQ);
        System.out.println("在 unicode 表中序号" + n3 + "对应的字符为" + SQ + ch3 + SQ);
    }
}