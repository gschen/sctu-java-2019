package Lab_02.Test_16;

public class Except extends Calculation{
    @Override
    double add(double a, double b) {
        return 0;
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
        return a / b;
    }
}
