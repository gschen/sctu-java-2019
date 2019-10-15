package lab_01;
/*请分别用 if-else 语句和 switch 语句编写能够实现以下功能的程序。
某同学某门课的成绩可能的结果为1，2，3，4，和5。
当成绩为1时请输出不及格；成绩为2时请输出及格；成绩为3时请输出中等；成绩为4时请输出良好；成绩为5时请输出优秀。*/

public class Test_05 {
    public static void main(String[] args) {
        int score = 3;
        String str = "不及格";
        if (score == 1) {
            str = "不及格";
        } else if (score == 2) {
            str = "及格";
        } else if (score == 3) {
            str = "中等";
        } else if (score == 4) {
            str = "良好";
        } else if (score == 5) {
            str = "优秀";
        }
        System.out.println(str);
    }
}

