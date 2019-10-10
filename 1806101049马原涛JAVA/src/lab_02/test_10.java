package lab_02;
//**
public class test_10 {
    public static void main(String[] args) {
        people a=new people();
        a.getpople();
        ChinaPeople b=new ChinaPeople();
        b.getpeople();
    }
}
class people{
    void getpople(){
        System.out.println("people");
    }
};
class ChinaPeople extends people{
    void getpeople(){
        System.out.println("我是中国人");
    };
};
class AmJericanPeopl extends people{
    void getpeople(){
        System.out.println("我是美国人");
    };
};
class BeiJingPeople extends people{
    void getpeople(){
        System.out.println("我是北京人");
    };
};