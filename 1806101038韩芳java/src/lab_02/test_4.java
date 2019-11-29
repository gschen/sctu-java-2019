package lab_02;

public class test_4 {
    String name,idcode;
    float math,english,computer;
    void setIf(String name,String idcode,float math,float computer,float english)
    {
        this.name=name;
        this.idcode=idcode;
        this.math=math;
        this.english=english;
        this.computer=computer;
    }
    void getMath(){System.out.println("数学成绩为"+math);};
    void getEnglish(){System.out.println("英语成绩为"+english);};
    void getComputer(){System.out.println("计算机成绩为"+computer);};
    void getEvery(){System.out.println("姓名:"+name+" "+"学号"+idcode+" "+"数学："+math+" "+"计算机："+computer+" "+"英语"+english);}

    public static void main(String[] args) {
        test_4 one=new test_4();
        one.setIf("韩芳","1806101038",80,95,93);
        one.getEvery();

    }
}
