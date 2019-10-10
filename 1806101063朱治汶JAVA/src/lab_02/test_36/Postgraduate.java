package lab_02.test_36;

public class Postgraduate extends Student {

    public Postgraduate(String name,String rank, double a,double b,double c ){

        this.rank = rank;
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double average1() {
        return (a+b+c)/3;
    }

    @Override
    void average() {
        if (average1()>=90) System.out.println(name+" "+rank+" "+"优秀");
        if (average1()>=80 && average1() < 90) System.out.println(name+" "+rank+" "+"良好");
        if (average1()>=70 && average1() <80) System.out.println(name+" "+rank+" "+"一般");
        if (average1()>=60 && average1() < 70) System.out.println(name+" "+rank+" "+"及格");
        if (average1()<60) System.out.println(name+" "+rank+" "+"不及格");
    }
}
