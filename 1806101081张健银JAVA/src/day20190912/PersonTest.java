package day20190912;

public class PersonTest {
    public static void main(String[] args) {
        Pesron p = new Pesron("zjy","1806101081","男","学生",12);
        Pesron zhang = new Pesron("张","123456","女","售货员",27);
        System.out.println(p);
        System.out.println(zhang);
        zhang.run();
    }
}
