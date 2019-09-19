package practice.jiekou;


interface C{  //接口声明
    public abstract int fun(int x,int y);
}

class A implements C{  //实现接口
    public int fun(int x,int y){
        return 2* (x+y);
    }
}

class B implements C{    //实现接口
    public int fun(int x,int y){
        return x * y;
    }
}

public class Test01 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();

        System.out.println("长方体周长："+a.fun(12,8));
        System.out.println("长方体面积："+b.fun(2,6));
    }
}
