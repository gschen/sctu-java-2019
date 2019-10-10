package lab_02.test_29;

import java.util.Enumeration;

public class Exception {
    public static void main(String[] args) {
        int [] arr=new int[]{13,3,23,53,63,93};
        try {
            int num=arr[73];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }
        finally {
            System.out.println("此处代码一定会执行");
        }
    }
}
