package lab_02.test_06;

public class Triangle {

    //属性
    public double s1,s2,s3,s,c;
    Boolean boo;

    //行为
    public Triangle(double a,double b,double c){
        s1=a;
        s2=b;
        s3=c;

        if(a+b>c && a+c>b && b+c>a){ boo=true; }
        else {boo=false;}
    }
    double getC() {
        if (boo) {
            c = s1 + s2 + s3;
            return c;
        }
        else {
            System.out.println("这不是一个三角形不能算周长");
            return 0;
        }
    }

    public double getS() {
        if (boo) {
            double p = (s1 + s2 + s3) / 2;
            s=Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));//引用函数math
            return s;
        }
        else {
            System.out.println("不能算面积");
            return 0;
        }
    }



}


