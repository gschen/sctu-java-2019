package lab02.Test_21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String str = "dbuwiqdoqfbbfuieqnaaak";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length();i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }
        Set<Entry<Character, Integer>> entrySet = map.entrySet();
        Iterator<Entry<Character, Integer>> iterator = entrySet.iterator();
        while(iterator.hasNext()) {
            Entry<Character, Integer> next = iterator.next();
            System.out.println(next.getKey()+" "+next.getValue());
        }
    }
}
