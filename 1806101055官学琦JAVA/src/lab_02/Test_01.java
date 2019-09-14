package lab_02;

import java.util.Scanner;

public class Test_01 {
    public static void main(String[] args) {
        Address a=new Address("中国","四川省","成都市","红岭路","xxx");
        a.print();
    }

}

class Address{
    private String country,province,city,street,code;
    public Address(String country,String province,String city,String street,String code){
        this.city=city;
        this.code=code;
        this.country=country;
        this.province=province;
        this.street=street;
    }
    public void print(){
        System.out.println("地址信息为："+this.country+this.province+this.city+this.street+" "+"邮政编号："+this.code);
    }
}
