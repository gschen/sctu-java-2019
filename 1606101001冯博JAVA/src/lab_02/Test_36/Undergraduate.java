package lab_02.Test_36;

public class Undergraduate extends Student2 {
            public Undergraduate(String name,int[] grade){
            this.grade=grade;
            this.category=category;
            this.name=name;
    }

    @Override
    void avg_grade() {
        super.category="本科生";
        int sum=0;
        for (int i = 0; i <3 ; i++) {
            sum=sum+grade[i];
        }
        if (sum/3<=100 && sum/3>80){
            System.out.println(name+"  "+category+"  优秀");
        }
        else if (sum/3<=80 &&sum/3>70){
            System.out.println(name+"  "+category+"  良好");
        }
        else if (sum/3<=70 && sum/3>60){
            System.out.println(name+"  "+category+"  一般");
        }
        else if (sum/3<=60 && sum/3>50){
            System.out.println(name+"  "+category+"  合格");
        }
        else {
            System.out.println(name+"  "+category+"  不合格");
        }
    }
}
