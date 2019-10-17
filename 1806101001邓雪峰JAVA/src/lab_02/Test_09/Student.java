package lab_02.Test_09;



public class Student {
    String name;
    String number;
    String Class;
    String sex;
    String age;

    String theName(){
        return name;
    }
    String theNumber(){
        return number;
    }
    String theClass(){
        return Class;
    }
    String theSex(){
        return sex;
    }
    String theAge(){
        return  age;
    }
    public String toString(){
        return name+number+Class+sex+age;
    }


    public static void main(String[] args) {

        Student student = new Student();
        student.name = "王名";
        student.number = "20190101001";
        student.Class = "1班";
        student.sex = "man";
        student.age = "20";

        System.out.println(student.toString());
    }
}
