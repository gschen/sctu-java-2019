package lab_02.day20190912;

public class Client {
    public static void main(String[] args) {
/*
        User zhao = new User("zhao",10,"female",164);// 调用类时，要将对象实例化
        zhao.study();
        User xiao = new User("xiao",28,"male",181);
        xiao.study();
        User wang = new User("wang",22,"male",179);
        wang.study();
*/
       Student1 zhao = new Student1("zhaoxianwen","sophomore",18,164);
       zhao.run();
       Student1 wang = new Student1("wangyibo","graduate",22,179);
       wang.skateboard();


    }
}
