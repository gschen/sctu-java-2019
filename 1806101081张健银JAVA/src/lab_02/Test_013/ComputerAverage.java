package lab_02.Test_013;
//13、 	编写一个ComputerAverage抽象类，类中有一个抽象方法求平均分average，可以有参数。定义Gymnastics类和School类，
//        它们都是ComputerAverage的子类，Gymnastics类中计算选手的平均成绩的方法是去掉一个最低分，去掉一个最高分，然后求平均分。School中计算平均分的方法是直接是总分除以总科目
public abstract class ComputerAverage {
    public abstract double average(double[] score);
}

