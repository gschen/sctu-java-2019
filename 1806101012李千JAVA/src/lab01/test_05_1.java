package lab01;

public class test_05_1 {
    public static void main(String[] args) {
        int i;
        System.out.println("请输入一个数:");
        java.util.Scanner sc =new java.util.Scanner(System.in);//这是在网上查找的方法
        i= sc.nextInt();
        String str="";
        if(i==1){
            str="不及格";
        }
        else if(i==2){
            str="及格";
        }
        else if(i==3){
            str="中等";
        }
        else if(i==4){
            str="良好";
        }
        else if(i==5){
            str="优秀";

        }
        System.out.println("成绩为："+str);
    }
}
