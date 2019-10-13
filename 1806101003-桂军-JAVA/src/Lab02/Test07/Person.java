package Lab02.Test07;



public class Person {
        String name;
        String card;
        char sex;
        int age;
        public Person(String name,String card,char sex,int age){
            System.out.println("姓名："+name+"  身份证号："+card+"  性别："+sex+"  年龄："+age);
            this.name=name;
            this.card=card;
            this.sex=sex;
            this.age=age;
        }
        public Person(String name,char sex){
            System.out.println("姓名："+name+"  性别："+sex);
            this.name=name;
            this.sex=sex;
        }
        public Person(){
        }
        public void getinfo(){
            System.out.println("姓名："+name+"  身份证号："+card+"  性别："+sex+"  年龄："+age);
        }
    }
    class Student extends Person{
        String sno;
        String school;
        public Student(String name,String card,char sex,int age,String sno,String school){
            super(name,card,sex,age);
            this.sno=sno;
            this.school=school;
        }
        public Student(String name,char sex){
            System.out.println("姓名："+name+"  性别："+sex);
        }
        public Student(){

        }
        public void getinfo(){
            System.out.println("姓名："+name+"  身份证号："+card+"  性别："+sex+"  年龄："+age+"  学号："+sno+"  学校："+school);
        }
    }
     class t63 {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Person p=new Person("里西斯","上海",'男',34);
            Student s1=new Student("赵晓赵",'女');
            /*Student s2=new Student("赵小赵","513022199415615",'女',18,1806101001,'清华大学');
            Student s3=new Student("赵小小赵","云南",'女',17,1806101002,'100');
            Student s4=new Student("赵晓小小赵","北京",'女',16,1806101003,'100');
            Student s5=new Student("赵小小小赵","桂林",'女',13,1806101004,'100');*/

        }




}
