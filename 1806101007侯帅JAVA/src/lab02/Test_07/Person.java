package lab02.Test_07;

public class Person {
    String name;
    int age;
    long haoma;
    void tostring(){
        System.out.println("名字是："+this.name+"年龄是："+this.age+"身份证号码是："+this.haoma);
    }
}
class Student{
    String name;
    int age;
    long haoma;
    long xuehao;
    String school;
    void string(){
        System.out.println("名字是："+this.name+"年龄是："+
                this.age+"学校是："+this.school+"身份证号码是："+this.haoma+"学号是："+this.xuehao);
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.xuehao = 1806101007;
        st.haoma = 51150222;
        st.name = "侯帅";
        st.school = "川旅";
        st.age =    18;
        st.string();
    }

}