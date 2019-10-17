package lab_02;

public class Test_04 {
    public String Pname;
    public String Pnumber;
    public int Psalary;
    public double PsalaryAdd;

    String name(){
        return  Pname;
    }
    String number(){
        return  Pnumber;
    }
    int salary(){
        return  Psalary;
    }double salaryAdd(){
        return  (PsalaryAdd*Psalary)+Psalary;
    }

    public static void main(String[] args) {
                Test_04 staff = new Test_04();
                staff.Pname = "王名";
                staff.Pnumber = "2345678";
                staff.Psalary = 3000;
                staff.PsalaryAdd = 0.3;

                System.out.println(staff.salaryAdd());
    }
}
