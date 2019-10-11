//定义一个Ladder类用来刻画“梯形”，要求：Ladder类具有类型为double的上底、下底、高、面积属性，具有返回面积的功能。
//基本思路：
//根据题意要求，我们需要写一个Ladder类，这个类中有变量高、上底、下底，设置set方法和get方法来设置和得到该程序的变量，然后设计一个方法来计算面积，最后在主方法中实例化一个对象，用对象调用面积方法。


package Lab02.Test06;

public class Ladder {

        private double shangdi,xiadi,gao;
        public Ladder(double shangdi,double xiadi,double gao){
            this.shangdi=shangdi;
            this.xiadi=xiadi;
            this.gao=gao;

        }
        public void setSangdi(double shangdi){
            this.shangdi=shangdi;
        }
        public double getShangdi(){
            return shangdi;
        }
        public void setXiadi(double b){
            this.xiadi=xiadi;
        }
        public double getXiadi(){
            return xiadi;
        }
        public void setGao(double h){
            this.gao=gao;
        }
        public double getGao(){
            return gao;
        }
        public void area(){
            double s=0;
            s=(shangdi+xiadi)*gao/2;
            System.out.println("梯形上底，下底，高,为："+shangdi+" "+xiadi+" "+gao);
            System.out.println("梯形面积为："+s);
        }
        public static void main(String[] args) {
            Ladder Ladder=new Ladder(4,8,5);
            Ladder.area();
        }



}
