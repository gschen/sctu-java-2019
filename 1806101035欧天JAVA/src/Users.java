
public class Users {//ctrl+h ：找到继承类.
    //    Users() {
//        System.out.println("今天是个好天气");
//        this.name="小红";
//        this.hegiht="178cm";
//        this.width="65kg";
//        this.sex="男";
//        this.city ="石家庄";
//    }
//    //成员变量，属性
//    String name;
//    String hegiht;
//    String width;
//    String sex;
//    String city;
//    //非常特殊的函数。
//    //1)函数的名字与类的名字相同。2）函数没有返回值类型
//    void caozuo(){
//        System.out.println("姓名："+this.name);
//        System.out.println("身高："+this.hegiht);
//        System.out.println("性别："+this.sex);
//        System.out.println("体重："+this.width);
//        System.out.println("城市："+this.city);
//    }
//    public static void main(String[] args) {
//        Users user =new Users();
//        user.caozuo();//对象实例化
//        user.caozuo();
//    }
//
//}
    public static void main(String[] args) {
        Student student = new Student("1","2");
        System.out.println();
    }
}