package lab_01;

public class Test_02 {
    public static void main(String args[]){
        int n = 100,i,num = 0;
        for (i=1;i<=200;i++){
            num=(int)(n+i);
            if(num%3==0){

                continue;
            }
            else {
                System.out.println(num);
            }

        }
    }
}
