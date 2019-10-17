package Lab02.Test24;

import java.util.Calendar;//获取年月日

public class data {
    int day;
    int month;
    int year;

    Calendar cal;

    public data(int day, int month, int year) {
        cal = Calendar.getInstance();
        // month从1开始算起，范围为1~12
        cal.set(year, month - 1, day);
    }

    public void function(data d) {
        // 完成这个方法，计算d 和 this 之间的相差天数。
        Calendar c = (Calendar) d.cal.clone();
        int days = 0;
        if (cal.after(c)) {
            while (cal.after(c)) {
                days++;
                c.add(Calendar.DATE, 1);
            }
        } else if (cal.before(c)) {
            while (cal.before(c)) {
                days++;
                c.add(Calendar.DATE, -1);
            }
        }
        System.out.println("相差天数为：" + days);
    }
    public static void main(String[] args){
        data d1 = new data(21,10,1992);
        data d2 = new data(15,10,1999);
        d1.function(d2);
    }
}
