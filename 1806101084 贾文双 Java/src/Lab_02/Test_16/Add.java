package Lab_02.Test_16;

import java.util.Scanner;

public class Add extends Calculation {


    @Override
    double add(double a, double b) {
        return a + b;
    }

    @Override
    double reduce(double a, double b) {
        return 0;
    }

    @Override
    double ride(double a, double b) {
        return 0;
    }

    @Override
    double except(double a, double b) {
        return 0;
    }
}
