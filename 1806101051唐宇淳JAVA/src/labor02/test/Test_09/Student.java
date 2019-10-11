package labor02.test.Test_09;
//9、 	编写一个Java程序片断，以定义一个表示学生的类Student。
// 这个类的属性有“学号”、“班号”、“姓名”、“性别”、“年龄”，
// 方法有“获得学号”、“获得班号”、“获得性别”、“获得姓名”、“获得年龄”、“获得年龄”。
// 为类Student增加一个方法public String toString( )，
// 该方法把Student类的对象的所有属性信息组合成一个字符串以便输出显示。
public class Student {
    long xh;
    int bh,age;
    String name ,sex;
    void getXueHao(){
        System.out.println("学号是："+this.xh);
    }
    void getBanHao(){
        System.out.println("班号是："+this.bh);
    }
    void getSex(){
        System.out.println("性别是："+this.sex);
    }
    void getName(){
        System.out.println("名字是："+this.name);
    }
    void getAge(){
        System.out.println("年龄是："+this.age);
    }
    public String toString(){
        System.out.println("学号是："+this.xh+"班号是："+this.bh+"性别是："+this.sex+
                "名字是："+this.name +"年龄是："+this.age);
        return toString();

    }

    public static void main(String[] args) {
        Student hou = new Student();
        hou.age = 18;hou.name = "唐宇淳";hou.sex = "男";hou.bh = 03;hou.xh = 1806101051;
        hou.getAge();hou.getBanHao();hou.getSex();hou.getName();hou.getXueHao();
        hou.toString();
    }

}
