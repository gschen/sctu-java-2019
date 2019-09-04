package day20190829;

public class Test2_4 {
    public static void main(String[] args) {
        int x=5,y,z;
        z=x;
        y=++x;
        System.out.println("y="+y+" x="+x);
        x=z;
        y=x++;
        System.out.println("y="+y+" x="+x);
    }
}
