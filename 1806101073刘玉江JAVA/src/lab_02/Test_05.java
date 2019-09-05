package lab_02;

public class Test_05 {
    static class Cube{
        private double lenth;
        private double width;
        private double height;
        private double volume;
        public Cube(double lenth,double width,double height){
            this.lenth = lenth;
            this.width = width;
            this.height = height;
            this.volume = lenth*width*height;

        }
        public void print(){
            System.out.println("体积为："+volume);
        }

    }

    public static void main(String[] args) {
        Cube a = new Cube(3,5,8);
        a.print();
    }
}
