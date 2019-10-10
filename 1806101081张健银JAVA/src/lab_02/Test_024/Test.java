package lab_02.Test_024;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

//24、 	编程实现：计算两个日期的天数之差。编写Java应用程序，来计算任意两个日期的天数之差。
//        要求：两个日期用字符串形式输入（比如输入“20100101”表示2010年1月1日），需要将日期字符串的年、月、日分别转换为数字形式
public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        System.out.println("请输入两个时间（格式为：yyyy-mm-dd）");
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        String str = s.nextLine();
        String str1 = s1.nextLine();
        Calendar oday = Calendar.getInstance();
        Calendar tday = Calendar.getInstance();
        oday.setTime(sdf.parse(str));
        tday.setTime(sdf.parse(str1));
        System.out.println("天数之差为："+Math.abs(oday.get(Calendar.DAY_OF_YEAR) - tday.get(Calendar.DAY_OF_YEAR)));

    }

}
