package lab_02;

public class Test_05 {
    double length;
    double wide;
    double height;
    double volume(){
        return length*wide*height;
    }

    public static void main(String[] args) {
        Test_05 cuboid = new Test_05();
        cuboid.height =13;
        cuboid.wide =13;
        cuboid.length =13;

        System.out.println(cuboid.volume());
    }
}
