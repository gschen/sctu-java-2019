package Lab_02.Test_023;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

//23、 	编写Java应用程序，从命令行输入你的生日信息，然后计算你的生日还有多少天，你的生日是星期几。
public class Test {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的生日(格式为yyyy-MM-dd)：");
        String clidate = scanner.next();
        Calendar cToday = Calendar.getInstance(); // 获取今日  抽象类无法实例化API提供了getInstance方法进行实例化
        Calendar cBirth = Calendar.getInstance(); // 存生日
        cBirth.setTime(sdf.parse(clidate)); // 设置生日
        cBirth.set(Calendar.YEAR, cToday.get(Calendar.YEAR)); // 修改为本年
        System.out.println(Calendar.YEAR);
        int days;
        if (cBirth.get(Calendar.DAY_OF_YEAR) < cToday.get(Calendar.DAY_OF_YEAR)) {
            // 小于当前天数说明生日已经过去
            days = cToday.getActualMaximum(Calendar.DAY_OF_YEAR) - cToday.get(Calendar.DAY_OF_YEAR);//计算出一年开头到生日的时间
            days += cBirth.get(Calendar.DAY_OF_YEAR);//加上今年已经过完生日剩下的时间
        } else {

            days = cBirth.get(Calendar.DAY_OF_YEAR) - cToday.get(Calendar.DAY_OF_YEAR);
        }
        if (days == 0) {
            System.out.println("今天生日");
        } else {
            System.out.println("距离生日还有：" + days + "天");
        }
        int i =cBirth.get(Calendar.DAY_OF_WEEK);
        switch (i){
            case 1:
                System.out.println("你今年的生日为星期天");
                break;
            case 2:
                System.out.println("你今年的生日为星期一");
                break;
            case 3:
                System.out.println("你今年的生日为星期二");
                break;
            case 4:
                System.out.println("你今年的生日为星期三");
                break;
            case 5:
                System.out.println("你今年的生日为星期四");
                break;
            case 6:
                System.out.println("你今年的生日为星期五");
                break;
            case 7:
                System.out.println("你今年的生日为星期六");
                break;
            default:
                break;

        }

    }
}
