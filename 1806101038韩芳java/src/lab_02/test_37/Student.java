package lab_02.test_37;

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
