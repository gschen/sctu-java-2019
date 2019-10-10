package lab_02.test_37;

public class StudentDemo {
    public static void main(String[] args) {
        Undergraduate d = new Undergraduate("张三",new int[]{95,55,80});
        d.pass();
        Graduate l = new Graduate("李四",new int[]{95,55,80});
        l.pass();
    }
}
