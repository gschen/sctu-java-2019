package lab02.test07;

public class Test {
    public static void main(String[] args) {
        Student s1= new Student();

        s1.name="你猜猜";
        s1.age=18;
        s1.shengnum="1896426436723234";
        s1.sno="1806101040";
        s1.xuexiao="四川旅游学院";



        System.out.println("姓名："+s1.name+"\n"+
                "年龄："+s1.age+"\n"+
                "身份证号："+s1.shengnum+"\n"+
                "学号："+s1.sno+"\n"+
                "所在学校："+s1.xuexiao);
    }
}
