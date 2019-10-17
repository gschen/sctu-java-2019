package labor02.test.Test_31;

import java.util.*;

//数组
public class Test_31 {
    /*public static void main(String[] args) {
        //保存10个整数 0-9
        int[] ints = new int[10];//放10个数
        for (int i = 0; i < 9; i++) {
            ints[i] = i;
        }//用List来保存数据
        List<String> list = new ArrayList<String>();
        list.add("my");
        list.add("my");
        list.add("my");
        for (String s :list){
            System.out.println(s);
        }//访问（打印）每一个元素
        //System.out.println(list);

        Set<String> myset = new HashSet<String>();
        myset.add("my");
        myset.add("my");
        myset.add("my");//不能添加相同的元素 元素的唯一性

        //键值对保存 Map
        Map<String,String> map = new HashMap<String, String>();
        map.put("键","值");
        map.put("url","http://www.baidu.com");
        map.get("url");
        System.out.println(map.get("url"));
        //打印元素
        for (Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }*/
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("马六");
        names.add("赵七");
        System.out.println(names);//添加元素并打印
        for (String s : names) {
            System.out.println(s);//遍历元素 并打印
        }
        System.out.println("集合的大小是：" + names.size());//list.size()打印集合的大小
        names.remove(names.get(3));//remove 是删除元素
        System.out.println(names);
        System.out.println("目前第三个元素的内容"+names.get(3));
        System.out.println("目前集合的大小是："+names.size());
    }
}


