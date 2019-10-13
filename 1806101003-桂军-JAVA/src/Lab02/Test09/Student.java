package Lab02.Test09;
//9、 	编写一个Java程序片断，以定义一个表示学生的类Student。这个类的属性有“学号”、“班号”、“姓名”、“性别”、“年龄”，方法有“获得学号”、“获得班号”、“获得性别”、“获得姓名”、“获得年龄”、“获得年龄”。为类Student增加一个方法public String toString( )，该方法把Student类的对象的所有属性信息组合成一个字符串以便输出显示。
public class Student {
    String sno;
    String cno;
    String sname;
    String ssex;
    int sage;
    public Student(String sno,String cno,String sname,String ssex,int sage){
        this.sno = sno;
        this.cno = cno;
        this.sname = sname;
        this.ssex = ssex;
        this.sage = sage;
    }
    @Override
    public String toString(){
        return "Student{" + "sno='" + sno + '\'' + ", cno='" + cno + '\'' + ", sname='" + sname + '\'' + ", ssex='" + ssex + '\'' + ", sage=" + sage + '}';

    }
}
