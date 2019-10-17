package lab_02.Test_31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test_31 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> names=new ArrayList<>();
        System.out.println("你要添加几个名字：");
        int n=scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            String name=scanner.next();
            names.add(name);
        }
        for (int i = 0; i <names.size() ; i++) {
            System.out.println("第 " + ( i + 1 )+ " 个人的名字叫：" + names.get(i));
        }
        System.out.println(names.remove(2));
        System.out.println(names.get(2));
    }
}