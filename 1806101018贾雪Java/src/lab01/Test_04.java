package lab01;

public class Test_04 {
    public static void main (String[] args){
        //因为不知道怎么表示变量，不确定变量n，所以采取随机数
        int n=(int)(Math.random()*100);
        System.out.println("for循环下的求解结果="+sum1(n));
        System.out.println("while循环下的求解结果="+sum2(n));
        System.out.println("do while循环下的求解结果="+sum3(n));
// for循环演示：
    }
    public static long sum1(int n){
        int i=0;
        long sum=0;
        for(i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    //while循环额演示：
    public static long sum2(int n){
        int i=0;
        long sum=0;
        while(i<=n) {
            sum=sum+i;
            i=i+1;
        }
        return sum;
    }
    //do while循环演示：
    public static long sum3(int n){
        int i=0;
        long sum=0;
        do{
            sum=sum+i;
            i=i+1;
        }
        while (i<=n);
        return sum;
    }
}
