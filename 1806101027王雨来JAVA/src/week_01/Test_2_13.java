package week_01;

public class Test_2_13 {
    public static void main(String[] args) {
        float x = -100;
        for (float i = 0; i < 200; i++) {
            if (2*(i*i*i) - 4*(i*i) + 3*i -6 == 0){
                x = i;
            }
        }
        System.out.println(x);
    }
}
