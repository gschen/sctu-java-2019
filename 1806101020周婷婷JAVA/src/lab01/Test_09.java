package lab01;

public class Test_09 {
    public static void main(String[] args) {
        int i,j,k,num;
        char ch;
        num='A'-1;
        for(i=1;i<=4;i++)
        {
            for(k=1;k<=4-i;k++)
                System.out.print(" ");
            for(j=1;j<=i;j++)
            {
                num=num+1;
                ch=(char)num;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        for (i=1;i<=4;i++)
        {
            for (k=1;k<=i-1;k++)
                System.out.print(" ");
            for(j=1;j<=5-i;j++)
            {
                num=num+1;
                ch=(char)num;
                System.out.print(ch+" ");
            }
            System.out.println();
        }

    }
}
