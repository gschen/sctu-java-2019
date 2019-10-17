package day20190927;

public class Test02 {
    static void work( int i)throws Exception {
        System.out.println(50/i);

    }

    public static void main(String[] args) {

        for (int i = 0;i<=50;i++){
            try {
                work(i);
            }
            catch ( Exception e){
                e.printStackTrace();
                System.out.println("出现错误");
            }

        }


    }
}
