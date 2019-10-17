package lab_01;
//10、	显示1-100中的素数，每行显示5个数。（素数，一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数。）
public class Test_10 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++) {
            int count=0;
            for (int j=1;j<=i;j++) {
                if(i%j==0){
                    count++;
                }
            }
            if (count==2) {
                System.out.println(i);
            }
        }
    }
}
