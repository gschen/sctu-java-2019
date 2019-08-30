package lab_01;

public class Test_05_2 {
    public static void main(String[] args) {
        int score=1,n=0;
        String str="";
        n=score*2;
        switch (n){
            case 4:
                str="及格";
                break;
            case 6:
                str="中等";
                break;
            case 8:
                str="良好";
                break;
            case 10:
                str="优秀";
                break;
            default:
                str="不及格";
                break;
        }
        System.out.println("成绩"+score+"的等级为"+str);
    }
}
