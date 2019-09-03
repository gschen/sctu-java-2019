package lab_01;

public class Test_02 {
    public static void main(String[] args) {
        int i = 100;
        for(i=100;i<=300;i++){
            if(i%3==0){
                continue;
            }
            System.out.println("不能被3整除的数有："+(i));
        }
    }
}
//continue是跳出这个循环（在这一次循环什么都不做），继续下一个循环