package lab02.Test_10;

 class People {
    public String position;
    public int age;
    People(String position,int age){//定义形式参数
        System.out.println("来自哪个地方："+position+"\n"+"多大年龄："+age);//写出主方法
        this.age =age;
        this.position=position;
    }

}
class ChinaPeople extends People {

    ChinaPeople() {//构造一个和类名相同的构造函数
        super("中国",18);//利用super来访问父类的成员 也可以用来调用父类中的函数
//重写父类的方法
    }
}
class AmericanPeople extends People{
    AmericanPeople(){
        super("美国",28);
    }
 }
class BeiJingPeople extends People{
    BeiJingPeople(){
        super("北京",38);
    }
}
 class Test{
     public static void main(String[] args) {
         ChinaPeople cp = new ChinaPeople();
         AmericanPeople ap = new AmericanPeople();
         BeiJingPeople bp = new BeiJingPeople();
     }
 }


