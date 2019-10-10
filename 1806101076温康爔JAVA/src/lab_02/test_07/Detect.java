package lab_02.test_07;

public class Detect {
    public static void main(String[] args) {
        Person d = new Person("Allen",27,"513029************");
        System.out.println(d.getInfo());
        Student l = new Student("Alice",20,"51302919**********");
       // l.setName("Alice");
       // l.setAge(20);
       // l.setIdno("51302919**********");
        l.setSchool("sctu");
        l.setSno(1021);
        System.out.println(l.getInfo());
    }
}
