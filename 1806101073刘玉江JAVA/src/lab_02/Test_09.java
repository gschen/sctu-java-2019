package lab_02;

public class Test_09 {
    static class Student{
        private String Sno,Sclass,Sname,Ssex,Sage;
        public Student(String Sno,String Sclass,String Sname,String Ssex,String Sage){
            this.Sage = Sage;
            this.Sclass = Sclass;
            this.Sname = Sname;
            this.Sno = Sno;
            this.Ssex = Ssex;
        }
        public void Tostring(){
            System.out.println(Sage+Ssex+Sno+Sname+Sclass);
        }
    }

    public static void main(String[] args) {
        Student a = new Student("1806101073","03","刘","男","19");
        a.Tostring();
    }
}
