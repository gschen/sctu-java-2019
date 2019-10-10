package lab_02.test_01;



public class Address {
    String country;
    String province;
    String city;
    String street;
    String zipecode;

    void printInfo(){
        System.out.println("国家："+this.country);
    }


    public static void main(String[] args) {

        int a;

        Address sctu = new Address();
        sctu.country = "China";
        sctu.province = "Sichuan";
        sctu.city = "Chengdu";
        sctu.street = "610100";

        sctu.printInfo();
    }
}
