package lab02.Test_10;

public class ChinaPeople extends People {
    void ChinaPeople (){
        System.out.println(name+"是中国人");
    }


    public static void main(String[] args) {
        ChinaPeople cp = new ChinaPeople();

        cp.String("zzw",80,"9527");
        cp.People();
        cp.swimming();
        cp.walk();
        cp.ChinaPeople();
    }
}