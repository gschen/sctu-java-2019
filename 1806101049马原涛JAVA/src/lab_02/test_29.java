package lab_02;

public class test_29 {
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
