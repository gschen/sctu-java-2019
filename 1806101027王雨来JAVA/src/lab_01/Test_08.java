package lab_01;

public class Test_08 {
    public static void main(String[] args) {
        int b = 1;
        char space=' ';
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j < b; j++) {
                //检查答案长度，添加适当空格使其开头对齐
                int a =(b-1)*j;
                String x ="";
                x = a + x;
                int log =x.length();
                if (log == 1){
                    System.out.print(j+"*"+(b-1)+"="+(b-1)*j+"   ");
                }else
                    System.out.print(j+"*"+(b-1)+"="+(b-1)*j+"  ");
            }
            b = b + 1;
            System.out.println();
        }
    }
}

