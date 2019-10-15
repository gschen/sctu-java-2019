package lab_02.Test_13;

public class School extends ComputerAverage{
    @Override
    double getAverage() {
        return (a+b+c+d)/4;
    }

    public static void main(String[] args) {
        School school = new School();
        school.a = 60;
        school.b = 33;
        school.c = 34;
        school.d = 99;

        System.out.println(school.getAverage());
    }
}
