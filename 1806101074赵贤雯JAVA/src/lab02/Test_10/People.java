package lab02.Test_10;

//10、 	定义父类People，分别定义People类的子类ChinaPeople， AmJericanPeople和BeiJingPeople并分别重写父类中的各个方法。最后在主方法中分别创建各子类的对象并调用各自的方法打印输出信息。
public abstract class People {
    String name;
    String sex;
    public abstract void sayHello();
}
class ChinesePeople extends People{
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm a Chinese!");
    }
}
class AmericanPeople extends People{
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm an American!");
    }
}
