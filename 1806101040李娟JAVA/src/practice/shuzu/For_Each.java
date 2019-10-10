package practice.shuzu;

//for-each循环
//语法格式：for(type element: array){
//    System.out.println(element);
//}
public class For_Each {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // 打印所有数组元素
        for (double element : myList) {
            System.out.println(element);
        }
    }
}
