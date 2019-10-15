package lab_02.Test_13;

public class Gymnastics extends ComputerAverage{

    @Override
    double getAverage() {

        double arrary[] = {a,b,c,d};
        double max = arrary[0];
        for (int i = 0;i<arrary.length-1;i++){
            if (max > arrary[i+1]){
                max = arrary[i+1];
            }
        }
        double ma;
        ma = max;

        //这里获取最大值

        double mini = arrary[0];
        for (int i = 0;i<arrary.length-1;i++){
            if (
                    mini < arrary[i+1]
            ){
                mini = arrary [i+1];
            }
        }
        double mi;
        mi = mini;

        //获取mini


        return (a+b+c+d-ma-mi)/2;
    }

    public static void main(String[] args) {
        Gymnastics gymnastics = new Gymnastics();
        gymnastics.a = 99;
        gymnastics.b = 50;
        gymnastics.c = 61;
        gymnastics.d = 62;

        System.out.println(gymnastics.getAverage());


    }
}
