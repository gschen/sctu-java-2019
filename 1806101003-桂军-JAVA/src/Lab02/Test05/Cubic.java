package Lab02.Test05;
//5、 	编程创建一个立方体类，在其中定义三个变量表示一个立方体的长、宽和高，
// 再定义一个方法对这三个变量进行初始化，然后定义一个方法求立方体的体积。
// 创建一个对象，求给定尺寸的立方体的体积。
public class Cubic {
        private double Height,Long,Width;
        void setDemo(double Height,double Long,double Width)
        {
            this.Height=Height;
            this.Long=Long;
            this.Width=Width;
        }
        //2。利用构造函数进行初始化
        void getVolume()
        {
            double v=Height*Width*Long;//体积计算公式
            System.out.println("该立方体的体积为："+v);
        }

    public static void main(String[] args) {
        Cubic cubic = new Cubic();
        cubic.Height = 5;
        cubic.Long = 10;
        cubic.Width = 10;
        cubic.getVolume();
    }
    }
