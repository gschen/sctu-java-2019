//3)Circle类具有类型为double的半径、周长和面积属性，具有返回周长、面积的功能3)	Circle类具有类型为double的半径、周长和面积属性，具有返回周长、面积的功能

package Lab02.Test06;

public class Circle {

        private double r;
        public Circle(double r){
            this.r=r;
        }
        public void set_r(double r){
            this.r=r;
        }
        public double get_r(){
            return r;
        }
        public void area(){
            double s=0;
            s=3.14*r*r;
            System.out.println("圆半径长为："+r);
            System.out.println("圆面积为："+s);
        }
        public void circum(){
            double c=0;
            c=2*3.14*r;
            System.out.println("圆半径长为："+r);
            System.out.println("圆周长为："+c);
        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Circle ci=new Circle(1);
            ci.area();
            ci.circum();
        }




}
