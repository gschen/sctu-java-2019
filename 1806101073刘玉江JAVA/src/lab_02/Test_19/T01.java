package lab_02.Test_19;

public class T01 {
    public static String reverse(String s){
        char[] chars = s.toCharArray();
        int i;
        s = "";
        for (i = chars.length-1;i>=0;i--){
            s+= chars[i];

        }
        return s;
    }
}
