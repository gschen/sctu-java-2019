package lab02.Test_06;
// 2)	Ladder类具有类型double的上底、下底、高、面积属性，具有返回面积的功能。
public class Ladder {
    double top;
    double bot;
    double hei;
    double s;
    public Ladder(double top,double bot,double hei,double s){
        this.top = top;
        this.bot = bot;
        this.s = (top + bot) * hei / 2;
    }
    @Override
    public String toString(){
        return  "Ladder{" + "top=" + top + ", bot=" + bot + ", hei=" + hei + ", s=" + s + '}'; }
}

class Mian2{
    public static void main(String[] args) {
        Ladder ladder = new Ladder(1,1,1,1);
        System.out.println(ladder);

    }
}



