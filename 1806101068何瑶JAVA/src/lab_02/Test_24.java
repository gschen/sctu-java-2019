package lab_02;
import java.text.SimpleDateFormat;
import java.util.*;
public class Test_24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个日期，格式为20191001");
        String num=scanner.nextLine();
        String year=num.substring(0,4);
        String month=num.substring(4,6);
        String day=num.substring(6);
        Calendar calendar=Calendar.getInstance();
        calendar.set(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
        Date date1=calendar.getTime();
        System.out.println("请输入第二个日期，格式为：20191001");
        num=scanner.nextLine();
        year=num.substring(0,4);
        month=num.substring(4,6);
        day=num.substring(6);
        calendar.set(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
        Date date2=calendar.getTime();
        long SubDay=(date1.getTime()-date2.getTime())/(24*60*60*1000);
        if(SubDay<0)
            SubDay=(date2.getTime()-date1.getTime())/(24*60*60*1000);
        System.out.println("两个日期之间相差"+SubDay+"天");
    }
}
