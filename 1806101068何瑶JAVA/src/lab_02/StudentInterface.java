package lab_02;
import java.util.Scanner;
public interface StudentInterface {
    double ff=3800;
    abstract void setFee(double ff);
    abstract double getFee();
}
interface TeacherInterface extends StudentInterface{
    double pp=4000;
    abstract void setPay(double pp);
    abstract double getPay();
}
class Graduate implements TeacherInterface{
    String name="zhangsan",sex="man";
    double age=32,ff,pp;
    @Override
    public void setFee(double ff){
        this.ff=ff;
    }
    @Override
    public double getFee(){
        return ff;
    }
    @Override
    public void setPay(double pp){
        this.pp=pp;
    }
    @Override
    public double getPay(){
        return pp;}
        public void show1(){
            System.out.println("姓名："+name+"性别："+sex+"年龄："+age+"每学期学费："+ff+"月工资："+pp);
        }
        public void show(){
        if (pp-ff<2000)
            System.out.println("You income is enough！");
        else
            System.out.println("You income is enough！");
        }
}
class sa4{
    public static void main(String[] args) {
        System.out.print("输入学费：");
        Scanner sc=new Scanner(System.in);
        double ff=sc.nextDouble();
        System.out.print("输入月工资：");
        Graduate G=new Graduate();
        G.setPay(TeacherInterface.pp);
        G.setFee(ff);
        G.getFee();
        G.getPay();
        G.show1();
        G.show();
    }
}