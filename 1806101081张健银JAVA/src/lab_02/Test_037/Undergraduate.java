package lab_02.Test_037;

public class Undergraduate extends Student{
    public Undergraduate(String name,int age,int[] score) {
        super(name,age,score);
    }
    public void pass(){
        int sum= 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        if(sum/3>60){
            System.out.println("通过");
        }else {
            System.out.println("不通过");
        }
    }

}
