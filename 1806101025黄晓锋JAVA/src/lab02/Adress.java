package lab02;

public class Adress {
    String country;
    String province;
    String city;
    String street;
    String zipcode;

    void print(){
        System.out.println("国家:" + this.country + "省份" + this.province + "城市" + this.city + "街道" + this.street + " " + "邮编:" + this.zipcode);
    }

    public static void main(String[] args) {
        Adress adress = new Adress();
        adress.country = "中国";
        adress.province = "四川";
        adress.city = "成都";
        adress.street = "红岭路";
        adress.zipcode = "610100";

        adress.print();
    }

}


