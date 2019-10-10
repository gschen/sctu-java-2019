package lab_02.Test_16;

public class Main {
    public static void main(String[] args) {
        Addition h1 = new Addition();
        Multiplication h2 = new Multiplication();
        Division h3 = new Division();
        Subtraction h4 = new Subtraction();
        System.out.println(h1.A(3,4)+h2.A(9,5)+h3.A(9,8)+h4.A(9,9));
    }
}
