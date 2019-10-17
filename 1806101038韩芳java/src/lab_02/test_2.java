package lab_02;

public class test_2 {
    public float radiu;
    double area;
    double girth;
    public test_2(float radiu){this.radiu=radiu;System.out.println("半径为："+radiu);}
    public void setRadiu(float radiu){ this.radiu=radiu;}
    public  double getarea(){area=3.1*radiu*radiu;System.out.println("面积为："+area);return area;}
    public double getgirth(){girth=2*3.1*radiu;System.out.println("周长为："+girth);return girth;}

    public static void main(String[] args) {
        test_2 circleOne=new test_2(4);
        circleOne.getgirth();
        circleOne.getarea();
    }
}
