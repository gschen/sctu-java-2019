package Lab_02.Test_029;
//29、 	编写一个类，在其main()方法中创建一个一维数组，在try字句中访问数组元素，使其产生ArrayIndexOutOfBoundsException异常。在catch子句里捕获此异常对象，
//        并且打印“数组越界”信息，加一个finally子句，打印一条信息以证明这里确实得到了执行。
public class Test {
    public static void main(String[] args) {
        int[] i = new int[10];
        for (int j = 0; j < i.length; j++) {
            i[j] = j;
        }
        try {
            System.out.println(i[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界");
        }finally {
            System.out.println("请正确访问索引");
        }
    }
}
