package practice.gouzao;

public class People {
    double height;
    int age;
    int sex;

    //构造函数 初始化了所有属性
    public People(double h, int a, int s){
        this.height = h;
        this.age = a;
        this.sex = s;
        System.out.println(this.height+"\n"+this.age+"\n"+this.sex+"\n");
    }

    public static void main(String[] args) {
        //创建对象 调用我们自己定义的有参构造方法
        People p1= new People(168,21,1);
    }
}
