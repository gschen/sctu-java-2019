package day20190927;
//异常处理
public class Test_01 {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
            try {
                if(i == 50)
                    System.out.println(i / 0);
            }
            catch (ArrayIndexOutOfBoundsException e/*检查错误*/){
                //要是出错了在运行的代码
                System.out.println("giao");
                System.out.println(e.toString());//返回错误类型
            }
            catch (ArithmeticException e){
                System.out.println(e.toString());
            }
            catch (Exception e){
                System.out.println(e.toString());
            }
            finally {
                //再纳闷都要运行的代码
                System.out.print("");
            }
        }
    }
}
