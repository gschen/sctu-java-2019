package lab02.Test_11;

public class test {
    public static void main(String[] args) {
        Rectangle a=new Rectangle(10,12);
        a.printMyWay();
    }
}

class Rectangle implements Printx{
    double width;
    double high;
    double area;
    double zc;
    Rectangle(double width,double high){
        this.width=width;
        this.high=high;
    }
    double getArea(){
        area=width*high;
        return area;
    }
    double getZc(){
        zc=2*(width+high);
        return zc;
    }
    public void printMyWay(){

        System.out.println("宽："+width+"   高："+high+"   面积："+getArea()+"   周长："+getZc());
    }
}

