package lab02.test10;

//10、 	定义父类People，分别定义People类的子类ChinaPeople， AmJericanPeople和BeiJingPeople并分别重写父类中的各个方法。
// 最后在主方法中分别创建各子类的对象并调用各自的方法打印输出信息。

 class People {
    String a;

    String aLei(){
        return "guess";
    }

    public static void main(String[] args) {
        People p1= new ChinaPeople();
        People p2=new AmJericanPeople();
        People p3=new BeiJingPeople();

        System.out.println(p1.aLei());
        System.out.println(p2.aLei());
        System.out.println(p3.aLei());
     }
}

 class ChinaPeople extends People{
     String aLei(){
         return "ChinaPeople";
     }

}

class AmJericanPeople extends People{
    String aLei(){
        return "AmJericanPeople";
    }
}

class BeiJingPeople extends People{
    String aLei(){
        return "BeiJingPeople";
    }
}

