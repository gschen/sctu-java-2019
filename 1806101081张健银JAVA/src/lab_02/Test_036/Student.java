package lab_02.Test_036;
//student类是一个抽象类，它包含一些基本的学生信息，如姓名、类别（本科生还是研究生）、所学课程（这里假定为3门课，用一维数组表示）成绩和成绩等级等
public abstract class Student {
     String name;
     String style;
     int[] score = new int[3];

     public abstract void method();
}