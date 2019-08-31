package lab_01;

public class Test_02 {
    public static void main(String[] args) {
        System.out.println("这是100-300之间的不能被3整除的数:");
        for(int i=100;i<=300;i++){
            if(i%3==0){
                continue;
            }
            System.out.printf("%d",i);
        }
        System.out.println();
    }
}
