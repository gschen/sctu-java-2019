package lab_02;

public class Address {
    //1,属性：国家，省份，城市，街道，邮编。成员变量
    String country;
    String province;
    String city;
    String street;
    String zipcode;
    //2.行为，成员方法
    void printInfo(){
        System.out.println("国家："+this.country+"\n"+
                "省份："+this.province+"\n"+
                "城市："+this.city+"\n"+
                "街道："+this.street+"\n"+
                "邮编："+this.zipcode);
    }
    public static void main(String[] args) {
        int a;//定义一个变量a,变量a的类型是int
        //实例化
        Address sctu=new Address();//定义一个变量sctu，变量sctu的类型是Addtress
        sctu.country="China";
        sctu.province="Sichuan";
        sctu.city="Chengdu";
        sctu.street="Honglinglu";
        sctu.zipcode="610100";
        sctu.printInfo();
    }
}
