package day20190905;

public class Address
{
    public String country,province,city,street;
    public int code;

    public Address
            (
            String country,String province,String city,String street,int code
            )
            {
                this.country=country;
                this.province=province;
                this.city=city;
                this.street=street;
                this.code=code;
            };
    public void set
            (
                    String country,String province,String city,String street
            )
            {
                this.country=country;
                this.province=province;
                this.city=city;
                this.street=street;
                this.code=code;

            }
    public String getAddress(){
        System.out.println("地址是："+country+province+city+street);
        String ads=country+province+city+street;

        return ads;
    };
    public int getCode(){
        System.out.println("邮编是："+code);
        return code;
    };

    public static void main(String[] args) {
        Address oneAddress=new Address("中国","四川省","成都市","红岭路",6106223);
        oneAddress.getAddress();
        oneAddress.getCode();
    }



}
