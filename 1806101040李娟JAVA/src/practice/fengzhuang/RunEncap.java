package practice.fengzhuang;


public class RunEncap {
    public static void main(String[] args) {
        EncapTest e1=new EncapTest();
        e1.setName("nina");
        e1.setAge(18);
        e1.setIdNum("180410849018");

        System.out.println("姓名："+e1.getName()+"\n"+
                           "年龄："+e1.getAge()+"\n"+
                            "号码："+e1.getIdNum());
    }
}
