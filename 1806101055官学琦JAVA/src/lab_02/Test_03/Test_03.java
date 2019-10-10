package lab_02.Test_03;

public class Test_03 {
    public static void main(String[] args) {
        Student student=new Student();
        student.setComputer(100);
        student.setEnglish(98);
        student.setMath(97);
        System.out.println("平均分"+student.avg());
        System.out.println("最高分"+student.max());
        System.out.println("最低分"+student.min());
    }
}

class Student{
    private String name;
    private float math;
    private float computer;
    private float english;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setComputer(float computer) {
        this.computer = computer;
    }

    public float getComputer() {
        return computer;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getEnglish() {
        return english;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getMath() {
        return math;
    }

    public Student(){}
    public Student(String name,float math,float computer,float english){
        this.name=name;
        this.math=math;
        this.computer=computer;
        this.english=english;
    }
    public float sum(){
        return english+computer+math;
    }
    public float avg(){
        return (english+computer+math)/3;
    }
    public float max(){
        float max=math>english?math:english;
        max=max>computer?max:computer;
        return max;
    }
    public float min(){
        float min=computer>math?math:computer;
        min=min>english?english:min;
        return min;
    }
}
