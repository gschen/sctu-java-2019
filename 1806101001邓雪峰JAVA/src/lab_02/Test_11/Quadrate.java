package lab_02.Test_11;

public class Quadrate  extends Rectangle{
    double diagonal(){
        return Math.sqrt(width*width+height*height);
    }

    @Override
    public void printMyWay() {
        super.printMyWay();

        System.out.println("对角线为："+diagonal());
    }

    public static void main(String[] args) {
        Quadrate quadrate = new Quadrate();
        quadrate.height = 2;
        quadrate.width = 2;

        quadrate.printMyWay();
    }
}
