package day20190919;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
class test_7{

    public static void main(String[] args) {
        Student a=new Student("马原涛","19","510522200008049824");
        a.gervalues();
    }
}

class Student{
     String name;
     String age;
     String id;
    String[] args;
    List<String> strlist=new ArrayList<String>();
    Student(String name, String age, String id){
        this.name=name;
        this.age=age;
        this.id=id;
    };
    List<String> gervalues(){

        strlist.add(name);
        strlist.add(age);
        strlist.add(id);
        System.out.println("姓名："+name+"   年龄："+age+"   身份证号："+id);
        return strlist;
    };
}

