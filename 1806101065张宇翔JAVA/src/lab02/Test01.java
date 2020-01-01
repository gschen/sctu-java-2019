package lab02;

public class Test01 {

            String country;
            String province;
            String city;
            String street;
            String zipcode;

            void printInfo() {                //无返回值调用函数，仅输出而不赋值，需先声明
                System.out.println("国家： " + this.country);
                System.out.println("省份： " + this.province);
                System.out.println("城市: " + this.city);
                System.out.println("街道: " + this.street);
                System.out.println("邮政: " + this.zipcode);
            }

            public static void main(String[] args) {
                Test01 sctu = new Test01();
                sctu.country = "China";
                sctu.province = "Sichuan";
                sctu.city = "Chengdu";
                sctu.street = "longquanyi";
                sctu.zipcode = "610100";

                sctu.printInfo();
            }
        }


