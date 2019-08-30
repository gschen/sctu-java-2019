package lab_01;

public class test_02 {
    public static void mian(){
        int i=100,s;
        while(i<=300)
        {
            s=i%3;
            if (s==0)
            {
                i++;
                continue;
            }
            System.out.printf("%d",i);
            i++;
            if(i%5==0)
                System.out.println("\n");

        }
        return;
    }

}
