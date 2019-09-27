package lab02.Test_09;

public class Student {
    String name;
    int age;
    String sex;
    String number;
    String class_number;

    //赋值
    public void setName (){this.name ="haha";}
    public void setAge (){this.age =18;}
    public void setSex (){this.sex ="男";}
    public void setNumber (){this.number ="1806101000";}
    public void setClass_number (){this.class_number ="18信管03";}

    //访问
    public String getName (){return name;}
    public int getAge (){return age;}
    public String getSex(){return sex;}
    public String getNumber (){return number;}
    public String getClass_number (){return class_number;}

    public String toString(){
        return  "姓名："+this.getName()+"\n"+
                "年龄："+this.getAge()+"\n"+
                "性别："+this.getSex()+"\n"+
                "学号："+this.getNumber() +"\n"+
                "班级："+this.getClass_number();
    }

    public static void main(String[] args) {
        Student s1=new Student();

        //执行
        s1.setNumber() ;
        s1.setClass_number() ;
        s1.setAge();
        s1.setName();
        s1.setSex() ;

        //get访问输出 System.out.println(s1.getNum());
        //System.out.println("学号："+s1.getNum());
        //System.out.println("班级："+s1.getBan());
        //System.out.println("姓名："+s1.getName());
        //System.out.println("性别："+s1.getXingbie());
        //System.out.println("年龄："+s1.getAge());
        s1.toString();

        System.out.println(s1.toString());


    }


}
