package lab_02.Test_29;

public class Test_29 {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            System.out.println(i);
            if (i == 50){
                try{
                    int[] a = new int [5];
                    a[6] = 10;
                    System.out.println(i / 0);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(e.toString());
                }finally {
                    System.out.println("已查清错误！");
                }
            }
        }
    }
}
