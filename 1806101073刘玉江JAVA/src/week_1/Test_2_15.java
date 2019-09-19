package week_1;
import java.util.Scanner;
public class Test_2_15 {
    public static void main(String[] args) {
        Scanner scan_input = new Scanner(System.in);
        System.out.println("请输入年份，如2019");
        int year = scan_input.nextInt();
        System.out.println("请输入月份，如08");
        int month = scan_input.nextInt();
        System.out.println("请输入日，如20    ");
        int day = scan_input.nextInt();
        int count = 0;
        int days = 0;
        if (year>0&&month>0&&month<13&&day>0&&day<32){
            for (int i = 1;i<month;i++){
                switch (i){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        days = 31;

                    case 4: case 6: case 9: case 11:
                        days = 30;
                        break;
                    case 2:{
                        if ((year % 4 == 0 && year % 1 != 0) || (year % 400 == 0)){
                            days = 29;
                        }else {days = 28;}
                        break;
                    }
                }
                count = count  +days;
            }
            count = count+day;
            System.out.println(count);
        }
        else {
            System.out.println("输入错误");
        }




    }


}
