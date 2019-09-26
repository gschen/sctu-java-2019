package lab_02.Test_01;

public class Test_01_Address {
    String country;
    String province;
    String city;
    String street;
    String zipcode;

    //2.行为
    void printInfo(){
        System.out.println("国籍： " + this.country);
        System.out.println("省份为： " + this.province);

    }

    public static void main(String[] args) {
    Test_01_Address sctu = new Test_01_Address();
    sctu.country = "China";
    sctu.province = "Sichuan";
    sctu.city = "Chendu";
    sctu.street = "Honglinglu";
    sctu.zipcode = "610100";
        System.out.println("四川旅游学院的详细信息为：");
        sctu.printInfo();
    }
}
