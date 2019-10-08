package lab_02.test_10;

public class ChinaPeople extends People {
    protected String weight,height,panda;

    public  void speakHello(){
        System.out.println("喂，你去干嘛呀");
    }
    public void averageHeight(){
        height="168.78cm";
        System.out.println("中国人平均身高："+height);
    }
    public  void averageWeight(){
        weight="65kg";
        System.out.println("中国人平均体重："+weight);
    }
    public void chinaPanda(){
        panda="熊猫";
        System.out.println("中国国宝："+panda);
    }
}
