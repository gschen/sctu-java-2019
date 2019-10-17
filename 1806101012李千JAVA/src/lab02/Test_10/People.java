package lab02.Test_10;

public class People {
     class ChinaPeople{
         String name;
         String color;

         void setName(){
             System.out.println("姓名：li");
         }
         void setColor(){
             System.out.println("肤色：黄");
         }

     }
     static class AmJericanPeople{
         void setName(){
             System.out.println("姓名：li");
         }
         void setColor(){
             System.out.println("肤色：黄");
         }

     }
     static class BeiJingPeople{

         void setName(){
             System.out.println("姓名：li");
         }
         void setColor(){
             System.out.println("肤色：黄");
         }

     }

    public static void main(String[] args) {
         AmJericanPeople first=new AmJericanPeople();
         first.setName();
         first.setColor();
         BeiJingPeople two = new BeiJingPeople();
         two.setName();
         two.setColor();

    }
}
