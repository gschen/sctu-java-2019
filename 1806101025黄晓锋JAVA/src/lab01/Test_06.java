package lab01;

public class Test_06 {
    public static void main(String[] args) {
        int score=88;
        String str="A级";
        if(score>=85)
            {str="A级";}
        else if (score>=70&&score<=84)
                {str="B级";}
            else if(score>=60&&score<=69)
                    {str="C级";}
                else
                        {str="D级";}
                System.out.println("成绩为"+str);
    }
}
