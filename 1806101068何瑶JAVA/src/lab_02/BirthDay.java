package lab_02;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的生日，格式为：2019-10-1");
        Calendar calendar=Calendar.getInstance();
        String str=scanner.nextLine();
        String year=str.substring(0,4);
        String month=str.substring(5,7);
        String day=str.substring(8);
        calendar.set(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
        System.out.println("输出对应的是星期几：");
        int week=calendar.get(Calendar.DAY_OF_WEEK);
        switch (week){
            case 1:
                System.out.println("MONDAY");break;
            case 2:
            System.out.println("TUESDAY");break;
            case 3:
            System.out.println("WEDNSSDAY");break;
            case 4:
            System.out.println("THESDAY");break;
            case 5:
            System.out.println("FIRDAY");break;
            case 6:
            System.out.println("SATUATDAY");break;
            default:
                System.out.println("SUNDAY");break;
        }
        Date date2=new Date();
        calendar.set(2012,Integer.parseInt(month),Integer.parseInt(day));
        Date date1=calendar.getTime();
        long countDay=(date1.getTime()-date2.getTime())/(24*60*60*1000);
        if (countDay<0){
            calendar.set(2013,Integer.parseInt(month),Integer.parseInt(day));
            date1=calendar.getTime();
            countDay=(date1.getTime()-date2.getTime())/(24*60*60*1000);
        }
        System.out.println("距离你的生日还有"+countDay+"天。");
    }
}
