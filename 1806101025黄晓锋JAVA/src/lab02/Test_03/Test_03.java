package lab02.Test_03;

public class Test_03 {
        int computer;
        int manth;
        int english;

        void allPrint(){
            System.out.println("总分是：" + (this.computer + this.manth + this.english));
        }

        void averagePrint(){
            System.out.println("平均分是：" + (this.computer + this.manth + this.english)/3);
        }

        void maxPrint(){
            int a = 0;
            if (this.computer > this.manth)
             //   {a = this.computer};

            System.out.println("最高分是：");
        }

    public static void main(String[] args) {
            Test_03 grade = new Test_03();
            grade.computer = 50;
            grade.manth = 60;
            grade.english = 70;

            grade.allPrint();
            grade.averagePrint();
    }
}
