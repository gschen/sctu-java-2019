package day20190829.Lab01;

public class test08 {
    public static void main(String[] args) {
        int x, y;
        for ( x = 1; x <=9; x++) {
            for ( y = 1; y <=x; y++) {
                System.out.print(y+"*"+x+"="+x *y+" ");
            }
            System.out.println();
        }
    }
}
