package lab_02.test_09;

public class Student {
    //学号、班号、姓名、性别、年龄
    private int sno;
    private int num;
    private String sex;
    private String name;
    private int age;

    public Student(int sno,int num,String sex, String name,int age){
        this.sno=sno;
        this.num=num;
        this.sex=sex;
        this.name=name;
        this.age=age;

    }

    //获得学号、班级、性别、姓名、年龄，修改年龄
    public int getSno(){
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo(){
        return "My name is "+getName()+". I'm "+getAge()+" years old."+"I'm a "+getSex()+". My student num is "+getSno()+". I come from "+getNum()+" clas.";
        //return "姓名："+getName()+"年龄:"+getAge()+"班级:"+getNum()+"学号:"+getSno()+"性别:"+getSex();
    }
}


