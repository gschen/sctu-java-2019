package lab_01;

public class Test_04 {

    public static void main(String[] args) {
 /*for循环求解1-100的和
    int sum=0;
    for(int i=1;i<=100;i++){
        sum+=i;
    }
        System.out.println(sum);
    }
    //while循环求解1-100的和
        int sum=0;int i=0;
        while(i<=100) {
            sum+=i;
            i++;
        }
        System.out.println(sum);
 */
 //do while求解1-100的和
    int i=0;int sum=0;
    do {
        sum+=i;
        i++;

        } while(i<=100);
        System.out.println(sum);
    }
}






