package lab_02.test_36;

public class Postgraduate extends Student{

    @Override
    public void method() {

    }
    public String judge(){
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        if((sum / 3) >= 90){
            return "优秀";
        }else if((sum / 3) >= 80 && (sum / 3) < 90){
            return "良好";
        }else {
            return "一般";
        }
    }


}
