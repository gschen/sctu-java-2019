package lab_01;

public class Text_02 {
    public static void main(String[] args) {
        int n=0,num=0;
        for (int i = 1; i <=200 ; i++) {
            num=(int)(Math.random()*100+200);
            if (num%3==0){
                n=n+1;
                continue;
            }
            else{
                System.out.println("不能被3整除的数有"+num);
            }
        }
    }
}
