package day201927.yichang;

public class Test {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);

            if (i == 50) {
                try {
                    int[] a = new int[5];
                    a[6] = 10;

                    System.out.println(i / 0);
                } catch (Exception e) {
                    System.out.println(e.toString());
                } finally {

                    //不管出错与否，最终都会被执行。


                }
            }
        }
    }
}
