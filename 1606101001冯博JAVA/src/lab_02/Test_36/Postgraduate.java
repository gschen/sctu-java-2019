package lab_02.Test_36;

public class Postgraduate extends Student2 {
    public Postgraduate(String name,int[] grade) {
        this.grade = grade;
        this.name = name;
    }
    @Override
    void avg_grade() {
        super.category="研究生";
        int sum=0;
        for (int i = 0; i <3 ; i++) {
            sum=sum+grade[i];
        }
        if (sum/3<=100 && sum/3>90){
            System.out.println(name+"  "+category+"  优秀");
        }
        else if (sum/3<=90 &&sum/3>80){
            System.out.println(name+"  "+category+"  良好");
        }
        else if (sum/3<=80 && sum/3>70){
            System.out.println(name+"  "+category+"  一般");
        }
        else if (sum/3<=70 && sum/3>60){
            System.out.println(name+"  "+category+"  合格");
        }
        else {
            System.out.println(name+"  "+category+"  不合格");
        }
    }
}
