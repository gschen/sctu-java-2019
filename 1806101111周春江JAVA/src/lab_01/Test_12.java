package lab_01;

public class Test_12 {
    public static void main(String[] args) {
        int b,s,g,num;
        System.out.println("水仙花数有：");
        for(num = 100;num < 1000; num ++){
            b=num%10;
            s=(num%100)/10;
            g=(num%1000)/100;
            if(num==b*b*b+s*s*s+g*g*g)
                System.out.println(num);
        }
    }

}
