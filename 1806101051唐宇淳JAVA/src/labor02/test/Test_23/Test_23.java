package labor02.test.Test_23;



import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的生日日期（格式如：2010-09-29）：");
        Calendar calendar = Calendar.getInstance();
        String str = sc.nextLine();
        String year = str.substring(0,4);//这个函数是截取字符串起始位到终止位字符的函数
        String month = str.substring(5,7);
        String day = str.substring(8,str.length()-1);
        calendar.set(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
        //将上面截取的字符转化为整数
        System.out.println("日期对应的是星期几：");
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        switch (week){
            case 1: System.out.println("星期一");break;
            case 2: System.out.println("星期二");break;
            case 3: System.out.println("星期三");break;
            case 4: System.out.println("星期四");break;
            case 5: System.out.println("星期五");break;
            case 6: System.out.println("星期六");break;
            default: System.out.println("星期日");break;
        }
        Date date2 = new Date();
        calendar.set(2019,Integer.parseInt(month),Integer.parseInt(day));
        Date date1 = calendar.getTime();
        long   countDay   =     (date1.getTime()   -  date2.getTime())/(24*60*60*1000);
        if (countDay<0){
            calendar.set(2020,Integer.parseInt(month),Integer.parseInt(day));
            date1 = calendar.getTime();
            countDay = (date1.getTime() - date2.getTime())/(24*60*60*1000);
        }
        System.out.println("距离你的生日还有"+countDay+"天");

    }
}

