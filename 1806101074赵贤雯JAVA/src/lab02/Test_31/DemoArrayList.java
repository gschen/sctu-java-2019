package lab02.Test_31;


import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        new DemoArrayList();
    }
        DemoArrayList() {
        /*创建一个只能容纳String对象名为demo的ArrayList集合*/
            List<String> demo = new java.util.ArrayList<String>();
            demo.add("张三");
            demo.add("李四");
            demo.add("王五");
            demo.add("马六");
            demo.add("赵七");
        //对集合进行遍历分别打印集合中的每个元素的位置与内容
            for (int i = 0; i <demo.size();i++){
                System.out.println(i + "----->" + demo.get(i));
                //打印集合的大小
                System.out.println("改变前容器的大小为：" + demo.size());
                //删除几何中的第3个元素
                System.out.println("删除的第三个元素为：" + demo.remove(3));
                //打印目前集合中第三个元素的内容
                System.out.println("第三个元素为：" + demo.get(3));
                //打印集合的大小
                System.out.println("改变后容器的大小为：" + demo.size());

            }


        }
    }



