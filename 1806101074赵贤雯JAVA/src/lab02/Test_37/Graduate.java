package lab02.Test_37;
//37、 	假定根据学生的3门学位课程的分数决定其是否可以拿到学位，对于本科生，如果3门课程的平均分数超过60分即表示通过，而对于研究生，则需要平均超过80分才能够通过。根据上述要求，请完成以下Java类的设计：
//3)	设计一个描述研究生的类Graduate，该类继承并扩展Student类。
public class Graduate extends Student{
    public Graduate(String name,int[] score) {
        super(name,score);
    }
    public void pass(){
        int sum= 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        if(sum/3>80){
            System.out.println("通过");
        }else {
            System.out.println("不通过");
        }
    }
}

