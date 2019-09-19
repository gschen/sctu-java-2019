package lab_02;

public class Test_07 {
    public static void main(String[] args) {
        Person person=new Person();
        person.age=22;
        person.name="老关";
        person.id="13654513165435131";
        Students student=new Students();
        student.sno="13546132";
        student.age=22;
        student.id="13654513165435131";
        student.name="老关";
        System.out.println(person.print());
        System.out.println("");
        System.out.println(student.print());
    }
}

class Person{
    String name;
    int age;
    String id;
    public String print(){
        return "name"+name+"\nage"+age+"\nid"+id;
    }
}

class Students extends Person{
    String sno;
    public String print(){
        return super.print()+"\nsno"+sno;
    }
}
