package Practice.day20190912;

public class Students {
    //1.成员变量
    String name;
    String sno;
    String sclass;

    //2.成员方法
    void setName(){
        System.out.println("名字为："+name);
    }
    void Students(){

        this.name = name;
        this.sclass = sclass;
        this.sno = sno;
    }
    void setSno(){
        System.out.println("学号为："+sno);
    }
    void setSclass(){
        System.out.println("班级为："+sclass);
    }
}
