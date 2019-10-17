package Lab02.Test01;

public class Address {
    public static class Test01 {
        String country;
        String province;
        String city;
        String street;
        String post;

        void tell(){
            System.out.println(country+"\n"+province+"\n"+city+"\n"+street+"\n"+post);
        }
    }
    static class Getinformation{
        public static void main(String[] args) {

            Test01 add = new Test01();
            add.country = "china";
            add.province = "sichuan";
            add.city = "dazhou";
            add.street = "null";
            add.post = "636150";
            add.tell();

        }
    }


}
