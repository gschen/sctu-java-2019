package practice.fengzhuang;

//封装

public class EncapTest {
    private String name;
    private String idNum;
    private int age;

    public int getAge(){ //public方法是外部类访问该类成员变量的入口
                            //通常情况下，这些方法被称为getter和setter方法。
                            //因此，任何要访问类中私有成员变量的类都要通过这些getter和setter方法。
        return age;
    }

    public String getName(){
        return name;
    }

    public String getIdNum(){
        return idNum;
    }

    public void setAge(int newAge){
        age= newAge;
    }
    public void setName(String newName){
        name=newName;
    }

    public void setIdNum(String newId){
        idNum=newId;
    }
}
