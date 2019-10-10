package lab_02.Test_037;

public class StudentDemo {
    public static void main(String[] args) {
        Undergraduate s = new Undergraduate("张三",20,new int[]{95,55,80});
        s.pass();
        Graduate sg = new Graduate("张三",20,new int[]{95,55,80});
        sg.pass();
    }
}
