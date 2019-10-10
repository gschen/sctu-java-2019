package day20190912;

public class My extends Student {
    My(String name, String classNumber) {
        super(name, classNumber);
    }

    public static void main(String[] args) {
        My shuai = new My("133","123");
        shuai.getclassNumber();
        shuai.getName();

    }
}
