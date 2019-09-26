package lab_02.Test_10;
/*10、 	定义父类People，分别定义People类的子类ChinaPeople，
 AmericanPeople和BeiJingPeople并分别重写父类中的各个方法。
 最后在主方法中分别创建各子类的对象并调用各自的方法打印输出信息。*/
public class People {
    String country;
    public People(String country){
        this.country = country;
    }
}
