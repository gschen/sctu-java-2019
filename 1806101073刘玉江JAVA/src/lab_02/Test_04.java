package lab_02;

public class Test_04 {
    static class Staff{
        private String name;
        private String num;
        private double salar;
        private double sg;
        private double aftersg;
        public  Staff(String name,String num,double salar,double sg){
            this.name = name;
            this.num = num;
            this.salar = salar;
            this.sg = sg;
            this.aftersg = salar*(1+sg);
        }
        public void print(){
            System.out.println("名字："+name+"，号码："+num+",薪水："+salar+",薪水增长额："+sg+"，增长后的薪水："+aftersg);
        }

    }

    public static void main(String[] args) {
        Staff a = new Staff("刘玉江","1806101073",100000,0.5);
        a.print();
    }
}
