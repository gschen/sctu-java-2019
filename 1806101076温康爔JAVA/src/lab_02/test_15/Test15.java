package lab_02.test_15;

public class Test15 {
    public static void main(String[] args) {
        Graduate gr=new Graduate("zhangsan","男",25,8000,3000);
        judgeLoan(gr);
        }
    public static void judgeLoan(Graduate gr){//对象作形参
        if(gr.getPay()*12-gr.getFree()*2<2000){
            System.out.println("You need a loan!");
            }
        else
        System.out.println("Your income is enough!");
    }
}
