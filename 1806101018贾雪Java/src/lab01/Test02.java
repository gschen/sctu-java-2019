package lab_01;

public class Test02 {
    public static void main(String[] args) {
        int n;
        for (n=100;n<=300;n++){
//            n=n+1;等同于n++
           if (n%30!=0){
               System.out.println(n);
           }
           continue;
        }
    }

}
