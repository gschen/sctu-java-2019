package lab_02.Test_06;

public class Ladder {
     double upperBase;
     double bottomBase;
     double height;

     double area(){
         return (upperBase+bottomBase)*height/2;
     }

    public static void main(String[] args) {
         Ladder ladder =new Ladder();
         ladder.height = 2;
         ladder.upperBase = 2;
         ladder.bottomBase = 2;

         System.out.println("面积为："+ladder.area());
    }
}
