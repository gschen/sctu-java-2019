package lab02.Test_10;

public class AmJericanPeople extends People {
    private int weight;
    private int height;
    public void speakHELLO(){
        System.out.println("hello");

    }
    public void averageHeight(){
        height=178;
        System.out.println("American average height is："+height);
    }
    public void averageWeight(){
        weight=70;
        System.out.println("American average weight is："+weight);
    }
    public  void amjericanBoxing(){
        System.out.println("直拳，勾拳");
    }
}
