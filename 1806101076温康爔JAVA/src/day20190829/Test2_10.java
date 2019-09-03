package day20190829;

public class Test2_10 {
    public static void main(String[] args) {
        int n=0,i,num=0;
        for(i=1;i<=50;i++){
               num=(int)(Math.random()*100);

               if(num%5==0){
                   n=n+1;
                   continue;
               }
            System.out.println(num+"不能被5整除！！");
        }
        System.out.println("50个随机整数中被5整除的数的个数="+n);
    }


}
