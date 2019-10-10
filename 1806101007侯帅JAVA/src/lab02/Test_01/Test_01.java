package lab02.Test_01;

public class Test_01 {
    String country;
    String province;
    String city;
    String street;
    String post;

    void tell(){
        System.out.println(country+"\n"+province+"\n"+city+"\n"+street+"\n"+post);
    }
}
class Getinformation{
    public static void main(String[] args) {

        Test_01 add = new Test_01();
        add.country = "china";
        add.province = "sichuan";
        add.city = "yibing";
        add.street = "null";
        add.post = "644000";
        add.tell();

    }
}

