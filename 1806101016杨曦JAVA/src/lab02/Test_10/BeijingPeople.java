package lab02.Test_10;

public class BeijingPeople extends People{
    private int weight;
    private int height;
    public void speakHELLO(){
        System.out.println("你好");
    }
    public void averageHeight(){
        height=178;
        System.out.println("平均身高是："+height+"厘米");
    }
    public void averageWeight(){
        weight=70;
        System.out.println("平均体重是："+weight+"公斤");
    }
    public  void beijingOpera(){
        System.out.println("京剧");
    }

}
