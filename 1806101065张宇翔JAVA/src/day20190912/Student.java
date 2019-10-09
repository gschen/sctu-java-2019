package lab_02.day20190912;

public class Student {
    String name;
    int xuehao;


    Student( String name,int xuehao){
        this.name = name;
        this.xuehao = xuehao;
        System.out.println(name);
    }
    void study(){
        System.out.println(xuehao);
    }
}
