public class Tset21 {
    public static void main(String[] args) {
        //指定字符和字符串
        char c = '1';
        String string = "1234567234728134";
        System.out.println( getCharCount(c,string));
    }
    public static int getCharCount(char c, String string){
        int count = 0;
        for (int i = 0; i < string.length();i++){
            char temp = string.charAt(i);
//            if(c == temp)
//                conut ++;
        }
        return count;
    }
    }

