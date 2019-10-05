package day20190926;


import java.util.List;

public class myArrayList {
    myArrayList(){
        /*创建一个只能容纳String对象名为demo的ArrayList集合*/
        List<String> demo = new java.util.ArrayList<String>();
        demo.add("张三");
        demo.add("李四");
        demo.add("王五");
        demo.add("马六");
        demo.add("赵七");
        /*对集合进行遍历分别打印集合中的每个元素的位置与内容*/
        for (int i = 0; i <demo.size();i++){
            System.out.println(demo.get(0));

        }
    }

}
