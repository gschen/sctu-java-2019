package lab_02.day20190919;

public class test_9 {
    public static void main(String[] args) {
        Student_9 a=new Student_9("马原涛","19","522465200006049464","03","男");
        a.toString();
    }
}
class Student_9{
    String name;
    String age;
    String id;
    String class_id;
    String sex;
    Student_9(String name,String age,String id,String class_id,String sex){
        this.name=name;
        this.age=age;
        this.id=id;
        this.class_id=class_id;
        this.sex=sex;
    };
    String getName(){
        System.out.println(name);
        return name;
    };
    String getAge(){
        System.out.println(age);
        return age;
    };
    String getId(){
        System.out.println(id);
        return id;
    };
    String getClass_id(){
        System.out.println(class_id);
        return class_id;
    };
    String getSex(){
        System.out.println(sex);
        return sex;
    }
    public String toString(){
        System.out.println(name+age+id+class_id+sex);
        return name+age+id+class_id+sex;
    };

}