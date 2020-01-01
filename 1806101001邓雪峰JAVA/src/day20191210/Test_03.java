package day20191210;

public class Test_03 {
    public static void main(String[] args) {
        String strOrig = "Hello world, Hello Runoob";
        int lastIndex = strOrig.lastIndexOf("world");
        if(lastIndex == - 1){
            System.out.println("没有找到字符串 Runoob");
        }else{
            System.out.println("Runoob 字符串最后出现的位置： "+ lastIndex);
        }
    }
}
//字符串中下标包括空格，从0开始计数
//lastIndexOf返回指定字符串的开始出现的第一个位置