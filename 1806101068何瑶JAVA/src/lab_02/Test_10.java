package lab_02;

public abstract class Test_10 {
   public String name;
   public String sex;
   public abstract void sayHello();
}
class ChinesePeople extends Test_10{
    @Override
    public void sayHello(){
        System.out.println("Hello,I am a Chinese");
    }
}
class AmericanPeople extends Test_10{
    @Override
    public void sayHello(){
        System.out.println("Hello,I am a American");
    }
}
class BeijingPeople extends Test_10 {
    @Override
    public void sayHello() {
        System.out.println("Hello,I am a Beijing people");
    }

    public static void main(String[] args) {
        ChinesePeople cp = new ChinesePeople();
        cp.sayHello();
        AmericanPeople ap = new AmericanPeople();
        ap.sayHello();
        BeijingPeople bp = new BeijingPeople();
        bp.sayHello();
    }
}