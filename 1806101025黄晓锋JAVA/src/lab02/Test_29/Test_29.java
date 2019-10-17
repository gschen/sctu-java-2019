package lab02.Test_29;

public class Test_29 {
    public static void main(String[] args) {

        try {int [] a =new int [4];
            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            a[3] = 4;
            a[4] = 5;
            System.out.println(a);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界错误！");
        }
        finally {
            System.out.println("证实！");
        }
    }
}
