package lab_01;

public class Test_12 {
    public static void main(String[] args) {
        int x = 0;
        for(int i=1;i<=1000;i++){
            int b = i/100;
            int s = (i-100*b)/10;
            int g = (i-s*10-b*100);

            if(i==g*g*g+s*s*s+b*b*b){
                x++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("水仙花数总共有"+x+"个");
    }
}

