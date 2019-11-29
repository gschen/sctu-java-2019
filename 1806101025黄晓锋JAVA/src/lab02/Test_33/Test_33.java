package lab02.Test_33;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_33 {
    public static void main(String[] args) {
        sort();
    }

    public static void sort() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要取几个单词：");
        int num = input.nextInt();
        ArrayList<String> character = new ArrayList<String>();

//        for (int ii = 0;ii<character.size();ii++) {
//        }
//        int lengthList = character.size();

        for (int i = 0;i<num;i++){
            System.out.println("请输入第 " + (i+1) + "个单词：");
//            character.add(s) = input.nextInt();       //录入单词
        }




//        ArrayList<String> character = new ArrayList<String>();
//
//        int n = input.nextInt();
//        for (int i = 0;i<n;i++){
//            String s = input.next();
//            character.add(s);
//        }
//
//        Collections.sort(character);
//        for (String w : character){
//            System.out.println(w);
    }
}

