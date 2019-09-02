package lab_01;
//12、	找出1-1000所有的水仙花数并输出。（水仙花数是三位数，它的各位数字的立方和等于这个三位数本身，
// 例如：371=33+73+13，371就是一个水仙花数。）

public class Test_12 {
    public static void main(String[] args) {
        for(int i = 1;i <= 1000;i++){
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            if(i == a*a*a + b*b*b + c*c*c){
                System.out.println(i);
            }
        }
    }
}
