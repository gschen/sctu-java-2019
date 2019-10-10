package lab02.Test_37;
//2)	设计一个描述本科生的类Undergraduate，该类继承并扩展Student类。
public class Undergraduate extends Student{
    public Undergraduate(String name,int[] score) {
        super(name,score);
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
