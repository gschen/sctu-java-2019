package lab_02.day20190905.test_5;

public class Cube {
    Cube() {
        this.length = "9";
        this.wide = "5";
        this.height = "5";
    }
    String length;
    String wide;
    String height;

    void Cube(){
        System.out.println("长：" + this.length + "\n" + "宽：" + this.wide + "\n" + "高：" + this.height);
    }
    public static void main(String[] args) {
        Cube tian = new Cube();
        tian.Cube();
        int length=9;
        int wide=5;
        int height=5;
        System.out.println("体积："+length*wide*height);
    }
}
