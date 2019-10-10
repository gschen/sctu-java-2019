package lab02.Test_37;
//4)	设计一个测试类StudentDemo，分别创建本科生和研究生这两个类的对象，并输出相关信息。
public class StudentDemo {
    public static void main(String[] args) {
        Undergraduate d = new Undergraduate("张三",new int[]{95,55,80});
        d.pass();
        Graduate l = new Graduate("李四",new int[]{95,55,80});
        l.pass();
    }
}
