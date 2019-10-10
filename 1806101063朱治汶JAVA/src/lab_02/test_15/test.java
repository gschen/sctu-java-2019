package lab_02.test_15;

public class test {

    public static void main(String[] args) {
        Graduate graduate = new Graduate();
        graduate.name = "张宇翔";
        graduate.sex = "女";
        graduate.age = 80 ;
        graduate.setFee(3000);
        graduate.setPay(2000);

        if (graduate.getFee()-graduate.getPay()<2000){
            System.out.println("You  need a loan!");
        }
        else
            System.out.println("You income is enough！");
    }

}
