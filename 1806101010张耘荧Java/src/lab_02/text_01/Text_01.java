package lab_02.text_01;

public class Text_01 {
    public   static class Address{
        //定义成员变量
        String country;
        String province;
        String city;
        String street;
        String zipcode;

        //定义成员方法
        void printInfo(){
            System.out.println("国家是："+this.country);
        }
    }

    public static void main(String[] args) {
        //实例化
        //定义了一个变量，变量price的类型是Address
        Address sctu = new Address();
        sctu.country="china";
        sctu.province="四川";
        sctu.city="成都";
        sctu.street="红岭路";

        sctu.printInfo();

    }

}
