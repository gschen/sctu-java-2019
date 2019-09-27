package lab02.Test_10;

public class Text {
    public static void main(String[] args) {
        ChinaPeople cp = new ChinaPeople();
        cp.speakHELLO();
        cp.averageHeight();
        cp.averageWeight();
        cp.chinaGongfu();
        AmJericanPeople ap = new AmJericanPeople();
        ap.speakHELLO();
        ap.averageHeight();
        ap.averageWeight();
        ap.amjericanBoxing();
        BeijingPeople bp=new BeijingPeople();
        bp.averageHeight();
        bp.averageWeight();
        bp.speakHELLO();
        bp.beijingOpera();
    }
}