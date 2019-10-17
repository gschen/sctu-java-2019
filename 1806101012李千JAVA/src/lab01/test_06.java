package lab_01;

public class test_06 {
    public static void main(String[] args) {
        int n;
        System.out.println("请输入一个数:");
        java.util.Scanner sc =new java.util.Scanner(System.in);//这是在网上查找的方法
        n= sc.nextInt();
        String str="";
        if (n>=90&&n<=100){
            str="优秀";
        }
        else if(n>=80&& n<=89){
            str="良好";
        }
        else if(n>=70&& n<=79){
            str="中等";
        }
        else if(n>=60&& n<=69){
            str="及格";
        }
        else if (n<60){
            str="不及格";
        }
        System.out.println("成绩为："+str);

    }
}
