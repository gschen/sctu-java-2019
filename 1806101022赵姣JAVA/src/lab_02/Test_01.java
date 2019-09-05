package lab_02;

public class Test_01 {
    //属性
         String country;
         String province;
         String city;
         String street;
         String zipcode;

         //行为

        void printInfo(){
            System.out.println("国家："+this.country);
            System.out.println("省份："+this.province);
            System.out.println("城市："+this.city);
            System.out.println("街道："+this.street);
            System.out.println("邮编："+this.zipcode);
        }
        public static void main(String[] args) {
            int a;//定义变量a类型是int

            //实列化    new一个Test01
            Test_01 sctu=new Test_01();//定义一个变量sctu，变量类型是address
            sctu.country="中国";
            sctu.province="四川";
            sctu.city="成都";
            sctu.street="1223";
            sctu.zipcode="000000";

            sctu.printInfo();//获取
        }
    }
