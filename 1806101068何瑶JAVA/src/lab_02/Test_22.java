package lab_02;

class Test_22 {
    public static void main(String[] args) {
        String str = "Hello,World!123";
        System.out.println("原字符串==" + str);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append(Character.toLowerCase(ch));
            } else if (ch >= 'a' && ch <= 'z') {
                sb.append(ch);
            } else if (ch >= 49 && ch <= 58) {
                sb.append(0);
            } else {
                sb.append("#");
            }
        }
        System.out.println("转换后=="+sb);
    }
}
