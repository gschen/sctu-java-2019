package lab_02.test_36;
//包含的学生信息，姓名、学历、所学课程号（3门课，用一维数组表示）、成绩和成绩等级等
public abstract class Student {
     String name;
     String style;
     int[] score = new int[3];

     public abstract void method();
}