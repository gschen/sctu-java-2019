package lab_02.Test_24;

import java.util.Calendar;
import java.util.Scanner;

/*
计算两个日期的天数之差。2019 09 06
 */
public class Test_24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入日期格式为“20190601”");
        String str=scanner.next();
        int year=Integer.valueOf(str.substring(0,4));
        int month=Integer.valueOf(str.substring(4,6));
        int date=Integer.valueOf(str.substring(6,8));
        System.out.println(year+" "+month+" "+date);

        String str2=scanner.next();
        int year2=Integer.valueOf(str2.substring(0,4));
        int month2=Integer.valueOf(str2.substring(4,6));
        int date2=Integer.valueOf(str2.substring(6,8));
        System.out.println(year2+" "+month2+" "+date2);

        //设置当前时间，并将其转化为毫秒
        Calendar calendar1=Calendar.getInstance();
        calendar1.set(year,month,date);
        long mis1=calendar1.getTime().getTime();

        Calendar calendar2=Calendar.getInstance();
        calendar2.set(year2,month2,date2);
        long mis2=calendar2.getTime().getTime();

        long between_day=(mis2-mis1)/(1000*60*60*24);
        System.out.println("相差"+between_day+"天");
    }


}
