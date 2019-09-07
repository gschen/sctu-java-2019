package lab02.Test_01;

public class Address {
    //1.属性：国家、省份、城市、街道、邮编
    String country;
    String province;
    String street;
    String zipcode;

    //2.行为
    void printInfo(){
        System.out.println("国家： "+ this.country);
        System.out.println("省份： "+ this.province);
        System.out.println("街道： "+ this.street);
        System.out.println("邮编： "+ this.zipcode);
    }


    public static void main(String[] args){
        int a;//定义一个变量a，变量a的类型是int

        //实例化
        Address sctu = new Address();//定义一个sctu,变量sctu的类型是Address
        sctu.country="China";
        sctu.province = "sichuan";
        sctu.street = "HonglingRoad";
        sctu.zipcode ="610100";

        sctu.printInfo();

    }

}

