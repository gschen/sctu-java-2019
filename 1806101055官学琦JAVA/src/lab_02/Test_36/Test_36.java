package lab_02.Test_36;

public class Test_36 {
    public static void main(String[] args) {
        int[] zhangsan={90,95,100};
        Undergraduate undergraduate3=new Undergraduate("张三",zhangsan);
        int[] lisi={80,85,90};
        Undergraduate undergraduate4=new Undergraduate("李四",lisi);
        int[] wangwu={82,85,88};
        Postgraduate postgraduate5=new Postgraduate("王五",wangwu);
        int[] zhangliu={75,82,87};
        Undergraduate undergraduate6=new Undergraduate("赵六",zhangliu);
        int[] chenqi={80,82,84};
        Postgraduate postgraduate7=new Postgraduate("陈七",chenqi);
        undergraduate3.avg_grade();
        undergraduate4.avg_grade();
        postgraduate5.avg_grade();
        undergraduate6.avg_grade();
        postgraduate7.avg_grade();
    }
}
abstract class Student{
    String name;
    String category;//类别
    int[] grade=new int[3];//成绩
    abstract void avg_grade();
}
class Postgraduate extends Student{ //研究生
    public Postgraduate(String name,int[] grade){
        this.grade=grade;
        this.name=name;
    }

    @Override
    void avg_grade() {
        super.category="研究生";
        int sum=0;
        for (int i = 0; i <3 ; i++) {
            sum=sum+grade[i];
        }
        if (sum/3<=100 && sum/3>90){
            System.out.println(name+"  "+category+"  优秀");
        }
        else if (sum/3<=90 &&sum/3>80){
            System.out.println(name+"  "+category+"  良好");
        }
        else if (sum/3<=80 && sum/3>70){
            System.out.println(name+"  "+category+"  一般");
        }
        else if (sum/3<=70 && sum/3>60){
            System.out.println(name+"  "+category+"  合格");
        }
        else {
            System.out.println(name+"  "+category+"  不合格");
        }
    }
}
class Undergraduate extends Student{
    public Undergraduate(String name,int[] grade){
        this.grade=grade;
        this.category=category;
        this.name=name;
    }

    @Override
    void avg_grade() {
        super.category="本科生";
        int sum=0;
        for (int i = 0; i <3 ; i++) {
            sum=sum+grade[i];
        }
        if (sum/3<=100 && sum/3>80){
            System.out.println(name+"  "+category+"  优秀");
        }
        else if (sum/3<=80 &&sum/3>70){
            System.out.println(name+"  "+category+"  良好");
        }
        else if (sum/3<=70 && sum/3>60){
            System.out.println(name+"  "+category+"  一般");
        }
        else if (sum/3<=60 && sum/3>50){
            System.out.println(name+"  "+category+"  合格");
        }
        else {
            System.out.println(name+"  "+category+"  不合格");
        }
    }
}