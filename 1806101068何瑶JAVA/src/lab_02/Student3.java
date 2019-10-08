package lab_02;

public class Student3 {
   private String id;
   private int classid;
   private String name;
   private String sex;
   private int age;

    public void setId(String id) {
        this.id=id;
    }
     private String getId(){
        return id;
    }
    private int getClassid(){
        return classid;
    }
    public void setAge(int age){
        this.age=age;
    }
    int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public String toString(){
        return "学号："+id+"班级号："+classid+"姓名："+name+"性别："+sex+"年龄："+age;
    }

    public static void main(String[] args) {
        Student3 s=new Student3();
        s.setId("12345");
        s.classid=3;
        s.name="xx";
        s.sex="女";
        s.age=20;
        System.out.println(s.toString());

    }
}
