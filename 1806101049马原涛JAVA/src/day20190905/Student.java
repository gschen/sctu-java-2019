package day20190905;

public class Student
{

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
        Student one=new Student();
        one.setIf("马原涛","1806101049",89,93,81);
        one.getEvery();

    }
}
