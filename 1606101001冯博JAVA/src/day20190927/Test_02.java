package day20190927;

public class Test_02 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 50) {
                try{
                    throw new NullPointerException();//有意地抛出错误，例：输入密码与登陆密码不一致时，抛出错误
                }catch(NullPointerException e){
                    System.out.println("空指针错误！");
                }finally {

                }

            }
        }
    }
}