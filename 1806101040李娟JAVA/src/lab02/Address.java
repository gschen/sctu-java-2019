package lab02;

public class Address {

    //属性
    String country;
    String province;
    String city;
    String street;
    String code;


    //成员方法
    void printInfo(){//打印
        System.out.println("国家:"+this.country);//this.country下面赋的值
        System.out.println("省份："+this.province);
        System.out.println("城市："+this.city);
        System.out.println("街道："+this.street);
        System.out.println("邮编："+this.code);
    }

    public static void main(String[] args) {  //main方法是程序的入口  
        int a;
        Address sctu=new Address();//定义一个变量sctu,变量sctu的类型是TestAddress
        //new Address()实例化


        sctu.country="China";
        sctu.province="四川";
        sctu.city="成都";
        sctu.street="红岭路";
        sctu.code="000000";

        sctu.printInfo();//获取方法


    }

}
