package lab02.Test_16;

import javax.naming.NamingEnumeration;

//当抽象类要被实现的话，要在抽象类里面写一个构造函数，方便于调用
abstract class Methods {
    public  float a,b;
    public Methods(float a1,float b1){
        this.a = a1;
        this.b = b1;
    }
    abstract float getAdd();
    abstract float getSubtract();
    abstract float getMultiply();
    abstract float getDivide();
}
 class Add extends Methods{
    Add(float a1, float b1) {
        super(a1, b1);
    }

     @Override
     float getAdd() {
         return 0;
     }

     @Override
     float getSubtract() {
         return 0;
     }

     @Override
     float getMultiply() {
         return 0;
     }

     @Override
     float getDivide() {
         return 0;
     }
 }
 abstract class Subtract extends Methods{
    Subtract(float a1, float b1) {
        super(a1, b1);
    }
}
 abstract class Multiply extends Methods{
    Multiply(float a1, float b1) {
        super(a1, b1);
    }
}
 abstract class Divide extends Methods{
    Divide(float a1, float b1) {
        super(a1, b1);
    }

}
class Test{
    public static void main(String[] args) {
        Add add = new Add(1,2) {
            @Override
            float getAdd() {
                return (a+b);
            }
       };
        System.out.println("求和："+add.getAdd());
    }
    }
