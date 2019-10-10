package practice.guanjianzi;

class A{
    int x=2,y=3;
    double add(){
        return x+y;
    }
}

class B extends A{
    int x=20,y=30;
    double add(){
        return super.x+super.y;  //super.x和super.y调用父类A被隐藏的成员变量x和y
    }

    double addB(){
        return x+y;
    }

    double addA(){
        return super.add(); //使用super.add()调用父类被隐藏的方法add()  不管这里x和y的值 直接是回到A中的方法，执行A里的东西
    }
}

public class super1 {
    public static void main(String[] args) {
         A a=new A();
         B b=new B();

        System.out.println("a.aad="+a.add());

        System.out.println("b.aad="+b.add());
        System.out.println("b.aadB="+b.addB());
        System.out.println("b.aadA="+b.addA());
    }
}
