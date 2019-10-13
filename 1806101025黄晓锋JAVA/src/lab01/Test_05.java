package lab_01;

public class Test_05 {
    public static void main(String[] args) {
        int score=4;
        String str="良好";
        if(score>4)
            {str="优秀";}
        else if (score>3&&score<5)
                {str="良好";}
            else if(score>2&&score<4)
                    {str="中等";}
                else if(score>1&&score<3)
                        {str="及格";}
                    else
                            {str="不及格";}
        System.out.println("成绩为"+str);
    }
}