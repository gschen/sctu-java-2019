package week01;

public class Text2__9 {
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
            case '1':System.out.println("不及格");break;
            case '2':System.out.println("及格");break;
            case '3':System.out.println("中等");break;
            case '4':System.out.println("良好");break;
            case '5':System.out.println("优秀");break;
        }
    }
}
