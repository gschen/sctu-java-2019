package day20191017;

public class Test01 {
    public static void main(String[] args) {
        for (int i = 0 ; i < 100; i++){
            if(i == 50){
                try{
                    System.out.println(i / 0);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
