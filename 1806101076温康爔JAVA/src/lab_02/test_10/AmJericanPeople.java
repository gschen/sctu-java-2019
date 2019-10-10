package lab_02.test_10;

public class AmJericanPeople extends People {
    protected String weight,height,sport;
    public  void speakHello(){
        System.out.println("How do you do?");
    }
    public void averageHeight(){
        height="180cm";
        System.out.println("average height:"+height);
    }
    public  void averageWeight(){
        weight="80kg";
        System.out.println("average weight:"+weight);
    }
    public void americanSport(){
        sport="basketball";
        System.out.println("americansport:"+sport);
    }
}
