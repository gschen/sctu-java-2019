package lab_02.Test_01;
/*1、 	编写并测试一个代表地址的类，包括以下的属性：国家、省份、城市、街道、邮编。*/
public class Address {
    String country;
    String province;
    String city;
    String street;
    String postcode;
    /*void asd(String cou ,String pro ,String cit ,String str ,String pos) {
        country = cou;
        province = pro;
        city = cit;
        street = str;
        postcode = pos;
    }*/

    public static void main(String[] args) {
        Address site = new Address();
//        Test_01 x =asd(2,1,1,1,1);
        site.country = "中国";
        site.province = "四川";
        site.city = "成都";
        site.street = "红岭路";
        site.postcode = "610100";
        System.out.println("country:" + site.country + "  province:"
                + site.province + "  city:" + site.city + "  street:"
                + site.street + "  Postcodes:" + site.postcode);
    }
}
