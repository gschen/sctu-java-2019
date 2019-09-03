package week_01;

public class Test_2_9 {
    public static void main(String[] args) {
        int score=3;
        String str="不及格";
        if (score==5)
        {str="优秀";}
        else if (score==4)
        {str="良好";}
        else if (score==3)
        {str="中等";}
        else if (score==2)
        {str="及格";}
        System.out.println("成绩为"+str);

        switch(score)
        {
            case 5:
                str="优秀";
                break;
            case 4:
                str="良好";
                break;
            case 3:
                str="中等";
                break;
            case 2:
                str="及格";
                break;
            default:
                str="不及格";
                break;
        }
        System.out.println("成绩"+score+"的等级为"+str);
    }
}
