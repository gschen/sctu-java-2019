package lab_02.test_19;

public class HelloWorld {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "HelloWorld";
        char []s = str.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for(int i = str.length() - 1;i >= 0;i--) {
            if('A'<=s[i]&&s[i]<='Z')
                buffer.append(String.valueOf(s[i]).toLowerCase());
            else
                buffer.append(String.valueOf(s[i]).toUpperCase());
        }
        System.out.println(buffer.toString());
    }
}
