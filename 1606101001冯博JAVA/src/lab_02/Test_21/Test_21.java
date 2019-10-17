package lab_02.Test_21;

public class Test_21 {
    public static void main(String[] args) {
        String a ="aabbaaccd";
        char b ='b';
        //调用getCount方法传入值
        System.out.println(getCount(a,b));
    }
        //构造getCount	方法
    static int getCount(String s,char c){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
}

