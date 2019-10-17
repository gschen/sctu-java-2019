package src.Practice.day20191017;

public class Test_01 {
    public static void main(String[] args) {
        for (int i = 0;i < 10;i ++){
            if (i == 5){
                try{
                    System.out.println(5/0);
                }catch (Exception e){
                    System.out.println(e);
                }

            }
            System.out.println("Complete Task No:" +i);
        }
    }
}
