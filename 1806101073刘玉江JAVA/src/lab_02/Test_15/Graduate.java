package lab_02.test_15;

class Graduat implements StudentInterface,TeacherInterface {
    private String name;
    private String sex;
    private int age;
    private int fee;
    private int pay;
    public Graduat(String name,String sex){
        this.sex = sex;

        this.name = name;
        System.out.println(name+" "+ sex);
    }

    @Override
    public void setFee(int f) {
        fee = f;
    }

    @Override
    public int getFee() {
        return fee;
    }

    @Override
    public void setPay(int p) {
        pay = p;

    }

    @Override
    public int getPay() {
        return pay;
    }

    public static void main(String[] args) {
        Graduat a = new Graduat("张华","男");
        a.setFee(3600);
        a.setPay(8000);
        System.out.println(a);
        if (a.getPay()*12 - a.getFee() >= 2000){
            System.out.println("your income is enough");
        }else {
            System.out.println("you need a loan");
        }
    }
}
