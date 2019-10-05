package lab_02;

import java.util.Scanner;

public class Test_19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        char[] str=s.toCharArray();
        for (int i = 0; i <str.length ; i++) {
            if (str[i]>='A' && str[i]<='Z'){
                str[i]+=32;
            }else {
                str[i]-=32;
            }
        }
        String y=String.valueOf(str);
        StringBuilder z=new StringBuilder(y);
        z.reverse();
        System.out.println(z);
        /*
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
         */
    }
}
