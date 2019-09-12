package lab02;
import com.sun.jdi.PathSearchingVirtualMachine;
public class Test_06 {
        public static class Triangle{
            double a,b,c;
            double C;

            double s;
            void t(){
                System.out.println("边长分别是:"+this.a+" "+this.b+" "+this.c+"周长是："+this.C+"  "+"面积是："+this.s);
                if (a+b>c){
                    System.out.println("True");
                }
                else if (a+c>b){
                    System.out.println("True");
                }
                else if (b+c>a){
                    System.out.println("True");
                }
                else{
                    System.out.println("False");
                }
            }
        }
        public static class  Ladder{
            double A,B,C,S;
            void mianji(){
                System.out.println("面积是："+((A+B)*C)/2);
            }
        }
        public static class circle{
            double r;
            double zhouchang;
            double mj;
            void fan(){
                System.out.println("周长是："+Math.PI*2+"面积是:"+Math.PI*r);
            }
        }

        public static void main(String[] args) {
            circle ci = new circle();
            ci.r = 3;
            ci.fan();
            Ladder la = new Ladder();
            la.C =5;
            la.A =4;
            la.B =3;
            la.mianji();
            Triangle tr = new Triangle();
            tr.a =6;
            tr.b =7;
            tr.a =8;
            tr.t();
        }

    }


