package lab02.Test_37;
//1)	设计一个基类Student描述学生的共同特征。
public abstract class Student {
    String name;
    int[] score = new int[3];

    public Student(String name,int[] score) {
        this.name = name;
        this.score = score;
    }
}
