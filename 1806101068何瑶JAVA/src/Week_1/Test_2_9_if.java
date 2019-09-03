package Week_1;

public class Test_2_9_if {
    public static void main(String[] args) {
        int score=1;
        String str="不及格";
        if (score==2)
        {str="及格";}
        else if (score==3)
        {str="中等";}
        else if (score==4)
        {str="良好";}
        else if (score==5)
        {str="优秀";}
        System.out.println("成绩为"+str);
    }
}
