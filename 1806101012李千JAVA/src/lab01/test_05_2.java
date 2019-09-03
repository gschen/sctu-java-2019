package lab01;

public class test_05_2 {

    public static void main(String[] args) {
       int i;
        System.out.println("请输入一个数:");
        java.util.Scanner sc =new java.util.Scanner(System.in);//这是在网上查找的方法
        i= sc.nextInt();
        String str="";
        switch (i)
        {
            case 1:

                str="不及格";
                break;
            case  2:

                str="及格";
                break;
            case  3:

                str="中等";
                break;
            case  4:

                str="良好";
                break;
            case  5:

                str="优秀";
                break;

        }

        System.out.println("成绩为"+str);
    }
}

