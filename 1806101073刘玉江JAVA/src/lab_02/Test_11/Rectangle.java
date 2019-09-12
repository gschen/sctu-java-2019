package lab_02.Test_11;
class Rectangle implements Printx {         //定义矩形类
    double lenth;
    double width;
    Rectangle(double x,double y){
        lenth = x;
        width = y;
    }


    public void printMyWay(){               //实现printMyWay方法
        System.out.println("边长分别为:"+lenth+","+width);
        System.out.println("面积为："+lenth*width);
        System.out.println("周长为："+(lenth+width)*2);
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle(8,5);
        a.printMyWay();
    }


}
