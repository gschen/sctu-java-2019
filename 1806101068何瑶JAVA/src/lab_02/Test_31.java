package lab_02;
import java.util.*;
public class Test_31 {
    public static void main(String[] args) {
        List name=new ArrayList();
        name.add("张三");
        name.add("李四");
        name.add("王五");
        name.add("马六");
        name.add("赵七");
        for (int i=0;i<name.size();i++){
            System.out.println("第"+(i+1)+"条数据为"+name.get(i));
        }
        System.out.println("集合大小为："+name.size());
        name.remove(2);
        for (int i=0;i<name.size();i++){
            System.out.println("第"+(i+1)+"条数据为"+name.get(i));
        }
        System.out.println("第3条数据为："+name.get(2));
        System.out.println("集合大小为："+name.size());
    }
}
