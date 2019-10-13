package lab_02.Test_31;

import java.util.ArrayList;
import java.util.List;

public class Test_31 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        System.out.println("下面是集合的所有元素");
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("马六");
        names.add("赵七");


        for (int i =0;i < names.size();i++){
            System.out.println("位置"+i +"的元素内容为:"+names.get(i));
        }
        System.out.println("目前的集合大小为："+names.size());
        System.out.println("删除的第3个元素内容为："+names.get(2));
        names.remove(2);
        System.out.println("删除操作后，集合的第3个元素内容为："+names.get(2));
        System.out.println("删除操作后，集合的大小为"+names.size());

    }
}
