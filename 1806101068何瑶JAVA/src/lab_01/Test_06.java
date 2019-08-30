package lab_01;

public class Test_06 {
    public static void main(String[] args) {
        int score=88,n=0;
        String str="D级";
        if (score>=70){
            str="A级";
        }
        else if (score>=70&&score<80)
        {str="B级";}
        else if (score>=60&&score<70)
        {str="C级";}
        System.out.println("成绩为"+score+"的等级为"+str);
    }
}
