package lab_02;
class Test_37 {
    public String name;
    public double a,b,c;
    public double average;
    int status;
}
class Undergraduate1 extends Test_37{
    Undergraduate1(String s,double a,double b,double c){
        this.name=s;
        this.a=a;
        this.b=b;
        this.c=c;
        this.average=(a+b+c)/3;
    }
    public void Display(){
        if (this.average>=60)
            status=1;
        else status=0;
        if (status==1)
        System.out.println(name+"通过！");
        if (status==0)
        System.out.println(name+"不通过！");
    }
}
class Graduate1 extends Test_37{
    Graduate1(String s,double a,double b,double c){
        this.name=s;
        this.a=a;
        this.b=b;
        this.c=c;
        this.average=(a+b+c)/3;
    }
    public void Display(){
        if (this.average>=80)
            status=1;
        else status=0;
        if (status==1)
            System.out.println(name+"通过！");
        if (status==0)
            System.out.println(name+"不通过！");
    }
}
class StudentDemo{
    public static void main(String[] args) {
        Undergraduate1 st1=new Undergraduate1("张三",50,70,60);
        st1.Display();
        Graduate1 st2=new Graduate1("李四",80,70,90);
        st2.Display();
    }
}