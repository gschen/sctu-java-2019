package day20190927;

public class Test_01 {



    //ggg  运行之前出错信息：编译错误
    //运行过程中出错：运行时错误，Exception
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            System.out.println(i);
            if (i == 50){
                try{
                    int[] a = new int [5];
                    a[6] = 10;
                    System.out.println(i / 0);
                }/*catch(Exception e){
                    System.out.println(e.toString());
                }*/catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("数组越界错误!");
                }catch (ArithmeticException e){
                    System.out.println("除0错误！");
                }finally {
                    //不管出错与否，最终都会被执行
                }
            }
        }
    }
}
