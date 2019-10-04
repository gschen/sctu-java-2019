package week_01;

//编写一个Java程序求解下列方程的解2x^3-4x^2+3x-6=0

import org.jcp.xml.dsig.internal.dom.ApacheNodeSetData;

import java.util.Scanner;

public class Test_2_13 {
    private static final double PRE=1e-8;
    private static double y(double x){
    return 2.0*Math.pow(x,3)-4.0*Math.pow(x,2)+3.0*x-6;
    }

    public static void main(String[] args) {
        for(double l=Integer.MIN_VALUE,r=Integer.MAX_VALUE;r-l>PRE;)
        {
            final double m=(l+r)/2;
            final double mv=y(m);

            if(mv>PRE)
            {
                r=m;
            }
            else if(mv<-PRE)
            {
                l=m;
            }
            else
            {
                System.out.println(m);
                break;
            }
        }
    }
}


