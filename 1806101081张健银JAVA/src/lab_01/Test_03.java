package lab_01;
//3、	使用break语句实现记数：从1-100，当数到78时程序终止。
public class Test_03 {
    public static void main(String[] args) {
        for (int i = 1; i <100 ; i++) {
            if (i <= 78){
                System.out.println(i);
            }else {
                break;
            }
        }
    }
}
