package labor02.test.Test_03;

public class Test_03 {
    static int sum(int computer,int math,int english){
        int s = computer+math+english;
        return s;
    };
    static float average(int computer,int math,int english){
        float s =(computer+math+english)/3;
        return s;
    };
    static double max(double coumputer,double math,double english){
        double m = 0;
        if (m<coumputer){
            m = coumputer;
        };
        if(m<math){
            m = math;
        };
        if (m<english){
            m = english;
        }

        return m;
    }
    static double min(double computer,double math,double english){
        double n =computer;

        if(n>math){
            n = math;
        };
        if (n>english){
            n = english;
        }
        return n;
    }

    public static void main(String[] args) {
        int s =sum(100,100,100);
        System.out.println("总分为："+s);
        float a = average(100,100,100);
        System.out.println("平均分为："+a);
        double m = max(85,87,82);
        System.out.println("最大值为："+m);
        double n = min(99,94,92);
        System.out.println("最小值为："+n);
    }}