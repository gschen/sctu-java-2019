package Lab02.Test15;

public class Test {
    public static void main(String[] args) {
        Graduate gra = new Graduate("张三", "男", 25, 8000, 6000);
        judgeLoan(gra);
    }

    public static void judgeLoan(Graduate gr) {//对象作形参
        if (gr.getPay() * 12 - gr.getFee() * 2 < 2000) {
            System.out.println("You need a loan!");
        } else
            System.out.println("Your income is enough!");
    }
}
