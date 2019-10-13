package labor02.test.Test_24;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个日期（如20190927）：");
        String s = sc.nextLine();
        String year = s.substring(0,4);
        String month = s.substring(4,6);
        String day = s.substring(6);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
        Date date1 = calendar.getTime();
        System.out.println("请输入第二个日期（如20190927）：");
        s = sc.nextLine();
        year = s.substring(0,4);
        month = s.substring(4,6);
        day = s.substring(6);//获取输入时间的年月日
        calendar.set(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
        Date date2 = calendar.getTime();//将获取的年月日转化为日期；
        long  s1 = (date1.getTime()-date2.getTime())/(24*60*60*1000);
        if (s1<0){
            s1 = (date2.getTime()-date1.getTime())/(24*60*60*1000);

            System.out.println("两个日期之差是："+s1+"天");
        }
    }
}
