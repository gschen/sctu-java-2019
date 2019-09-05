package lab_02;

//import com.sun.java.util.jar.pack.ConstantPool;

public class Test_03 {
    static class Students{
        private int computer;
        private int math;
        private int English;
        private int all;
        private int average;
        private int top;
        private int low;
        public Students(int computer, int math, int English){
            this.computer = computer;
            this.math = math;
            this.English = English;
            this.all = computer+math+English;
            this.average = (computer+math+English)/3;
            this.top =top(computer,math,English);
            this.low = lou(computer,math,English);
        }
        public void print(){
            System.out.println("总成绩为："+this.all+"数学："+this.math+"计算机："+this.computer+"英语："+this.English+"平均成绩："+this.average+"最高成绩："+this.top+"最低成绩："+this.low);
        }
    }
    static int top(int a,int b,int c){
        if (a>b&a>c){
            return a;
        }else if (b>a&b>c){
            return b;
        }else{
            return c;
        }

    }
    static int lou(int a,int b,int c){
        if (a<b&a<c){
            return a;
        }else if (b<a&b<c){
            return b;
        }else{
            return c;
        }

    }

    public static void main(String[] args) {
        Students a =new Students(98,95,90);
        a.print();
    }


}
