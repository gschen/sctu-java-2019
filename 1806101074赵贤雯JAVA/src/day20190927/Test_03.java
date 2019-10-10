package day20190927;

public class Test_03 {
    static void work(int i){
        System.out.println(i);
        try {
            if (i == 50){
                System.out.println(i/0);
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }finally {

        }

    }

    void get(String q){
        System.out.println(q);
    }
    public static void main(String[] args) {
        for (int i = 0;i < 100; i++){
            work(i);
        }
    }
}
