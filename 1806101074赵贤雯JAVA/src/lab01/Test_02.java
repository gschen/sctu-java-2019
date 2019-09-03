package lab01;
//2、	使用continue语句实现：将100-300之间的不能被3整除的数输出。
public class Test_02 {
    public static void main(String[] args) {

        for (int i = 100; i <= 300; i++){
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}