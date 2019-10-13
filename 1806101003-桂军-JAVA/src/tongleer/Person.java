package tongleer;

public class Person {
    //1）private修饰的成员：该成员仅对自己这个类可见。

    //2）default修饰的成员：该成员对同一个包中的类都可见。

    //3）protected修饰的成员：该成员除了对同一个包中的类可见外，还对包外的子类（成员所在类的子类）可见。

    //4）public修饰的成员：该成员不仅对同一个包中的类可见，在包外的类中也都可见。
    // java有四个修饰符，分别为public/protected/default/private，这四个修饰符的权限范围是不一样的。

    //     public修饰的成员，在同类、同包、子类（继承自本类）、其他包中都可以访问。

    //     protected修饰的成员，在同类、同包、子类中可以访问，但是在其他包中不能访问。

    //     default修饰的成员，在同类、同包中可以访问，但是在其他包中不管是不是子类都不能够访问。

    //     private修饰的成员，只能在同类中被访问，而在同包、子类和其他包中是不能访问的。

    //     另外需要说明的是，public和default一样都可以修饰任何类而且类名必须和文件名相同。而protected和private都不可以修饰类。

    public String name = "习近平";
    public int age = 18;
    public void thing(){
        System.out.println("我正在上课");
    }
    public void introduce(){
        System.out.println("我的姓名是："+name+"我的年龄是："+age);
    }
}
