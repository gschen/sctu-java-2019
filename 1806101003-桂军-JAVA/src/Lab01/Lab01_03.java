package Lab01;

public class Lab01_03 {
    public static void main(String[] args) {
        System.out.println("break语句实现从1数到100，遇到78时终止：");
        for(int i=1;i<=100;i++){
            System.out.printf("%d ",i);
            if(i==78) break;
        }
    }
}
