package day20190905;

public class Classroom {
        int classNumber;
        String bookName;
        int computerNumber;
    void study() {
        System.out.println("上课教室： " + this.classNumber);
        System.out.println("课程教材名称： " + this.bookName);
        System.out.println("电脑编号： " + this.computerNumber);
    }

    public static void main(String[] args) {
        Classroom zgb = new Classroom();
        zgb.classNumber = 327;
        zgb.bookName = "JAVA基础教程";
        zgb.computerNumber = 01;
        zgb.study();
    }
}
