package lab_02.Test_10;

public class People {
     void people(String name,String address,String sex,int age){}
    public static void main(String[] args) {
        ChinaPeople chinaPeople = new ChinaPeople();
        chinaPeople.chinaPeople("冯博","中国","男",21);
        AmericanPeople americanPeople = new AmericanPeople();
        americanPeople.privateInfo("bill","American","man",20);
        BeijingPeople beijingPeople = new BeijingPeople();
        beijingPeople.beijing("马冬梅","北京","女",36);
     }
}
