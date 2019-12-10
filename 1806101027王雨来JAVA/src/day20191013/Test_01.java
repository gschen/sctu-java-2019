package day20191013;

public class Test_01 {
    public String name;
    public int age;
    public Test_01(String name,int age) //构造方法
    {
        this.name=name;
        this.age=age;
    }
    public void study()
    {
    }
    public void show()
    {
        System.out.println("姓名:"+name+"  年龄:"+age+"");
    }
}



class Undergraduate extends Test_01 {//学生类派生本科生类
    private String specialty;
    private String education;
    public Undergraduate(String name, int age,String specialty ,String education)
    {
        super(name, age);
        this.specialty=specialty;
        this.education=education;
    }
    public void study()
    {
    }
    public void show()
    {
        super.show();  //调用父类的方法
        System.out.println("专业:"+specialty+" 学历:"+education );
    }

}



class Graduate extends Test_01 {  //学生类派生研究生类
    private String direction;
    public Graduate(String name, int age,String direction)
    {
        super(name, age);
        this.direction=direction;
    }
    public void study()
    {
    }
    public void show()
    {
        super.show(); //调用父类的方法
        System.out.println("研究方向是:"+direction);
    }

}



class TestExtends
{
    public static void main(String[] args)
    {
        Test_01 丁一=new Test_01("丁一",18);
        丁一.show();System.out.println();
        Undergraduate 倪二=new Undergraduate("倪二",22,"软件工程","学士");
        倪二.show();System.out.println();
        Graduate 张三=new Graduate("张三",24,"软件测试");
        张三.show();System.out.println();
    }
}
