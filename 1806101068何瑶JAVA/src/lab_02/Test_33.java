package lab_02;
import java.util.*;

public class Test_33 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String []st=str.split(" ");
        List<String>lis=Arrays.asList(st);
        Collections.sort(lis, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(lis);
    }
}
