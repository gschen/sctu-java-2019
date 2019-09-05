package lab_02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Address {
    String country;
    String province;
    String city;
    String street;
    String zipcode;

    //2.行为
    void printInfo(){
        System.out.println("国籍： " + this.country);

    }

    public static void main(String[] args) {
    Address sctu = new Address();
    sctu.country = "China";
    sctu.province = "Sichuan";
    sctu.city = "Chendu";
    sctu.street = "Honglinglu";
    sctu.zipcode = "610100";
        System.out.println("四川旅游学院的详细信息为：");
        sctu.printInfo();
    }
}
