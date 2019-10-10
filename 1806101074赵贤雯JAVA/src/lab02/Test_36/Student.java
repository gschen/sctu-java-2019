package lab02.Test_36;

public abstract class Student {
    String name;
    String type;
    int[] score = new int[3];

    public Student(String name, String type,int[] score){
        this.name = name;
        this.type = type;
        this.score = score;
    }

    public void judge(){

    }

}
