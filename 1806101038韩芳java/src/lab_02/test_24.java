package lab_02;
import java.util.*;

public class test_24 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("请输入日期，格式如20191011：");
        String nu=sca.nextLine();
        String year=nu.substring(0,4);
        String month=nu.substring(4,6);
        String day=nu.substring(6);
        Calendar cal=Calendar.getInstance();
        cal.set(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
        Date date1=cal.getTime();
        System.out.println("请输入日期，格式如20000407：");
        nu=sca.nextLine();
        year=nu.substring(0,4);
        month=nu.substring(4,6);
        day=nu.substring(6);
        cal.set(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
        Date date2=cal.getTime();
        long subday=(date1.getTime()-date2.getTime())/(24*60*60*100);
        if (subday<0)
            subday=(date1.getTime()-date2.getTime())/(24*60*60*100);
        System.out.println("两日期之间相差"+subday+"天");
    }
}
