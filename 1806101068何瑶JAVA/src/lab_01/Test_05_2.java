package lab_01;

public class Test_05_2 {
    public static void main(String[] args) {
        int score=3;
        String str="";
        switch (score){
            case 2:
                str="及格";
                break;
            case 3:
                str="中等";
                break;
            case 4:
                str="良好";
                break;
            case 5:
                str="优秀";
                break;
            default:
                str="不及格";
                break;
        }
        System.out.println("成绩"+score+"的等级为"+str);
    }
}
