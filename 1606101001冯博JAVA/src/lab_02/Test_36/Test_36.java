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
