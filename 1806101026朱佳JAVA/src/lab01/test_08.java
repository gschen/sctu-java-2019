package lab01;

public class test_08 {
    public static void main(String []args) {
        int i,j;
        for(i=1;i<=9;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println("");//println换行
        }
    }
}
