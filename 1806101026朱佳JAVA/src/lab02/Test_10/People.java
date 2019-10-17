package lab02.Test_10;

public class People {
    String a;
    String learn(){return "study";}

    public static void main(String[] args) {
        People p1=new ChinaPeople();
        People p2=new AmJericanPeople();
        People p3=new BeiJingPeople();

        System.out.println(p1.learn());
        System.out.println(p2.learn());
        System.out.println(p3.learn());
    }
}

class ChinaPeople extends People {
    String learn(){return "1";}

}

class AmJericanPeople extends People {
    String learn(){return "2";}

}

class BeiJingPeople extends People {
    String learn(){return "3";}

}