package lab_02;

public class Test_21 {
    static String temp="asefeadfggh";
    public static  int amount(String s,char c)
    {
        int cmt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                cmt++;
            }

        }
        return cmt;
    }

    public static void main(String args[])
    {
        System.out.println(amount(temp,'a'));


    }
}
