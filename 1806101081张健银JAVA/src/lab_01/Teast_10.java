package lab_01;
//10、	显示1-100中的素数，每行显示5个数。（素数，一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数。）
public class Teast_10 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean flag = false;
            for (int j = 2; j <= 100; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println(i);
            }
        }
    }
}