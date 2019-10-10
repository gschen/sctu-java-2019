package lab_02.day20190905.test_1;
import com.sun.jndi.cosnaming.IiopUrl;
public class Address {
    //属性(姓名，年龄， 性别)
    String country;
    String province;
    String city;
    String street;
    String postcode;
    void printInfo() {
        System.out.println("国家是：" + this.country);
        System.out.println("国家是：" + this.province);
        System.out.println("城市是："+this.city);
        System.out.println("街道是："+this.street);
        System.out.println("邮编是:"+this.postcode);
    }
    public static void main(String[] args) {
        int a;
        Address sctu = new Address();
        sctu.country = "中国";
        sctu.province = "四川";
        sctu.city = "成都";
        sctu.street = "龙泉街道";
        sctu.postcode = "654545";
        sctu.printInfo();
    }
}






