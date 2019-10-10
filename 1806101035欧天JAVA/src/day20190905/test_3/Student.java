package lab_02.day20190905.test_3;

public class Student {
    private String name;
    private double computer;
    private double english;
    private double math;

    public Student(){}//构造方法
    public Student(String n,int a,double c,double e,double m){
        this.setName(n);
        this.setComputer(c);
        this.setEnglish(e);
        this.setMath(m);
    }
    public String getName() {//姓名
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getComputer() {
        return computer;
    }
    public void setComputer(double computer) {
        this.computer = computer;
    }

    public double getEnglish() {
        return english;
    }
    public void setEnglish(double english) {
        this.english = english;
    }

    public double getMath() {
        return math;
    }
    public void setMath(double math) {
        this.math = math;
    }

    public double score(){
        return (this.computer + this.english + this.math);
    }

    public double average(){
        return((this.computer + this.english + this.math)/3);
    }

    public double top(){
        double max;
        max = this.computer > this.english ? this.computer : this.english;
        max = max > this.math ? max : this.math;
        return max;
    }

    public double down(){
        double min;
        min = this.computer < this.english ? this.computer : this.english;
        min = min < this.math ? min : this.math;
        return min;
    }
    public static void main(String[] args) {
        Student person = new Student("董玮维",19,80,90,50);
        System.out.println("姓名：" + person.getName()+ "\n"+"年龄：" + "计算机:" + person.getComputer() + "\n" + "英语：" + person.getEnglish() + "\n" + "数学：" + person.getMath());
        System.out.println("总分：" + person.score());
        System.out.println("平均分：" + person.average());
        System.out.println("最高分：" + person.top());
        System.out.println("最低分：" + person.down());
    }

}



