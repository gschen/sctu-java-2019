package lab_02.test_16;

public class Add extends Calculation {
//接口

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
