package lab02.Test_11;

interface Printx {
    public void printmyway(float a,float b);

}
class Rectangle implements Printx{
     public  float a,b;

    Rectangle(float a, float b){
        System.out.println("周长为："+(a+b)*2+"\n"+"面积为："+a*b);
    }

    @Override
    public void printmyway(float a, float b) {

    }
}
class Squre extends Rectangle{
     Squre(){
         super(5,6);
         System.out.println("对角线是："+Math.sqrt(a*a+b*b));
         this.a = 5;this.b = 6;
     }
     
}
class Test{
    private static Object Rectangle;//添加类到Test类里面

    public static void main(String[] args) {
        Rectangle = new Rectangle(7,8);
        Squre sq = new Squre();

    }
}