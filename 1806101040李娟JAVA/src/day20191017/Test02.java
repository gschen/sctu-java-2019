package day20191017;

public class Test02 {
    public static void main(String[] args) {
//        Test T1= new Test();


        Te01 t1= new Te01();
        Te02 t2= new Te02();
        Te03 t3= new Te03();
        Te04 t4= new Te04();
        Te05 t5= new Te05();

        //  线程属性
        t1.setName("xianchengi:");
//        t1.getPriority();   //优先级
//        t1.getId();  //获得当前线程的编号

//        T1.start();  //启动 运行 run里面的代码
        t1.start();
        t2.start();   //五个几乎是同时启动的
        t3.start();
        t4.start();
        t5.start();
    }
}
