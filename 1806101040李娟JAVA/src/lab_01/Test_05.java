package lab_01;

public class Test_05 {
    public static void main(String[] args) {

        int n=1;
        for(n=1;n<=5;n++){
            if(n==1){
                System.out.println("成绩不及格");
                break;
            }
            else if(n==2){
                System.out.println("成绩及格");
                break;
            }
            else if(n==3){
                System.out.println("成绩中等");
                break;
            }
        }

    }
}
