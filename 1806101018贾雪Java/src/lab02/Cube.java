package lab02;
import java.util.Scanner;
public class Cube {
   int height;
    int width;
    int longs;

    public int  volume(){
     return height*width*longs;
    }
    public void printInfo(){
        System.out.println("立方体的体积为："+volume());
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLongs(int longs) {
        this.longs = longs;
    }

    public static void main(String[] args) {
        Cube c=new Cube();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入高：");
        c.setHeight(Integer.parseInt(input.next()));
        System.out.println("请输入长");
        c.setLongs(Integer.parseInt(input.next()));
        System.out.println("请输入宽");
        c.setWidth(Integer.parseInt(input.next()));
        c.printInfo();

    }

}
