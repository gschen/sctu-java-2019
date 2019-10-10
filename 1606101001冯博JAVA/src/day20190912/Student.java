package lab_02.day20190912;

public class Student {
    Student(String name,int age,int studentNumber,String studentClass){
        System.out.println("学生信息为：");
        System.out.println("姓名：" + this.name + "</br>" + "年龄为：" + this.age);
    }
    //1.成员变量
    String name;
    int age;
    int studentNumber;
    String studentClass;
    //2.成员方法
    void study(){
        System.out.println();
    }
/*
    public static void main(String[] args) {
        Student fb = new Student();

    }
  */
    public static void main(String[] args) {
        Student fb = new Student("冯博",21,1010619763,"信管03");

    }
}
