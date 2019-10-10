package lab_02.test_10;



public class ChinaPeople extends People {
    void ChinaPeople (){
        System.out.println(name+"是中国人");
    }


    public static void main(String[] args) {
        ChinaPeople cp = new ChinaPeople();

        cp.String("黄晓峰",80,"37834637");
        cp.People();
        cp.swimming();
        cp.walk();
        cp.ChinaPeople();
    }
}
