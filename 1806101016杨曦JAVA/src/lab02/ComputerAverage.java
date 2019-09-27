package lab02;

import java.util.Scanner;

public abstract class ComputerAverage {

  abstract double average(int a,double []data);
  }
 class Gymnastics extends ComputerAverage{
private double avg,max=0,sum=0;
 Gymnastics(){
            }
 double average(int a,double []data){
             double min=data[0];//最开始我把min的初值也定义为0,但是如果一组数的最小值比0大,那永远min=0,没有意义.所以把min定为首元素值
             for(int i=0;i<a;i++){
                 if(data[i]>max)//找出最大值
                    max=data[i];
                 if(data[i]<min)//找出最小值
                     min=data[i];
                 sum+=data[i];
                 }
             avg=(sum-max-min)/(a-2);
             return avg;
             }
 }
 class School extends ComputerAverage{
 private double sum,avg;
School(){
             }
 double average(int a,double []data){
            for(int i=0;i<a;i++)
                 sum+=data[i];
             avg=sum/a;
            return avg;
             }
 }
 class Test5_1 {
 private static Scanner input;
 public static void main(String args[]){
             int a;
           input=new Scanner(System.in);
            System.out.println("Please enter the number of subjects:");
            a=input.nextInt();
             double data[] = new double[a];
            System.out.println("Please enter grade:");
             for(int i=0;i<a;i++)
                 data[i]=input.nextDouble();
             ComputerAverage avg;
             avg=new Gymnastics();
             System.out.println(avg.average(a,data));
             avg=new School();//方法的多态:运行时根据具体对象类型决定函数调用
             System.out.println(avg.average(a,data));
           }
 }

