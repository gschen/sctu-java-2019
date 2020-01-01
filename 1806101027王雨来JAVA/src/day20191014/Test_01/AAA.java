package day20191014.Test_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AAA {
    public static void main(String[] args) {
        System.out.println("请输入10个数字，以逗号隔开：");

        Scanner scanner=new Scanner(System.in);

        String input=scanner.next();

        //将输入的数字按照","分割成数组
        String[] numStrs=input.split(",");

        List<Integer> nums = new ArrayList<Integer>();
        //将数组的数字放入集合list中方便排序和取出最大最小数
        for (int i = 0; i < numStrs.length; i++) {
            nums.add(Integer.parseInt(numStrs[i]));
        }

        Collections.sort(nums);

        System.out.println("从小往大排序后："+nums);

        nums.remove(0);
        nums.remove(nums.size()-1);

        System.out.println("去掉最小数和最大数后："+nums);

        double avg=0d;
        int sum=0;
        //求出剩下数字的总和
        for (int i = 0; i < nums.size(); i++) {
            sum+=nums.get(i);
        }

        //求平均值（总和/剩下数字的个数）
        avg=sum/(nums.size());
        System.out.println("["+nums+"]的平均数为："+avg);
    }
}