package lab02.Test_01;

public class Address {

        //属性
        //国家、省份、城市、街道、邮编。成员变量
        String country;
        String province;
        String city;
        String street;
        String zipcode;
        //行为；成员方法
        void  printlnfo(){
            System.out.println("国家："+this.country);
        }

        public static void main(String[] args) {
            int a;//定义了一个表变量a,变量a的类型是int\

            Address sctu = new Address();//定义一个sctu，变量sctu的类型是Address
            sctu.country = "china";
            sctu.province ="sichuan";
            sctu.city = "chengdu";
            sctu.street = "hongling";
            sctu.zipcode = "611110";

            sctu.printlnfo();

            //String sctucountry;
            // String sctuprovince;//驼峰命名
            //System println();
        }
    }

