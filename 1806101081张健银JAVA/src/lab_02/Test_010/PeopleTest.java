package lab_02.Test_010;

public class PeopleTest {
    public static void main(String[] args) {
        AmJericanPeople a = new AmJericanPeople("安吉里斯人","安吉里斯语",18);
        a.run();
        a.eat();

        ChinaPeople c = new ChinaPeople("中国人","中国话","四川",20);
        c.eat();
        c.run();

        BeiJingPeople b = new BeiJingPeople("北京人","北京话",19);
        b.eat();
        b.run();
    }
}
