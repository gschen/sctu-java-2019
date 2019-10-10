package lab_02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Trangle {

        double sideA, sideB, sideC, area, length;
        boolean boo;

       public Trangle( double a, double b, double c){
            sideA = a;
            sideB = b;
            sideC = c;
            if ((sideA + sideB) > sideC || (sideA + sideC) > sideB || (sideB + sideC > sideA)) {
                boo = true;
            } else {
                boo = false;
            }
        }

        public double getLength () {
            double length = sideA + sideB + sideC;
            return length;
        }

        public double getArea () {
            if (boo) {
                double p = (sideA + sideB + sideC) / 2.0;
                area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
                return area;
            } else {
                System.out.println("这不是一个三角形，不能计算面积");
                return 0;
            }
        }

    public static void main(String[] args) {
        Trangle trangle = new Trangle(3, 4, 5);
        trangle.getLength();
        System.out.println("三角形的周长："+trangle.getLength());
        trangle.getArea();
        System.out.println("三角形的面积："+trangle.getArea());

    }
    }
