package lab01;

public class test_02 {
    public static void main(String []args) {
        int i=100;
        for(i=100;i<=300;i++){
            if(i%3==0){
                continue;
            }
         System.out.println("100-300之间的不能被3整除的数:"+i);

        }

    }
}
