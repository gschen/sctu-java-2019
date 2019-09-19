package practice.fengzhuang.xiaoshili;

public class Person {
    private String name;  //修改属性的可见性来限制对属性的访问
    private int age;        //在这里将name和age属性设为私有的，只有本类才可以访问

    public int getAge(){       //这里对每个属性值提供对外的公共方法访问
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age= age;      //this关键字是为了解决实例变量（private Sting name）
    }                       //和局部变量(setName(String name)中的name变量）之间发生的同名冲突

    public void setName(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Person p1=new Person();

        p1.setName("hahah");
        p1.setAge(18);

        System.out.println("姓名："+p1.getName()+"\n"+
                "年龄："+p1.getAge());
    }
}
