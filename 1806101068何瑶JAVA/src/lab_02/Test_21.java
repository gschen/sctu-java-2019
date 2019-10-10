package lab_02;

public class Test_21 {
    public static int counter(String s,char c){
        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==c){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Test_21().counter("HELLOWORLD",'L'));
    }
}
