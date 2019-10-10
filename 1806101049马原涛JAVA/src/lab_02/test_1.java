package lab_02;

public class test_1
{
    public String country,province,city,street;
    public int code;

    public test_1
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
        test_1 oneAddress=new test_1("中国","四川省","成都市","红岭路",6106223);
        oneAddress.getAddress();
        oneAddress.getCode();
    }



}
