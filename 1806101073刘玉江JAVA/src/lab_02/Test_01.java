package lab_02;

public class Test_01 {

    static class Address {
        private String nation, province, city, street, code;

        public Address(String nation, String province, String city, String street, String code) {

            this.nation = nation;
            this.province = province;
            this.city = city;
            this.street = street;
            this.code = code;
        }

        public void print() {
            System.out.println("地址信息为：" + this.nation + this.province + this.city + this.street + "邮政编码为：" + this.code);
        }

    }


        public static void main(String[] args) {
            Address a = new Address("中国","四川省","成都市","红岭路","111111");
            a.print();
        }

}

