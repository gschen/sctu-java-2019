package labor;

public class labor12 {
    public static void main(String[] args) {
        int x = 0;        //定义水仙花数的个数
        for(int i=1;i<=1000;i++){
            int b = i/100;        //取得百位数
            int s = (i-100*b)/10;        //取得十位数
            int g = (i-s*10-b*100);        //取得个位数

            if(i==g*g*g+s*s*s+b*b*b){
                x++;    //每次符合水仙花数条件，则x+1;
                System.out.print(i+" ");    //输出符合条件的数
            }
        }System.out.println();        //换行
        System.out.println("水仙花数总共有"+x+"个");    //输出水仙花数的总数
    }

}
