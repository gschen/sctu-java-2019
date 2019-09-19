package lab02;

public class Test_09 {
    String xh;
    String bh;
    String xm;
    String xb;
    String nl;


    //成员方法
    void printInfo(){//打印
        System.out.println("学号:"+this.xh);//this.country下面赋的值
        System.out.println("班号："+this.bh);
        System.out.println("姓名："+this.xm);
        System.out.println("性别："+this.xb);
        System.out.println("年龄："+this.nl);
    }

    public static void main(String[] args) {
        int a;
        Test_09 sctu=new Test_09();//定义一个变量sctu,变量sctu的类型是TestAddress
        //new Address()实例化


        sctu.xh="1806xxx";
        sctu.bh="18xx";
        sctu.xm="xx";
        sctu.xb="女";
        sctu.nl="19";

        sctu.printInfo();//获取方法


    }

}