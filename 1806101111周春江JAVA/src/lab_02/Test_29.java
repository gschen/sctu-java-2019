package lab_02;

public class Test_29 {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7};

        try {
            System.out.println(a[10]);
        }catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }finally {
            System.out.println("这里被执行了");
        }


    }
}
