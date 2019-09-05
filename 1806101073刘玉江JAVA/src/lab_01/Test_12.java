package lab_01;

public class Test_12 {
    public static void main(String[] args){

        for (int i = 100;i <=999;i++ ){
            int x = i / 100;
            int y = (i % 100) /10;
            int z = i %10;

            if (i == x*x*x +y*y*y +z*z*z){
                System.out.print(i +",");
                System.out.print(x+",");
                System.out.print(y+",");
                System.out.println(z+",");
            }
        }
    }
}
