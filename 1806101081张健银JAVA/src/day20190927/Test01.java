package day20190927;

public class Test01 {

    static void work(int i) throws Exception{
        System.out.println(i);
        if(i == 50){
            System.out.println(i / 0);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            try{
                work(i);
            }catch (Exception e){
                System.out.println("除数为0");
            }
        }
    }
}
