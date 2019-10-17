package Lab_02.Test_13;
//School中计算平均分的方法是直接是总分除以总科目
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
