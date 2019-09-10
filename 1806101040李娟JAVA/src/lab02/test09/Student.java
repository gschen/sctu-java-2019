package lab02.test09;

//9、 	编写一个Java程序片断，以定义一个表示学生的类Student。这个类的属性有“学号”、“班号”、“姓名”、“性别”、“年龄”，
// 方法有“获得学号”、“获得班号”、“获得性别”、“获得姓名”、“获得年龄”、“获得年龄”。
// 为类Student增加一个方法public String toString( )，该方法把Student类的对象的所有属性信息组合成一个字符串以便输出显示。

public class Student {
    String num;
    String ban;
    String name;
    String xingbie;
    int age;

    //给num赋值
    public void setNum(){
        this.num="1804101056";
    }

    //访问num
    public String getNum(){
        return num;
    }

    public void setBan(){
        this.ban="18信管03";
    }

    public void setName(){
        this.name="陆星辰";
    }


    public void setAge() {
        this.age = 19;
    }

    public void setXingbie() {
        this.xingbie = "男";
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getXingbie() {
        return xingbie;
    }

    public String getBan(){
        return ban;
    }


    public String toString(){
        return "学号："+this.getNum()+"\n"+
                "班级："+this.getBan()+"\n"+
                "姓名："+this.getName()+"\n"+
                "年龄："+this.getAge()+"\n"+
                "性别："+this.getXingbie();
    }

    public static void main(String[] args) {
        Student s1=new Student();

        //执行
        s1.setNum();
        s1.setBan();
        s1.setAge();
        s1.setName();
        s1.setXingbie();

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
