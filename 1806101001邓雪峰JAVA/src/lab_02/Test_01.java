package lab_02;

public class Test_01 {
    String country;
    String provice;
    String city;
    String street;
    String postcode;

    public static void main(String[] args) {
        Test_01 address = new Test_01();
        address.country = "China";
        address.provice = "sc";
        address.city = "cd";
        address.street = "hongling";
        address.postcode = "4093";

        System.out.println(address.country+address.provice+address.city+address.street+address.postcode);
    }
}

