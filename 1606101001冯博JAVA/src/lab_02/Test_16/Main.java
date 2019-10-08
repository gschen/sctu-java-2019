package lab_02.Test_16;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.A(3,4));
        Subtraction subtraction = new Subtraction();
        System.out.println(subtraction.A(5,2));
        Multiplication multiplication = new Multiplication();
        System.out.println(multiplication.A(5,4));
        Division division = new Division();
        System.out.println(division.A(8,4));
    }
}
