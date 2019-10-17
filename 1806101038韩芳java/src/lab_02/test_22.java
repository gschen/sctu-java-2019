package lab_02;

public class test_22 {
    public static void main(String[] args) {
        String str = "FHDJ9487&%$#(";
        System.out.println(TestStr(str));
    }
    //给定字符串字母变成小写，数字用0，代替其他用#
    public static String TestStr(String str){
        StringBuffer sb = new StringBuffer();
        for(int i =0; i < str.length(); i++){
            char a = str.charAt(i);
            if(a>='0'&&a<='9'){
                sb.append("0");
            }else if(a>='A'&&a<='Z'||a>='a'&&a<='z'){
                sb.append((a+"").toLowerCase());
            }else{
                sb.append("#");
            }
        }
        return sb.toString();
    }
}
