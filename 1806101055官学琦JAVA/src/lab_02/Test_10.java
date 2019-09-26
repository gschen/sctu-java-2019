package lab_02;

public class Test_10 {
    public static void main(String[] args) {
        ChinaPeople chinaPeople=new ChinaPeople();
        System.out.println(chinaPeople.print());
        AmJericanPeople amJericanPeople=new AmJericanPeople();
        System.out.println(amJericanPeople.print());
        BeiJingPeole beiJingPeole=new BeiJingPeole();
        System.out.println(beiJingPeole.print());
    }
}

class People{
    public String print(){
        return "我是地球人";
    }
}
class ChinaPeople extends People{
    public String print(){
        return super.print()+"在中国";
    }
}

class AmJericanPeople extends People{
    @Override
    public String print() {
        return super.print()+"在某某地";
    }
}
class BeiJingPeole extends People{
    @Override
    public String print() {
        return super.print()+"在北京";
    }
}