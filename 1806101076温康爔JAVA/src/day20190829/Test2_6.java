package day20190829;

public class Test2_6 {
    public static void main(String[] args) {
        int score=88;
        String str="不及格";
        if(score>=90&&score<=100)
              {str="优秀";}
        else if(score>=80&&score<=89)
                     {str="良好";}
                 else if(score>=70&&score<=79)
                             {str="中等";}
                     else if(score>=60&&score<=69)
                                   {str="及格";}
        System.out.println("成绩为"+str);
    }
}
