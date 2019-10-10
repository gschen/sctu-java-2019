package lab_02.test_10;

import day20190919.A;

public class Example {
    public static void main(String[] args) {
        ChinaPeople chinaPeople=new ChinaPeople();
        AmJericanPeople amJericanPeople=new AmJericanPeople();
        BeiJingPeople beiJingPeople=new BeiJingPeople();
        chinaPeople.speakHello();
        amJericanPeople.speakHello();
        beiJingPeople.speakHello();
        chinaPeople.averageWeight();
        amJericanPeople.averageWeight();
        beiJingPeople.averageWeight();
        chinaPeople.averageHeight();
        amJericanPeople.averageHeight();
        beiJingPeople.averageHeight();
        chinaPeople.chinaPanda();
        amJericanPeople.americanSport();
        beiJingPeople.beijingOpera();
    }
}
