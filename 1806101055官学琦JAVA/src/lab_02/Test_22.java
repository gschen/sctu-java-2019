package lab_02;

public class Test_22 {
    public static void main(String[] args) {
        String str="Hello1231254Wold()[]MY1son";
        char[] chars=str.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]>='A' && chars[i]<='Z'){
                chars[i]+=32;
            }
            if (chars[i]>=48&&chars[i]<=57||chars[i]>65&&chars[i]<=90||chars[i]>=97&&chars[i]<=122 ){

            }
            else {
                chars[i]='#';
            }
        }
        String strs=String.valueOf(chars);
        String s=strs.replaceAll("\\d","0");
        System.out.println(s);

    }
}
