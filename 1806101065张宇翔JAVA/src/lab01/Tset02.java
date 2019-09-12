package lab01;

public class Tset02 {    public static void main(String[] args) {
    for (int i=100;i<=300;i++)
    {
        if ( i % 3 == 0)
            continue;

        System.out.println(i);
    }
}
}
