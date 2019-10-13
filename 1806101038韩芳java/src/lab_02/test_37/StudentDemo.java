package lab_02.test_37;

public class StudentDemo {
    public static void main(String[] args) {
        Undergraduate s = new Undergraduate("韩芳",19,new int[]{95,85,90});
        s.pass();
        Graduate sg = new Graduate("韩芳",19,new int[]{95,85,90});
        sg.pass();
    }
}
