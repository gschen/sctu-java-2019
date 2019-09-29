package lab_02.Test_037;

public abstract  class Student {
    String name;
    int age;
    int[] score = new int[3];

    public Student(String name, int age, int[] score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
