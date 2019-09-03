package lab01;
/*6、	编程输入学生的学习成绩的等级，给出相应的成绩范围。
设A级为85分以上（包括85）；B级为70分以上（包括70分）；C级为60分以上（包括60分）；D级为60分以下。*/
public class Test_06 {
    public static void main(String[] args) {
        int score = 82;
        String str = "A级";
        if (score>=85){
            str = "A级";
        }else if (score>=70&&score<85){
            str = "B级";
        }else if (score>=60&&score<70){
                str = "C级";
        }else if (score<60){
            str = "D级";
        }
        System.out.println("分数"+score+"的等级为"+str);


    }
}


