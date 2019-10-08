package lab_02.Test_12;

import com.sun.org.apache.regexp.internal.RE;

public class Main {
    public static void main(String[] args) {
        Shape a;
        Rectangular c = new Rectangular();
        Circle b = new Circle();
        a = c;
        a.area();
        a.lenth();
        a = b;
        a.lenth();
        a.area();
    }
}
