package lab_01;

public class Text01 {
    public static void main(String args[]){
        int i=100;
        for(i=100;i<=300;i++){
            if(i%3!=0){
                continue;
            }
        System.out.println("100~300间不能被3整除的数\n"+(i-1));
        }
    }
}