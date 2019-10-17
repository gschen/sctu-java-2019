package day20190912;

public class Student {
    int math;
    int english;
    int computer;

    void sum(){
        System.out.println("总分是："+(math+english+computer));
    };
    void average(){
        System.out.println("平均分是："+((math+english+computer)/3));
    };


    public static void main(String[] args){
        Student p = new Student();
        p.computer = 100;
        p.english = 98;
        p.math = 99;
        p.sum();
        p.average();
    }
}

