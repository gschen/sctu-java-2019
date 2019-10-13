package src.lab_02.Test_24;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
        String clidata = "2019-11-11";
        String clidata2 = "2019-9-11";
        Calendar cFirst = Calendar.getInstance();
        Calendar cSecond = Calendar.getInstance();
        cFirst.setTime(myFormatter.parse(clidata));
        cSecond.setTime(myFormatter.parse(clidata2));
        int days;
        if (cFirst.get(Calendar.DAY_OF_YEAR)>=cSecond.get(Calendar.DAY_OF_YEAR)){
            days = cFirst.get(Calendar.DAY_OF_YEAR) - cSecond.get(Calendar.DAY_OF_YEAR);
        }else {
            days = cSecond.get(Calendar.DAY_OF_YEAR)- cFirst.get(Calendar.DAY_OF_YEAR);
        }
        System.out.println(days);
    }
}
