package labor02.test.Test_37;

public class Student {
    float math,english,java;
    void compare60(){

    }
    void compare80(){}//定义两个比较函数，但是没有函数体。在调用的时候根据需要加入函数体
    Student(float math,float english,float java){
        float s = (math+english+java)/3;
        System.out.println(s);
        this.math=math;this.english = english; this.java=java;


    }
}
class Undergraduate extends Student{
    Undergraduate(){
        super(84,98,95);
    }

    @Override
    void compare60() {
        super.compare60();
        float a = (math+english+java)/3;
        if (a>60){
            System.out.println("这个本科生的平均成绩大于60，可以发学位证");
        }else
            System.out.println("成绩不理想，不可以发学位证");
    }
}//调用构造函数，加入函数体
class Graduate extends Student{
    Graduate(){
        super(43,56,96);
    }

    @Override
    void compare80() {
        super.compare80();
        float b = (math+english+java)/3;
        if (b>85){
            System.out.println("这个研究生的成绩大于80，可以发学位证");
        }else
            System.out.println("成绩不理想，不可以发学位证");
    }
}//调用父类中的函数以及构造函数
class TestStudentDemo{
    public static void main(String[] args) {
        Undergraduate un = new Undergraduate();
        un.compare60();
        Graduate gr = new Graduate();
        gr.compare80();//测试类，调用函数以及实例化

    }
}