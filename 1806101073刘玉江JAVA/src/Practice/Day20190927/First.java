package Practice.Day20190927;

public class First {
    public static void main(String[] args) {
        for (int i = 0;i < 100;i++){
            System.out.println(i);
            if (i == 50){
                try {

                }catch (Exception e){
                    System.out.println(e.toString());
            }finally {
                    //不管出错与否，最终都会运行
                }
            }
        }
    }
}
