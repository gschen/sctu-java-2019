package lab01;

public class Test_12 {public static void main(String[] args) {
    int number = 100;     // 由于水仙花数是三位数，故由100开始算起
    int i, j, k;     // i  j  k  分别为number 的百位、十位、个位
        for (int sum; number < 1000; number++) {
            i = number / 100;
            j = (number - i * 100) / 10;
            k = number - i * 100 - j * 10;
            sum = i * i * i + j * j * j + k * k * k;
            if (sum == number) {
                System.out.println(number);
            }
        }
    System.out.println("以下是所有的水仙花数:");
    }
}

