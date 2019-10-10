package lab02.Test_13;

public abstract class ComputerAverage {
    abstract float getAverage(float a, float b, float c , float d, float e);//抽象类不可以直接实例化，里面的方法也不能直接执行

}
class Gymnastics extends ComputerAverage{
    float getAverage(float a, float b, float c, float d, float e) {
    float m = 0;
    if (m<a){
        m=a;
    }
    if (m<b){
        m = b;
    }
    if (m<c){
        m = c;
        }
    if (m<d){
        m = d;
        }
    if (m<e){
        m = e;
        }
    return m;
    }
}
class School extends ComputerAverage{
    float getAverage(float a, float b, float c, float d, float e) {
        System.out.println("平均分为："+(a+b+c+d+e)/5);

        return a;
    }
}
class Test{
    public static void main(String[] args) {
        Gymnastics gy = new Gymnastics();
        gy.getAverage(1,2,4,6,7);
        School sc = new School();
        sc.getAverage(1,3,5,8,9);
    }
}
