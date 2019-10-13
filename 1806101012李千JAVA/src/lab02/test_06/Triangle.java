package lab02.test_06;

public class Triangle {
    double a,b,c,p;
    double S, C;
    boolean m ;


    public static void S(double a, double b, double c, double p, double S){
        p=(a+b+c)/2;
        S=p*(p-a)*(p-b)*(p-c);
    }
    public static void C(double a,double b,double c ,double C){
        C =a+b+c;
    }

    public static void main(String[] args) {

    }

}



