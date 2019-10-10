package lab_02;

public class Test_29 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        try{
            for (int i=0;i<8;i++){
                System.out.println(a[i]);
            }
        }catch (Exception ex){
            ex.getStackTrace();
            System.out.println("数组越界");
        }finally {
            System.out.println("异常处理成功");
        }
    }
}