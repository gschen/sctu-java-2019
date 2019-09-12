package lab02;

public class Address {
    //属性
    String country;//国家
    int  postcode;//邮编
    String street;//街道
    String  province;//省份
    String city;//城市；
    //行为，成员变量
    void printInfo(){
        System.out.println("国家："+this.city);
    }
//    void self(){
//        System.out.println("以下是一个地址：");
//    }


    public static void main(String[] args) {
        //实例化
        Address a=new Address();
        a.city="中国";
        a.country="绵阳";
        a.province="四川";
        a.street="东宣";
        a.postcode=62100;
        a.printInfo();
        System.out.println("国家为："+ a.city+"\n"+"省份为："+a.province+"\n"+"城市为："+a.country+"\n"+"街道为："+a.street+"\n"+"邮编为："+a.postcode);

    }
}
