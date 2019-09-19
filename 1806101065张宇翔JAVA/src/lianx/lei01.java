package lianx;

/**public class lei01 {
    float x,y;
    float add(float x,float y){
        return x+y;
    }
}a.add(1,9)
**/
public class lei01 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("浮点数相加="+a.add(1.1,1.2));
        System.out.println("整数相加="+a.add(2,9));
    }
}
class A{
    //int m;
    //float p;
    double add(double f1,double f2){
        return f1+f2;
    }
}