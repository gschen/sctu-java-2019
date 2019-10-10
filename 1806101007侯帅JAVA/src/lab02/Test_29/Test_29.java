package lab02.Test_29;

public class Test_29 {
    public static void main(String[] args) {
        int[]ints = new int[5];
        for (int i = 0; i <ints.length ; i++) {
            System.out.println(i);

        try {
            ints[5] = 124;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }
    }
}}
