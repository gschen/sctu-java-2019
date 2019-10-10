package lab_02.test_37;

public class Undergraduate extends Student {
    public Undergraduate(String name, String rank, double grade) {
        super(name, rank, grade);
    }

    void average(){
        if (grade>=60) System.out.println(name+"可以拿到学位证");
        else {
            System.out.println(name + "不能拿到学位证");
        }
    }
}
