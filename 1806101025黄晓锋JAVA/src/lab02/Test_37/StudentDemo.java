package lab02.Test_37;

public class StudentDemo {

    public static void main(String[] args) {

        Graduate graduate = new Graduate("张三","研究生",82);
        Graduate graduate1 = new Graduate("李四","研究生",75);
        Undergraduate undergraduate = new Undergraduate("王二","本科生",75);
        graduate.average();
        graduate1.average();
        undergraduate.average();
    }
}
