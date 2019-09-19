package day20190912;

public class Test04 {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = true;
        boolean z = (x&&y)&&(!y);
        int f = z==false?1:2;
        System.out.println(f);
    }




}
