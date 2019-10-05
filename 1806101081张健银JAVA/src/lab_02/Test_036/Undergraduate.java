package lab_02.Test_036;

import java.util.Scanner;

public class Undergraduate extends Student{



    @Override
    public void method() {

    }
    public String judge(){
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        if((sum / 3) >= 80){
            return "优秀";
        }else if((sum / 3) >= 70 && (sum / 3) < 80){
            return "良好";
        }else {
            return "一般";
        }
    }


}
