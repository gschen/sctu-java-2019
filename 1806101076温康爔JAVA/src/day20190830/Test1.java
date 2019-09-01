package day20190830;

public class Test1 {
    public static void main(String[] args) {
        int a=0;
        // ++ 自增
        a++;//a=a+1  =>  a+=1

        // -- 自减
        a--;//a=a-1  => a-=1

        int b=1;
        if (b>=0){
            System.out.println("b是正整数。");
        }
        else{
            System.out.println("b是负数。");
        }

        //0,1,2 -> A,B,C
        //分支结构 switch
        switch (b){
            case 1:
            System.out.println("A");
            break;
            default:
                System.out.println("error");
        }

        //循环结构 for，while,for while

    }
}
