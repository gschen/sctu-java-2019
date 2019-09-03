package week01;

public class Text__2__12 {
    public static void main(String[] args) {
        int res = 0;
        String st = "";
        for (int i = 1; i <= 100; i++) {
            int a = 0;

            a = a + i;
            res = res + i;
            st = st + a + "+";
        }
        st = st.substring(0, st.length() - 1);
        System.out.println("运行结果如下：");
        System.out.println(st + "=" + res);
    }
}
