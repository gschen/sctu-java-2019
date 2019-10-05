package lab_02.test_01;

//编写并测试一个代表地址的类，包括以下的属性：国家、省份、城市、街道、邮编

public class Address {
    //1.属性
    String country;
    String province;
    String city;
    String street;
    String postalcode;

    //2.行为
    //成员方法
    void printInfo() {
        System.out.println("国家：" + this.country + "省份：" + this.province + "城市："
                + this.city + "街道：" + this.street + "邮编：" + this.postalcode);}
        public static void main (String[] args){
            int a;//定义一个变量a，变量a的类型是int
            //实例化
            Address sctu = new Address();//定义一个变量sctu，变量sctu的类型是Address
            sctu.country = "China";
            sctu.province = "SiChuan";
            sctu.city = "ChengDu";
            sctu.street = "honglinglu";
            sctu.postalcode = "610000";
            sctu.printInfo();
        }
}
