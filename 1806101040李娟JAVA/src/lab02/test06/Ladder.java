package lab02.test06;

//2)	Ladder类具有类型double的上底、下底、高、面积属性，具有返回面积的功能

public class Ladder {

    double shangdi;
    double xiadi;
    double height;

    double ladArea(){
        return ((this.shangdi + this.xiadi) * this.height)/2;
    }

    public static void main(String[] args) {
        Ladder l1= new Ladder();

        l1.shangdi=4;
        l1.xiadi=6;
        l1.height=2;

        l1.ladArea();  //访问方法

        System.out.println(l1.ladArea());
    }
}
