package src.lab_03.Test_06;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\demo3.txt";
        RandomAccessFile raf = new RandomAccessFile(new File(fileName),"r");
        String content = null;
        Map<String,Integer> map = new HashMap<String,Integer>();
        while ((content = raf.readLine())!=null){
            String[] ary = content.replaceAll("'|\\?|,|\\.|", "").split("\\s+");
            for (String str:ary){
                if (map.containsKey(str.trim())){
                    map.put(str,new Integer(map.get(str).intValue()+1));
                }else {
                    map.put(str.trim(),new Integer(1));
                }
            }

        }
        List list = new ArrayList();
        for (Iterator iter = map.entrySet().iterator(); iter.hasNext();) {
            Map.Entry<String, Integer> element = (Map.Entry<String, Integer>) iter.next();
            list.add(new WordFreq(element.getKey(), element.getValue()));
        }
        Collections.sort(list, new Comparator<WordFreq>(){
            public int compare(WordFreq o1, WordFreq o2) {
                return o1.getCount() < o2.getCount()? 1: -1;
            }
        });
        int uniqueCount = 0;
        final StringBuilder sb = new StringBuilder();
        final String NEW_LINE = "\r\n";
        for(Object obj: list){
            WordFreq item = (WordFreq) obj;
            uniqueCount += (item.getCount() == 1? 1: 0);
            sb.append(item.toString());
            sb.append(NEW_LINE);
        }
        JFrame f = new JFrame();
        JTextArea result = new JTextArea();
        result.append("Total " + list.size() + " words found in " + fileName);
        result.append(NEW_LINE);
        result.append("Total " + uniqueCount + " words appear only once");
        result.append(NEW_LINE);
        result.append(NEW_LINE);
        result.append(sb.toString());
        f.add(result);
        f.setVisible(true);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class WordFreq{
    private String word;
    private int count;
    public WordFreq(String word, int count){
        this.word = word;
        this.count = count;
    }
    public int getCount() {
        return count;
    }
    public String toString(){
        return word + "\t" + count;
    }


}

