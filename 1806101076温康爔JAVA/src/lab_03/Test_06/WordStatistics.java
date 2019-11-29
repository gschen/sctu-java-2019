package lab_03.Test_06;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class WordStatistics {
    private BufferedReader bufferedReader = null;
    private BufferedWriter bufferedWriter = null;


    public static void main(String[] args) {
        WordStatistics wordStatistics = new WordStatistics();
        Map<String, Integer> word_map = wordStatistics.readFile();

//      for(Map.Entry<String, Integer> mapping : word_map.entrySet()){
//          System.out.println(mapping.getKey() + " : " + mapping.getValue());
//      }
        wordStatistics.sortAndWrite(word_map);

    }

    /**
     * 从指定路径读取英文文章，并形成Map集合
     */
    public Map<String, Integer> readFile() {
        //读文件
        StringBuffer stringBuffer = new StringBuffer();
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("D:\\javatest\\test_06\\star.txt")));  //文件路径可自定义
            String line = "";
            while ((line = bufferedReader.readLine()) != null)
                stringBuffer.append(line);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //生成<单词,次数>键值对
        Pattern pattern = Pattern.compile("(\\.)? ");
        String[] words = pattern.split(stringBuffer.toString());
        Map<String, Integer> word_map = new HashMap<String, Integer>();
        for (String s : words) {
            if (!word_map.containsKey(s)) {
                word_map.put(s, 1);
            } else {
                int count = word_map.get(s);
                word_map.replace(s, count, count + 1);
            }
        }
        return word_map;
    }

    /**
     * 按单词的出现频率排序并输出到words.txt文件中
     */
    public void sortAndWrite(Map<String, Integer> word_map) {
        //排序
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(word_map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                // TODO Auto-generated method stub
                return o1.getValue().compareTo(o2.getValue());
            }

        });

        //写入文件
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(new File("D:\\javatest\\test_06\\words.txt")));
            bufferedWriter.write("一共出现了 " + word_map.size() + " 个单词，每个单词和它出现的频率分别是：");
            bufferedWriter.flush();
            bufferedWriter.newLine();
            for (Map.Entry<String, Integer> mapping : list) {
                bufferedWriter.write(mapping.getKey() + " : " + mapping.getValue());
                bufferedWriter.flush();
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Work Out");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
