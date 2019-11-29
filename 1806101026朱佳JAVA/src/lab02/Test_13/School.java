package lab02.Test_13;

public class School extends ComputerAverage{
    private double all;
    @Override
    public double average(double[] score) {
        for (int i = 0; i < score.length ; i++) {
            all += score[i];

        }
        return all / (score.length);
    }
}