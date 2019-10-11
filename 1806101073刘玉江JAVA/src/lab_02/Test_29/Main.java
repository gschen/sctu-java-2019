package src.lab_02.Test_29;

public class Main {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6};
        try{
            System.out.println(x[9]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }finally {
            System.out.println("结束");
        }
    }
}
