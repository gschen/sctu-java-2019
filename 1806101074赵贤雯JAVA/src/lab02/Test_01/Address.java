package lab02.Test_01;

//1、 编写并测试一个代表地址的类，包括以下的属性：国家、省份、城市、街道、邮编。

public class Address {
    // 1. 属性：国家、省份、城市、街道、邮编。
    String country;
    String province;
    String city;
    String street;
    String zipcode;
    //以上定义的称为成员变量
    // 2. 行为
    //以下称为成员方法
    void printInfo(){
        System.out.println("地址为" + this.country +" "+ this.province +" "+ this.city +" "+ this.street + ",邮政编码为" + " "+this.zipcode + "。");
    }

    public static void main(String[] args) {
        int a; //定义一个变量a，变量a的类型是int
        // 实例化
        Address sctu = new Address(); //定义一个变量sctu，变量sctu的类型是Address
        sctu.country = "China";
        sctu.province = "Sichuan";
        sctu.city = "Chengdu";
        sctu.street = "HonglingRoad";
        sctu.zipcode = "610000";
        sctu.printInfo();
    }
}
