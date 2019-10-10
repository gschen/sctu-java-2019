package lab_02;

import java.text.SimpleDateFormat;
import java.util.Date;


public class test_23 {
    public static void main(String[] args) throws Exception {

        //设置转换的日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //开始时间
        Date startDate = sdf.parse("2018-05-10");
        //结束时间
        Date endDate = sdf.parse("2019-11-10");

        //得到相差的天数 betweenDate
        long betweenDate = (endDate.getTime() - startDate.getTime())/(60*60*24*1000);

        //打印控制台相差的天数
        System.out.println(betweenDate);
    }

}
