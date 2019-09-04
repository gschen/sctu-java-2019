package labor;

public class labor06 {
    public static void main(String[] args)
    {
        char a='\0';
        System.out.println("Please input a charactar");
        try
        {
            a=(char)System.in.read();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        switch(a)
        {
            case 'A':System.out.println("范围在85~100");break;
            case 'B':System.out.println("范围在70~85");break;
            case 'C':System.out.println("范围在60~70");break;
            case 'D':System.out.println("范围在60分以下");break;
        }
    }
}

