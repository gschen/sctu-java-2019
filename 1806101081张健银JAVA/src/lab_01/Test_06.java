package lab_01;

import java.util.Scanner;

//6、	编程输入学生的学习成绩的等级，给出相应的成绩范围。设A级为85分以上（包括85）；B级为70分以上（包括70分）；C级为60分以上（包括60分）；D级为60分以下。
public class Test_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入学生成绩等级（要求大写）：");

        String b =input.nextLine();

        char a=b.charAt(0);

        if (a=='A')
        {
            System.out.println("学生的学习成绩范围为a>=85 && a<=100");
        } else if (a=='B') {
            System.out.println("学生的学习成绩范围为a>=70");
        } else if (a=='C') {
            System.out.println("学生的学习成绩范围为a>=60");
        } else if (a=='D') {
            System.out.println("学生的学习成绩范围为a>=0 && a<60");
        } else{
            System.out.println("输入错误");
        }

    }

}

class Test_06s {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("请输入学生成绩等级（要求大写）：");

        String b = input.nextLine();

        char a = b.charAt(0);

        switch (a) {

            case 'A':

                System.out.println("学生的学习成绩范围为a>=85 && a<=100");
                break;

            case 'B':

                System.out.println("学生的学习成绩范围为a>=70");
                break;

            case 'C':

                System.out.println("学生的学习成绩范围为a>=60");
                break;
        }
    }
}
