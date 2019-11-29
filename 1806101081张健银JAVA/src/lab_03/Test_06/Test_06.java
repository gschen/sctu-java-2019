package lab_03.Test_06;
//6、	使用RandomAccessFile流统计一篇英文中的单词，要求如下：
//        （1）一共出现了多少个英文单词。
//        （2）有多少个互不相同的单词。
//        （3）给出每个单词出现的频率，并将这些单词按频率大小顺序进行打印。

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_06 {
    public static void main(String[] args) {
        String str;
        String[] words;
        int count = 0;
        int word = 0;
        HashMap<String,Integer> hashMap = new HashMap();
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("D:\\javatxt\\English\\English.txt","r");
            while ((str = randomAccessFile.readLine()) != null){
                Pattern pattern = Pattern.compile("[,.!?\"\']");
                Matcher matcher = pattern.matcher (str);
                str = matcher.replaceAll("");
                //进行分割
                words = str.split(" ");
                for (int i = 0; i < words.length ; i++) {
                    if(hashMap.containsKey(words[i])){//验证key
                        count = hashMap.get(words[i]).intValue();//成功则获取key的值
                        System.out.println(count);
                        hashMap.put(words[i],count+1);
                    }else {
                        hashMap.put(words[i],1);
                    }
                    word++;
                }
            }
            System.out.println("一共有"+word+"个单词");
            System.out.println("一共有"+hashMap.size()+"个不重复的单词");
//            for (Map.Entry entry:hashMap.entrySet()){
//                System.out.println("单词："+ entry.getKey() + ">>>>>>" + "出现频率：" + entry.getValue());
//            }

            List<HashMap.Entry<String,Integer>> list = new ArrayList<Map.Entry<String, Integer>>(hashMap.entrySet());
            Collections.sort(list, new Comparator<HashMap.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });
            System.out.println("单词按照出现次数由少到多为：");
            for (Map.Entry<String,Integer> entry:list){
                System.out.println("单词："+ entry.getKey() + ">>>>>>" + "出现频率：" + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
