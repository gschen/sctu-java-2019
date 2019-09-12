package lab_02;

public class Test_10 {
    static class People{
         void color(){
             System.out.println("color:yellow");
         }
     }
    static class ChinaPeople extends People{
         void color(){
             System.out.println("chinapeoplecolor:yellow");
         }
         void eatTest(){
             this.color();
             super.color();
         }
    }

    public static void main(String[] args) {
        People a = new People();
        a.color();
        ChinaPeople d = new ChinaPeople();
        d.eatTest();

    }
}
