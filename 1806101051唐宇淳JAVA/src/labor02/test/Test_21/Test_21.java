package labor02.test.Test_21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_21 {
    public static void main(String[] args) {
                String a ="aabbaaccd";
                char b ='b';//注意char类型单引号

        //调用getCount方法传入值
                System.out.println(getCount(a,b));
            }
        //构造getCount	方法
            static int getCount(String s,char c){
                int count=0;
        //遍历
                for(int i=0;i<s.length();i++){
        //判断
                    if(s.charAt(i)==c){
                        count++;
                    }
                }
                return count;
            }

        }



