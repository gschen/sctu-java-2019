package Lab02.Test37;

public abstract class Student {
    String name;
    int[] score = new int[3];

    public Student(String name,int[] score) {
        this.name = name;
        this.score = score;
    }
}
